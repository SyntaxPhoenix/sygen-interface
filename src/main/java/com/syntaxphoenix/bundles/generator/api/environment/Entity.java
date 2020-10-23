package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class Entity extends WorldObject<Entity> implements IRegisterable<Entity> {

	public Entity(IKey key) {
		super(key);
	}
	
	public abstract String getName();
	
	public abstract void setName(String name);
	
	public abstract EntityAdapter getAdapter();

}
