package com.syntaxphoenix.bundles.generator.api.noise;

public interface NoiseRule {

	boolean isApplyable(double originalNoise);

	double apply(double originalNoise, double currentNoise, int x, int z);

}
