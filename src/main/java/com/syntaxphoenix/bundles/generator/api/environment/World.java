package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.syntaxapi.utils.key.AbstractKeyed;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class World<T> extends AbstractKeyed {
	
	public World(IKey key) {
		super(key);
	}

	public abstract T getHandle();
	
	public abstract long getSeed();

}
