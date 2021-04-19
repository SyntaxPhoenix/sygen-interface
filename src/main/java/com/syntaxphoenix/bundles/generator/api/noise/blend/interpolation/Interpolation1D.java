package com.syntaxphoenix.bundles.generator.api.noise.blend.interpolation;

import com.syntaxphoenix.bundles.generator.api.registry.IBuilder;
import com.syntaxphoenix.bundles.generator.api.registry.IRegisterable;
import com.syntaxphoenix.syntaxapi.utils.key.AbstractKeyed;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class Interpolation1D extends AbstractKeyed implements IRegisterable<Interpolation1D> {

    public Interpolation1D(IKey key) {
        super(key);
    }

    @Override
    public final IBuilder<Interpolation1D> getBuilder() {
        return null;
    }

    public abstract double interpolate(double var0, double var1, double var2);

}
