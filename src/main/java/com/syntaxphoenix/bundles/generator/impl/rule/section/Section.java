package com.syntaxphoenix.bundles.generator.impl.rule.section;

public abstract class Section {

	protected final double min;
	protected final double max;

	public Section(double min, double max) {
		this.min = min;
		this.max = max;
	}

	public double getMax() {
		return max;
	}

	public double getMin() {
		return min;
	}

	public abstract double getNoiseFor(double originalNoise);

}
