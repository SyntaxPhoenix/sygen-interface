package com.syntaxphoenix.bundles.generator.api.noise;

import java.util.function.Predicate;

public class FunctionalRule implements NoiseRule {

	protected final NoiseRuleFunction function;
	protected final Predicate<Double> predicate;

	public FunctionalRule(NoiseRuleFunction function) {
		this(function, value -> true);
	}

	public FunctionalRule(NoiseRuleFunction function, Predicate<Double> predicate) {
		this.function = function;
		this.predicate = predicate;
	}

	@Override
	public double apply(double originalNoise, double currentNoise, int x, int z) {
		return function.apply(originalNoise, currentNoise, x, z);
	}

	@Override
	public boolean isApplyable(double originalNoise) {
		return predicate.test(originalNoise);
	}

}
