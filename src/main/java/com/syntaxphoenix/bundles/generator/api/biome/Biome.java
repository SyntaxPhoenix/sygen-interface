package com.syntaxphoenix.bundles.generator.api.biome;

import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.syntaxapi.utils.key.AbstractKeyed;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class Biome extends AbstractKeyed implements IRegisterable<Biome> {

	public Biome(IKey key) {
		super(key);
	}
	
	public abstract BiomeAdapter getAdapter();

}
