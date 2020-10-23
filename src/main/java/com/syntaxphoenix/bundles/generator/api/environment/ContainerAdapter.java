package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class ContainerAdapter extends ObjectAdapter<Container, ContainerAdapter> {

	public ContainerAdapter(IKey key) {
		super(key);
	}

	public abstract Container createContainer(int size);

	public abstract Container toContainer(Object handle);

	public abstract Object fromContainer(Container container);
	
}
