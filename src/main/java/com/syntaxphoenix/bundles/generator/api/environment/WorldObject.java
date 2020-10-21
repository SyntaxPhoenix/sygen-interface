package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.syntaxapi.utils.key.AbstractKeyed;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class WorldObject<T> extends AbstractKeyed {

	public WorldObject(IKey key) {
		super(key);
	}

}
