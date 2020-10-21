package com.syntaxphoenix.bundles.generator.api.noise;

@FunctionalInterface
public interface NoiseRuleFunction {
	
	double apply(double originalNoise, double currentNoise, int x, int z);

}
