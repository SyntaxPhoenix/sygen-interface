package com.syntaxphoenix.bundles.generator.api.registry.argument;

import java.util.Optional;

public interface IArgumentMap {
    
    boolean has(String key);
    
    boolean has(String key, Class<?> type);
    
    Optional<Object> get(String key);
    
    <E> Optional<E> get(String key, Class<E> type);
    
    IArgumentMap set(String key, Object value);
    
    IArgumentMap remove(String key);
    
    IArgumentMap clear();
    
    IArgumentMap clone();

}
