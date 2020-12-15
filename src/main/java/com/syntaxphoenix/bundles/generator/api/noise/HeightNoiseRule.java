package com.syntaxphoenix.bundles.generator.api.noise;

public abstract class HeightNoiseRule implements NoiseRule {

	protected final double heightMin;
	protected final double heightMax;

	public HeightNoiseRule(double heightMin, double heightMax) {
		this.heightMin = heightMin;
		this.heightMax = heightMax;
	}

}
