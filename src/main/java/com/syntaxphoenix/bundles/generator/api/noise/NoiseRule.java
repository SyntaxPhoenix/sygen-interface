package com.syntaxphoenix.bundles.generator.api.noise;

public interface NoiseRule extends NoiseRuleFunction {

	boolean isApplyable(double originalNoise);

}
