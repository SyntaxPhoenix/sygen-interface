package com.syntaxphoenix.bundles.generator.api.noise;

import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class SimpleNoiseGenerator extends NoiseGenerator {

	protected double height;
	protected double multiplierX;
	protected double multiplierZ;

	public SimpleNoiseGenerator(IKey key) {
		super(key);
	}

	@Override
	public void setBaseHeight(double height) {
		this.height = height;
	}

	@Override
	public void setMultiplierX(double multiplierX) {
		this.multiplierX = multiplierX;
	}

	@Override
	public void setMultiplierZ(double multiplierZ) {
		this.multiplierZ = multiplierZ;
	}

	@Override
	public double getBaseHeight() {
		return height;
	}

	@Override
	public double getMultiplierX() {
		return multiplierX;
	}

	@Override
	public double getMultiplierZ() {
		return multiplierZ;
	}

	@Override
	public double getNoise(int x, int z) {
		return generateNoiseAt((float) (x * multiplierX), (float) (z * multiplierZ)) + height;
	}

	protected abstract double generateNoiseAt(float x, float z);

}
