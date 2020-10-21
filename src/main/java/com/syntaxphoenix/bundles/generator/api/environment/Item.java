package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class Item extends WorldObject<Item> implements IRegisterable<Item> {

	public Item(IKey key) {
		super(key);
	}
	
	public abstract ItemAdapter<?> getAdapter();

}
