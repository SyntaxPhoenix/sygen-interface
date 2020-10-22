package com.syntaxphoenix.bundles.generator.api;

import com.syntaxphoenix.bundles.generator.api.biome.Biome;
import com.syntaxphoenix.bundles.generator.api.environment.Block;
import com.syntaxphoenix.bundles.generator.api.environment.Entity;
import com.syntaxphoenix.bundles.generator.api.environment.Item;
import com.syntaxphoenix.bundles.generator.api.environment.ObjectAdapter;
import com.syntaxphoenix.bundles.generator.api.noise.NoiseGenerator;
import com.syntaxphoenix.bundles.generator.api.registry.adapter.RegistryHandler;
import com.syntaxphoenix.syntaxapi.utils.key.Namespace;

public abstract class GeneratorApi {

	public static final Namespace NAMESPACE = Namespace.of("generatorapi");

	public abstract RegistryHandler<ObjectAdapter<?>> getObjectRegistry();

	public abstract RegistryHandler<NoiseGenerator> getNoiseRegistry();

	public abstract RegistryHandler<Entity> getEntityRegistry();

	public abstract RegistryHandler<Block> getBlockRegistry();

	public abstract RegistryHandler<Biome> getBiomeRegistry();

	public abstract RegistryHandler<Item> getItemRegistry();

}
