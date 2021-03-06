package com.syntaxphoenix.bundles.generator.api.registry.adapter;

import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.syntaxapi.command.ArgumentMap;
import com.syntaxphoenix.syntaxapi.nbt.NbtCompound;
import com.syntaxphoenix.syntaxapi.utils.key.AbstractNamespaced;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;
import com.syntaxphoenix.syntaxapi.utils.key.INamespace;

public abstract class RegistryAdapter<E extends IRegisterable<E>> extends AbstractNamespaced {

	public RegistryAdapter(INamespace<?> namespace) {
		super(namespace);
	}

	public abstract boolean isInstance(IKey key);
	
	public abstract boolean isInstance(E object);

	public E build(IKey key) {
		return build(key, ArgumentMap.EMPTY);
	}

	public abstract E build(IKey key, ArgumentMap data);

	public abstract E build(IKey key, NbtCompound data);

	public abstract NbtCompound toNbt(E object);

}
