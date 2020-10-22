package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class Container extends WorldObject<Container> {

	public Container(IKey key) {
		super(key);
	}

	public abstract ContainerAdapter<?> getAdapter();

	public abstract int getSize();

	public abstract int getRowSize();

	public abstract void set(int slot, Item item);

	public void set(int row, int slot, Item item) {
		set(slot + (getRowSize() * row), item);
	}

	public abstract Item get(int slot);

	public Item get(int row, int slot) {
		return get(slot + (getRowSize() * row));
	}

}
