package com.syntaxphoenix.bundles.generator.impl.rule;

import com.syntaxphoenix.bundles.generator.api.noise.HeightNoiseRule;
import com.syntaxphoenix.bundles.generator.api.noise.NoiseProvider;

public class AddNoiseRule extends HeightNoiseRule {

	private final NoiseProvider provider;

	public AddNoiseRule(NoiseProvider provider, double heightMin, double heightMax) {
		super(heightMin, heightMax);
		this.provider = provider;
	}

	@Override
	public double apply(double originalNoise, double currentNoise, int x, int z) {
		double addNoise = this.provider.getNoise(x, z);
		if (addNoise < 0.0D) {
			return currentNoise;
		}
		return currentNoise + addNoise;
	}

}