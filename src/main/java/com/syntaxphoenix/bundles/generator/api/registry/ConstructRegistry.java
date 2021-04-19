package com.syntaxphoenix.bundles.generator.api.registry;

import java.util.Optional;

import com.syntaxphoenix.bundles.generator.api.registry.argument.IArgumentMap;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public class ConstructRegistry<E extends IRegisterable<E>> extends Registry<E, ConstructEntry<E>> {

	@Override
	public Optional<E> get(IKey key, IArgumentMap arguments) {
		return entries.stream().filter(object -> object.getKey().isSimilar(key)).findFirst().map(entry -> entry.buildValue(arguments));
	}

	@Override
	protected ConstructEntry<E> buildEntry(E object) {
		return new ConstructEntry<>(object);
	}

}
