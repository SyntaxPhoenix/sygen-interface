package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class BlockAdapter<H> extends ObjectAdapter<Block> {

	public BlockAdapter(IKey key) {
		super(key);
	}

	public abstract H getBlock(World<?> world, int x, int y, int z);

	public H setBlock(World<?> world, int x, int y, int z, Block data) {
		return setBlock(getBlock(world, x, y, z), data);
	}

	public abstract H setBlock(H handle, Block data);

	public Block getData(World<?> world, int x, int y, int z) {
		return getData(getBlock(world, x, y, z));
	}

	public abstract Block getData(H handle);

	public boolean hasData(World<?> world, int x, int y, int z, Block data) {
		return hasData(getBlock(world, x, y, z), data);
	}

	public abstract boolean hasData(H handle, Block data);

}
