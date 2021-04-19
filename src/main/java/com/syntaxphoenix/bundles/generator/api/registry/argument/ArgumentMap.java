package com.syntaxphoenix.bundles.generator.api.registry.argument;

import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;

public class ArgumentMap implements IArgumentMap {

    private final HashMap<String, Object> map = new HashMap<>();

    public boolean has(String key) {
        return map.containsKey(key);
    }

    public boolean has(String key, Class<?> type) {
        Object object = map.get(key);
        return object != null && type.isInstance(object);
    }

    public Optional<Object> get(String key) {
        return Optional.ofNullable(map.get(key));
    }

    public <E> Optional<E> get(String key, Class<E> type) {
        return get(key).filter(type::isInstance).map(type::cast);
    }

    public ArgumentMap set(String key, Object value) {
        map.put(key, Objects.requireNonNull(value));
        return this;
    }

    public ArgumentMap remove(String key) {
        map.remove(key);
        return this;
    }

    public ArgumentMap clear() {
        map.clear();
        return this;
    }

    public ArgumentMap clone() {
        ArgumentMap clone = new ArgumentMap();
        map.putAll(map);
        return clone;
    }

}
