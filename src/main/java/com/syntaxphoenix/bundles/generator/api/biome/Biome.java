package com.syntaxphoenix.bundles.generator.api.biome;

import com.syntaxphoenix.bundles.generator.api.noise.NoiseProvider;

public interface Biome {

	String getName();

	NoiseProvider getNoiseProvider();

}
