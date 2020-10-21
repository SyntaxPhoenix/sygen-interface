package com.syntaxphoenix.bundles.generator.api.block;

import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.syntaxapi.utils.key.AbstractKeyed;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class Block extends AbstractKeyed implements IRegisterable<Block> {

	public Block(IKey key) {
		super(key);
	}

}
