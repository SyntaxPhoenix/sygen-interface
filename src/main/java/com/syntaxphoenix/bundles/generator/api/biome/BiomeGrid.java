package com.syntaxphoenix.bundles.generator.api.biome;

import com.syntaxphoenix.bundles.generator.api.Seeded;

public interface BiomeGrid extends Seeded {

	int getWidth();

	int getHeight();

	Biome getBiomeAt(int x, int y);

}
