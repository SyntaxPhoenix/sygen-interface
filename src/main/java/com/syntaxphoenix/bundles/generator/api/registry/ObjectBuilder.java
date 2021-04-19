package com.syntaxphoenix.bundles.generator.api.registry;

import com.syntaxphoenix.bundles.generator.api.registry.argument.IArgumentMap;

public interface ObjectBuilder<E extends Object> extends IRegisterable<ObjectBuilder<E>> {

    E build(IArgumentMap arguments);

}
