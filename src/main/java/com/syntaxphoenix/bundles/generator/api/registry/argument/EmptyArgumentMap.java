package com.syntaxphoenix.bundles.generator.api.registry.argument;

public final class EmptyArgumentMap implements IArgumentMap {
    
    public static final EmptyArgumentMap INSTANCE = new EmptyArgumentMap();
    
    private EmptyArgumentMap() {}

    @Override
    public boolean has(String key) {
        return false;
    }

    @Override
    public boolean has(String key, Class<?> type) {
        return false;
    }

    @Override
    public Option<Object> get(String key) {
        return Option.empty();
    }

    @Override
    public <E> Option<E> get(String key, Class<E> type) {
        return Option.empty();
    }

    @Override
    public IArgumentMap set(String key, Object value) {
        return this;
    }

    @Override
    public IArgumentMap remove(String key) {
        return this;
    }

    @Override
    public IArgumentMap clear() {
        return this;
    }

    @Override
    public IArgumentMap clone() {
        return this;
    }

}
