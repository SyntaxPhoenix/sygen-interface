package com.syntaxphoenix.bundles.generator.impl.rule.section;

public final class StaticSection extends Section {

	private final double noise;

	public StaticSection(double min, double max, double noise) {
		super(min, max);
		this.noise = noise;
	}

	@Override
	public double getNoiseFor(double originalNoise) {
		return noise;
	}

}
