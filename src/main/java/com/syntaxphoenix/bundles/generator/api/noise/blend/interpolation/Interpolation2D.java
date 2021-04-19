package com.syntaxphoenix.bundles.generator.api.noise.blend.interpolation;

import com.syntaxphoenix.bundles.generator.api.registry.IBuilder;
import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.syntaxapi.utils.key.AbstractKeyed;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class Interpolation2D extends AbstractKeyed implements IRegisterable<Interpolation2D> {

    public Interpolation2D(IKey key) {
        super(key);
    }

    @Override
    public final IBuilder<Interpolation2D> getBuilder() {
        return null;
    }

    public abstract double interpolate(double var0, double var1, double var2, double var3, double var4, double var5);

}
