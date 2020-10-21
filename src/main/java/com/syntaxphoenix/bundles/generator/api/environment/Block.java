package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class Block extends WorldObject<Block> implements IRegisterable<Block> {

	public Block(IKey key) {
		super(key);
	}
	
	public abstract BlockAdapter<?> getAdapter();
	
}
