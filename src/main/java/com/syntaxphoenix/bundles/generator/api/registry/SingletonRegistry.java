package com.syntaxphoenix.bundles.generator.api.registry;

import java.util.Optional;

import com.syntaxphoenix.syntaxapi.command.ArgumentMap;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public class SingletonRegistry<E extends IRegisterable<E>> extends Registry<E, SingletonEntry<E>> {

	@Override
	public Optional<E> get(IKey key, ArgumentMap arguments) {
		return entries.stream().filter(object -> object.getKey().isSimilar(key)).findFirst().map(SingletonEntry::getSingleton);
	}

	@Override
	protected SingletonEntry<E> buildEntry(E value) {
		return new SingletonEntry<>(value);
	}

}
