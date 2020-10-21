package com.syntaxphoenix.bundles.generator.api.registry;

import com.syntaxphoenix.syntaxapi.command.ArgumentMap;

public class ConstructEntry<V extends IRegisterable<V>> extends RegistryEntry<V> {
	
	protected final IBuilder<V> builder;
	
	public ConstructEntry(V value) {
		super(value);
		this.builder = value.getBuilder();
	}

	@Override
	public V buildValue(ArgumentMap arguments) {
		return builder.build(arguments);
	}

}
