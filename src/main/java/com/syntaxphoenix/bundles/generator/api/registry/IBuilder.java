package com.syntaxphoenix.bundles.generator.api.registry;

import com.syntaxphoenix.bundles.generator.api.registry.argument.IArgumentMap;
import com.syntaxphoenix.syntaxapi.utils.key.IKeyed;

@FunctionalInterface
public interface IBuilder<V extends IKeyed> {
	
	V build(IArgumentMap arguments);
	
}
