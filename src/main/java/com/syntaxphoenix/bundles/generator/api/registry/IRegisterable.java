package com.syntaxphoenix.bundles.generator.api.registry;

import com.syntaxphoenix.syntaxapi.utils.key.IKeyed;

public interface IRegisterable<V extends IKeyed> extends IKeyed {

	IBuilder<V> getBuilder();

}
