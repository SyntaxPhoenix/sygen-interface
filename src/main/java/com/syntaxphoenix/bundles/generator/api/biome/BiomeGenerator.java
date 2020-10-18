package com.syntaxphoenix.bundles.generator.api.biome;

public interface BiomeGenerator {

	Biome getBiome(int x, int z);

	double getNoise(int x, int z);

}
