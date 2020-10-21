package com.syntaxphoenix.bundles.generator.api.registry;

import com.syntaxphoenix.syntaxapi.command.ArgumentMap;
import com.syntaxphoenix.syntaxapi.utils.key.IKeyed;

@FunctionalInterface
public interface IBuilder<V extends IKeyed> {
	
	V build(ArgumentMap arguments);
	
}
