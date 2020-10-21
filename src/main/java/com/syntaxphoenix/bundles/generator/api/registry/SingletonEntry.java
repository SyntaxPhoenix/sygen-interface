package com.syntaxphoenix.bundles.generator.api.registry;

import com.syntaxphoenix.syntaxapi.command.ArgumentMap;

public class SingletonEntry<V extends IRegisterable<V>> extends RegistryEntry<V> {

	public SingletonEntry(V value) {
		super(value);
	}

	public V getSingleton() {
		return value;
	}

	@Override
	public V buildValue(ArgumentMap map) {
		return value;
	}

}
