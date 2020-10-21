package com.syntaxphoenix.bundles.generator.api.entity;

import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.syntaxapi.utils.key.AbstractKeyed;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class Entity extends AbstractKeyed implements IRegisterable<Entity> {

	public Entity(IKey key) {
		super(key);
	}

}
