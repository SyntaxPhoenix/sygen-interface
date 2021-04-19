package com.syntaxphoenix.bundles.generator.api.registry;

import com.syntaxphoenix.bundles.generator.api.registry.argument.IArgumentMap;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;
import com.syntaxphoenix.syntaxapi.utils.key.IKeyed;

public abstract class RegistryEntry<V extends IRegisterable<V>> implements IKeyed {

	protected final V value;

	public RegistryEntry(V value) {
		this.value = value;
	}

	public abstract V buildValue(IArgumentMap arguments);

	@Override
	public IKey getKey() {
		return value.getKey();
	}

}
