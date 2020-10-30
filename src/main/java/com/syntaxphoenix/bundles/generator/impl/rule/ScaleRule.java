package com.syntaxphoenix.bundles.generator.impl.rule;

import com.syntaxphoenix.bundles.generator.api.noise.HeightNoiseRule;

public class ScaleRule extends HeightNoiseRule {

	private final double scale;

	public ScaleRule(double scale, double heightMin, double heightMax) {
		super(heightMin, heightMax);
		this.scale = scale;
	}

	@Override
	public double apply(double originalNoise, double currentNoise, int x, int z) {
		double difference = originalNoise - heightMin;
		return currentNoise + ((difference * scale) - difference);
	}

}