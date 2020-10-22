package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.syntaxapi.utils.key.AbstractKeyed;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class ObjectAdapter<T extends WorldObject<T>> extends AbstractKeyed implements IRegisterable<ObjectAdapter<T>> {

	public ObjectAdapter(IKey key) {
		super(key);
	}

}
