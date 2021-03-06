package com.syntaxphoenix.bundles.generator.api.registry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.syntaxphoenix.syntaxapi.command.ArgumentMap;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class Registry<E extends IRegisterable<E>, R extends RegistryEntry<E>> implements IRegistry<E> {

	protected final List<R> entries = Collections.synchronizedList(new ArrayList<>());

	public boolean register(E object) {
		return object != null && !isRegistered(object.getKey()) && entries.add(buildEntry(object));
	}

	public boolean isRegistered(IKey key) {
		return key != null && entries.stream().anyMatch(object -> object.getKey().isSimilar(key));
	}

	@Override
	public E getOrDefault(IKey key, E fallback) {
		return get(key).orElse(fallback);
	}

	@Override
	public E getOrDefault(IKey key, ArgumentMap arguments, E fallback) {
		return get(key, arguments).orElse(fallback);
	}

	@Override
	public Optional<E> get(IKey key) {
		return get(key, ArgumentMap.EMPTY);
	}

	@Override
	public abstract Optional<E> get(IKey key, ArgumentMap arguments);

	protected abstract R buildEntry(E object);

}
