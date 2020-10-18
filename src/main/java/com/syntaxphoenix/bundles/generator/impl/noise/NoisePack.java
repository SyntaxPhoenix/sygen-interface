package com.syntaxphoenix.bundles.generator.impl.noise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import com.syntaxphoenix.bundles.generator.api.noise.NoiseProvider;
import com.syntaxphoenix.bundles.generator.api.noise.NoiseRule;

public final class NoisePack implements NoiseProvider {

	private final NoiseProvider provider;
	private final ArrayList<NoiseRule> rules = new ArrayList<>();

	public NoisePack(NoiseProvider provider, NoiseRule... rules) {
		this.provider = Objects.requireNonNull(provider);
		Collections.addAll(this.rules, rules);
	}

	public NoiseProvider getProvider() {
		return provider;
	}

	public NoiseRule[] getRules() {
		return rules.toArray(new NoiseRule[0]);
	}

	@Override
	public void setSeed(long seed) {
		provider.setSeed(seed);
	}

	@Override
	public long getSeed() {
		return provider.getSeed();
	}

	@Override
	public double getNoise(int x, int z) {
		double originalNoise = provider.getNoise(x, z);
		double currentNoise = originalNoise;
		for (NoiseRule rule : rules) {
			if (!rule.isApplyable(originalNoise)) {
				continue;
			}
			currentNoise = rule.apply(originalNoise, currentNoise, x, z);
		}
		return currentNoise;
	}

}
