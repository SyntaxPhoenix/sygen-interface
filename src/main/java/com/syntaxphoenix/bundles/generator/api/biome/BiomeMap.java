package com.syntaxphoenix.bundles.generator.api.biome;

import com.syntaxphoenix.bundles.generator.impl.biome.BiomePack;

public interface BiomeMap {
	
	BiomePack getPack(Biome biome);
	
	BiomeGrid getGrid();

}
