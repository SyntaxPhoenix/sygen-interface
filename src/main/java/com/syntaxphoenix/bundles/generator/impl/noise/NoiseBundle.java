package com.syntaxphoenix.bundles.generator.impl.noise;

import java.util.ArrayList;
import java.util.Collections;

import com.syntaxphoenix.bundles.generator.api.noise.NoiseProvider;

public final class NoiseBundle implements NoiseProvider {

	private final ArrayList<NoiseProvider> providers = new ArrayList<>();
	private double baseHeight = 0.0D;

	public NoiseBundle(double baseHeight, NoiseProvider... providers) {
		this.baseHeight = baseHeight;
		Collections.addAll(this.providers, providers);
	}

	public NoiseProvider[] getProviders() {
		return providers.toArray(new NoiseProvider[0]);
	}

	public void setBaseHeight(double baseHeight) {
		this.baseHeight = baseHeight;
	}

	public double getBaseHeight() {
		return baseHeight;
	}

	@Override
	public void setSeed(long seed) {
		providers.forEach(provider -> provider.setSeed(seed));
	}

	@Override
	public long getSeed() {
		return providers.stream().findFirst().map(NoiseProvider::getSeed).orElse(0L);
	}

	@Override
	public double getNoise(int x, int z) {
		double noise = 0;
		for (NoiseProvider provider : providers) {
			noise += provider.getNoise(x, z);
		}
		return noise;
	}

}
