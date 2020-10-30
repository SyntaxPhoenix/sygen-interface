package com.syntaxphoenix.bundles.generator.api.biome;

public interface BiomeGrid {

	int getWidth();

	int getHeight();

	Biome getBiomeAt(int x, int y);

}
