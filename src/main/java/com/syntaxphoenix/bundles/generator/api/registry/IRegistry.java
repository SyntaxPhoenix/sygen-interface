package com.syntaxphoenix.bundles.generator.api.registry;

import java.util.Optional;

import com.syntaxphoenix.bundles.generator.api.registry.argument.IArgumentMap;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public interface IRegistry<E extends IRegisterable<E>> {
	
	boolean register(E object);
	
	boolean isRegistered(IKey key);
	
	E getOrDefault(IKey key, E fallback);
	
	E getOrDefault(IKey key, IArgumentMap arguments, E fallback);
	
	Optional<E> get(IKey key);
	
	Optional<E> get(IKey key, IArgumentMap arguments);
	
}
