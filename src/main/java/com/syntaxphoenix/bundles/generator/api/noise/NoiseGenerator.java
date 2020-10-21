package com.syntaxphoenix.bundles.generator.api.noise;

import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.syntaxapi.utils.key.AbstractKeyed;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class NoiseGenerator extends AbstractKeyed implements NoiseProvider, IRegisterable<NoiseGenerator> {

	public NoiseGenerator(IKey key) {
		super(key);
	}

	public abstract void setBaseHeight(double height);

	public abstract double getBaseHeight();

	public abstract void setMultiplierX(double multiplier);

	public abstract double getMultiplierX();

	public abstract void setMultiplierZ(double multiplier);

	public abstract double getMultiplierZ();

}
