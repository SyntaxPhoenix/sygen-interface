package com.syntaxphoenix.bundles.generator.api.biome;

import com.syntaxphoenix.bundles.generator.api.noise.NoiseProvider;

public interface BiomePackage {
	
	Biome getBiome();
	
	NoiseProvider getNoiseProvider();
	
}
