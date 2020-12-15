package com.syntaxphoenix.bundles.generator.api.noise;

import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class SimpleNoiseGenerator extends NoiseGenerator {

	protected double heightMultiplier = 0;
	protected double multiplierX = 0;
	protected double multiplierZ = 0;

	public SimpleNoiseGenerator(IKey key) {
		super(key);
	}

	@Override
	public void setHeightMultiplier(double heightMultiplier) {
		this.heightMultiplier = heightMultiplier;
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
	public double getHeightMultiplier() {
		return heightMultiplier;
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
		return generateNoiseAt((float) (x * multiplierX), (float) (z * multiplierZ)) * heightMultiplier;
	}

	protected abstract double generateNoiseAt(float x, float z);

}
