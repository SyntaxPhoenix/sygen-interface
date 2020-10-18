package com.syntaxphoenix.bundles.generator.api.noise;

public interface NoiseGenerator extends NoiseProvider {

	void setBaseHeight(double height);

	double getBaseHeight();

	void setMultiplierX(double multiplier);

	double getMultiplierX();

	void setMultiplierZ(double multiplier);

	double getMultiplierZ();

}
