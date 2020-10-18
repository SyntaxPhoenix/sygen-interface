package com.syntaxphoenix.bundles.generator.impl.noise;

import java.util.ArrayList;
import java.util.Collections;

import com.syntaxphoenix.bundles.generator.api.noise.NoiseProvider;

public final class NoiseBundle implements NoiseProvider {

	private final ArrayList<NoiseProvider> providers = new ArrayList<>();

	public NoiseBundle(NoiseProvider... providers) {
		Collections.addAll(this.providers, providers);
	}

	public final NoiseProvider[] getProviders() {
		return providers.toArray(new NoiseProvider[0]);
	}

	public void setSeed(long seed) {
		providers.forEach(provider -> provider.setSeed(seed));
	}

	public long getSeed() {
		return providers.stream().findFirst().map(NoiseProvider::getSeed).orElse(0L);
	}

	public double getNoise(int x, int z) {
		double noise = 0;
		for (NoiseProvider provider : providers) {
			noise += provider.getNoise(x, z);
		}
		return noise;
	}

}
