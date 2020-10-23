package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.syntaxapi.utils.key.AbstractKeyed;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class ObjectAdapter<T extends WorldObject<T>, S extends ObjectAdapter<T, S>> extends AbstractKeyed implements IRegisterable<S> {

	public ObjectAdapter(IKey key) {
		super(key);
	}

}
