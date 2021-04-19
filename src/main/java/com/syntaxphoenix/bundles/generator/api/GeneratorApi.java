package com.syntaxphoenix.bundles.generator.api;

import com.syntaxphoenix.bundles.generator.api.biome.Biome;
import com.syntaxphoenix.bundles.generator.api.biome.BiomeGenerator;
import com.syntaxphoenix.bundles.generator.api.environment.Block;
import com.syntaxphoenix.bundles.generator.api.environment.BlockAdapter;
import com.syntaxphoenix.bundles.generator.api.environment.ContainerAdapter;
import com.syntaxphoenix.bundles.generator.api.environment.Entity;
import com.syntaxphoenix.bundles.generator.api.environment.EntityAdapter;
import com.syntaxphoenix.bundles.generator.api.environment.Item;
import com.syntaxphoenix.bundles.generator.api.environment.ItemAdapter;
import com.syntaxphoenix.bundles.generator.api.noise.NoiseGenerator;
import com.syntaxphoenix.bundles.generator.api.noise.blend.Blender;
import com.syntaxphoenix.bundles.generator.api.noise.blend.interpolation.Interpolation1D;
import com.syntaxphoenix.bundles.generator.api.noise.blend.interpolation.Interpolation2D;
import com.syntaxphoenix.bundles.generator.api.registry.ObjectBuilder;
import com.syntaxphoenix.bundles.generator.api.registry.adapter.RegistryHandler;
import com.syntaxphoenix.syntaxapi.utils.key.Namespace;

public abstract class GeneratorApi {

    public static final Namespace NAMESPACE = Namespace.of("generatorapi");

    public abstract RegistryHandler<NoiseGenerator> getNoiseRegistry();

    public abstract RegistryHandler<Entity> getEntityRegistry();

    public abstract RegistryHandler<Block> getBlockRegistry();

    public abstract RegistryHandler<Biome> getBiomeRegistry();

    public abstract RegistryHandler<Item> getItemRegistry();

    public abstract RegistryHandler<ContainerAdapter> getContainerAdapterRegistry();

    public abstract RegistryHandler<EntityAdapter> getEntityAdapterRegistry();

    public abstract RegistryHandler<BlockAdapter> getBlockAdapterRegistry();

    public abstract RegistryHandler<ItemAdapter> getItemAdapterRegistry();

    public abstract RegistryHandler<Interpolation1D> getInterpolation1DRegistry();

    public abstract RegistryHandler<Interpolation2D> getInterpolation2DRegistry();

    public abstract RegistryHandler<ObjectBuilder<? extends BiomeGenerator>> getGeneratorRegistry();

    public abstract RegistryHandler<ObjectBuilder<? extends Blender>> getBlenderRegistry();

}
