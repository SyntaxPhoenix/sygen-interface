package com.syntaxphoenix.bundles.generator.api.registry.adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.bundles.generator.api.registry.IRegistry;
import com.syntaxphoenix.bundles.generator.api.registry.Registry;
import com.syntaxphoenix.syntaxapi.command.ArgumentMap;
import com.syntaxphoenix.syntaxapi.nbt.NbtCompound;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;
import com.syntaxphoenix.syntaxapi.utils.key.INamespace;
import com.syntaxphoenix.syntaxapi.utils.key.Namespace;

public class RegistryHandler<E extends IRegisterable<E>> implements IRegistry<E> {

	protected final List<RegistryAdapter<E>> adapters = Collections.synchronizedList(new ArrayList<>());

	private final Registry<E, ?> registry;

	public RegistryHandler(Registry<E, ?> registry) {
		this.registry = registry;
	}

	public Registry<E, ?> getRegistry() {
		return registry;
	}

	public boolean register(RegistryAdapter<E> adapter) {
		return adapter != null && !isRegistered(adapter.getNamespace()) && adapters.add(adapter);
	}

	@Override
	public boolean register(E object) {
		return registry.register(object);
	}

	public boolean isRegistered(INamespace<?> namespace) {
		return namespace != null && adapters.stream().anyMatch(adapter -> adapter.getNamespace().isSimilar(namespace));
	}

	@Override
	public boolean isRegistered(IKey key) {
		return registry.isRegistered(key);
	}

	public Optional<RegistryAdapter<E>> getAdapter(String namespace) {
		return getAdapter(Namespace.of(namespace));
	}

	public Optional<RegistryAdapter<E>> getAdapter(INamespace<?> namespace) {
		return adapters.stream().filter(adapter -> adapter.getNamespace().isSimilar(namespace)).findFirst();
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
	public Optional<E> get(IKey key, ArgumentMap arguments) {
		Optional<E> option = registry.get(key, arguments);
		return option.isPresent() ? option : build(key, arguments);
	}

	public Optional<E> build(IKey key) {
		Optional<RegistryAdapter<E>> option = getAdapter(key.getNamespace());
		if (!option.isPresent()) {
			return Optional.empty();
		}
		RegistryAdapter<E> adapter = option.get();
		if (!adapter.isInstance(key)) {
			return Optional.empty();
		}
		return Optional.ofNullable(adapter.build(key));
	}

	public Optional<E> build(IKey key, ArgumentMap map) {
		Optional<RegistryAdapter<E>> option = getAdapter(key.getNamespace());
		if (!option.isPresent()) {
			return Optional.empty();
		}
		RegistryAdapter<E> adapter = option.get();
		if (!adapter.isInstance(key)) {
			return Optional.empty();
		}
		return Optional.ofNullable(adapter.build(key, map));
	}

	public Optional<E> build(IKey key, NbtCompound compound) {
		Optional<RegistryAdapter<E>> option = getAdapter(key.getNamespace());
		if (!option.isPresent()) {
			return Optional.empty();
		}
		RegistryAdapter<E> adapter = option.get();
		if (!adapter.isInstance(key)) {
			return Optional.empty();
		}
		return Optional.ofNullable(adapter.build(key, compound));
	}

}
