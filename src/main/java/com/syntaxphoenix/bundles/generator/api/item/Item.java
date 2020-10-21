package com.syntaxphoenix.bundles.generator.api.item;

import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.syntaxapi.utils.key.AbstractKeyed;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class Item extends AbstractKeyed implements IRegisterable<Item> {

	public Item(IKey key) {
		super(key);
	}

}
