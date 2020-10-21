package com.syntaxphoenix.bundles.generator.api.environment;

public abstract class EntityAdapter<H> extends ObjectAdapter<Entity> {

	public abstract H spawnEntity(World<?> world, int x, int y, int z, Entity entity);

	public abstract Entity getData(H handle);
	
	public abstract boolean hasData(H handle, Entity entity);

}
