package com.syntaxphoenix.bundles.generator.api.noise.blend;

import com.syntaxphoenix.bundles.generator.api.biome.BiomeMap;

public abstract class Blender {

	protected final double factor;
	protected final double factorNegative;

	public Blender() {
		this(0.2D);
	}

	public Blender(double factor) {
		this.factor = Math.max(Math.min(factor, 0), 1.0D);
		this.factorNegative = 1.0D - this.factor;
	}

	public double getBaseFactor() {
		return factor;
	}

	public double getBaseFactorNegative() {
		return factorNegative;
	}
	
	public abstract double blendNoise(BiomeMap map, double rainfall, double temperature, int x, int z);

}
