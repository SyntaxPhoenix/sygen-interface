package com.syntaxphoenix.bundles.generator.api.biome;

import com.syntaxphoenix.syntaxapi.utils.key.AbstractKeyed;
import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class BiomeAdapter extends AbstractKeyed {

    public BiomeAdapter(IKey key) {
        super(key);
    }
    
    public abstract Biome getBiome(Object object);
    
    public abstract Object getBiome(Biome biome);
    
    public abstract void setBiome(int x, int y, int z, Biome biome);

}
