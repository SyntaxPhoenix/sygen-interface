package com.syntaxphoenix.bundles.generator.api.noise;

import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class SimpleNoiseGenerator extends NoiseGenerator {

	protected double height = 0;
	protected double multiplierX = 0;
	protected double multiplierZ = 0;

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
		System.out.println("t: " + (getKey().getKey()) + "/ o: " + this);
		System.out.println("x: " + x + "/ z:" + z);
		System.out.println("mX: " + multiplierX + "/ mZ: " + multiplierZ + "/ h: " + height);
		System.out.println(
			"eX " + (x * multiplierX) + " <-> vX: " + ((float) (x * multiplierX)) + "/ eZ " + (z * multiplierZ) + " <-> vZ: " + ((float) (z * multiplierZ)));
		double noise = generateNoiseAt((float) (x * multiplierX), (float) (z * multiplierZ));
		System.out.println("gN: " + noise + "/ hN: " + (noise + height));
		return noise + height;
	}

	protected abstract double generateNoiseAt(float x, float z);

}
