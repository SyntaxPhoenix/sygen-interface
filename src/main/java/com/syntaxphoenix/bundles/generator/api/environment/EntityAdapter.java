package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class EntityAdapter<H> extends ObjectAdapter<Entity> {

	public EntityAdapter(IKey key) {
		super(key);
	}

	public abstract H spawnEntity(World<?> world, int x, int y, int z, Entity entity);
	
	public abstract H dropItem(World<?> world, int x, int y, int z, Item item);

	public abstract Entity getData(H handle);
	
	public abstract boolean hasData(H handle, Entity entity);

}
