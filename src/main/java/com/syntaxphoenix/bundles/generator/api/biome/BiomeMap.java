package com.syntaxphoenix.bundles.generator.api.biome;

import com.syntaxphoenix.bundles.generator.api.Seeded;
import com.syntaxphoenix.bundles.generator.impl.biome.BiomePack;

public interface BiomeMap extends Seeded {
	
	BiomePack getPack(Biome biome);
	
	BiomeGrid getGrid();

}
