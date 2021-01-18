package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class EntityAdapter extends ObjectAdapter<Entity, EntityAdapter> {

	public EntityAdapter(IKey key) {
		super(key);
	}

	public abstract Object spawnEntity(Area<?> world, int x, int y, int z, Entity entity);

	public abstract Object dropItem(Area<?> world, int x, int y, int z, Item item);

	public abstract Entity getData(Object handle);

	public abstract boolean hasData(Object handle, Entity entity);

}
