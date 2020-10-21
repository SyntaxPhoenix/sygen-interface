package com.syntaxphoenix.bundles.generator.impl.biome;

import com.syntaxphoenix.bundles.generator.api.biome.Biome;
import com.syntaxphoenix.bundles.generator.api.biome.BiomePackage;
import com.syntaxphoenix.bundles.generator.api.noise.NoiseProvider;

public final class BiomePack implements BiomePackage {

	private final Biome biome;
	private final NoiseProvider provider;

	public BiomePack(Biome biome, NoiseProvider provider) {
		this.biome = biome;
		this.provider = provider;
	}

	@Override
	public Biome getBiome() {
		return biome;
	}

	@Override
	public NoiseProvider getNoiseProvider() {
		return provider;
	}

}
