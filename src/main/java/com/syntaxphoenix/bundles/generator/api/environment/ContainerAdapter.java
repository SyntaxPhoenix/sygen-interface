package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class ContainerAdapter<H> extends ObjectAdapter<Container> {

	public ContainerAdapter(IKey key) {
		super(key);
	}

	public abstract Container createContainer(int size);

	public abstract Container toContainer(H handle);

	public abstract H fromContainer(Container container);
	
}
