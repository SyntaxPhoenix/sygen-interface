package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class ItemAdapter<H> extends ObjectAdapter<Item> {
	
	public ItemAdapter(IKey key) {
		super(key);
	}

	public abstract Item buildItem(int amount);
	
	public abstract H fromItem(Item item);
	
	public abstract Item toItem(H handle);
	
}
