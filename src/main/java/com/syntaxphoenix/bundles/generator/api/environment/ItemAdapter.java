package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class ItemAdapter extends ObjectAdapter<Item, ItemAdapter> {

	public ItemAdapter(IKey key) {
		super(key);
	}

	public abstract Item buildItem(int amount);

	public abstract Object fromItem(Item item);

	public abstract Item toItem(Object handle);

}
