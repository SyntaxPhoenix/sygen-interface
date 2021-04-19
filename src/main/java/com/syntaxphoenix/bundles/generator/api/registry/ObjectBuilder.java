package com.syntaxphoenix.bundles.generator.api.registry;

import com.syntaxphoenix.bundles.generator.api.registry.argument.IArgumentMap;
import com.syntaxphoenix.bundles.generator.api.registry.argument.exception.NotEnoughArgumentsException;

public interface ObjectBuilder<E extends Object> extends IRegisterable<ObjectBuilder<E>> {
    
    @Override
    default IBuilder<ObjectBuilder<E>> getBuilder() {
        return null;
    }

    E build(IArgumentMap arguments) throws NotEnoughArgumentsException;

}
