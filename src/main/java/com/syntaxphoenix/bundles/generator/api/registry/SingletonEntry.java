package com.syntaxphoenix.bundles.generator.api.registry;

import com.syntaxphoenix.bundles.generator.api.registry.argument.IArgumentMap;

public class SingletonEntry<V extends IRegisterable<V>> extends RegistryEntry<V> {

	public SingletonEntry(V value) {
		super(value);
	}

	public V getSingleton() {
		return value;
	}

	@Override
	public V buildValue(IArgumentMap map) {
		return value;
	}

}
