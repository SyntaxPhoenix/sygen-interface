package com.syntaxphoenix.bundles.generator.impl.rule.section;

public final class SmoothSection extends Section {

	private final double range;
	private final double valueMin;
	private final double valueRange;

	public SmoothSection(double min, double max, double valueMin, double valueMax) {
		super(min, max);
		this.range = max - min;
		this.valueMin = valueMin;
		this.valueRange = valueMax - valueMin;
	}

	@Override
	public double getNoiseFor(double originalNoise) {
		return valueMin + ((1.0D / range) * (originalNoise - min) * valueRange);
	}

}
