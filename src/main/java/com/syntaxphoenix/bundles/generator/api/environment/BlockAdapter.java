package com.syntaxphoenix.bundles.generator.api.environment;

import com.syntaxphoenix.syntaxapi.utils.key.IKey;

public abstract class BlockAdapter extends ObjectAdapter<Block, BlockAdapter> {

	public BlockAdapter(IKey key) {
		super(key);
	}

	public abstract Object getBlock(Area<?> world, int x, int y, int z);

	public Object setBlock(Area<?> world, int x, int y, int z, Block data) {
		return setBlock(getBlock(world, x, y, z), data);
	}

	public abstract Object setBlock(Object handle, Block data);

	public Block getData(Area<?> world, int x, int y, int z) {
		return getData(getBlock(world, x, y, z));
	}

	public abstract Block getData(Object handle);

	public boolean hasData(Area<?> world, int x, int y, int z, Block data) {
		return hasData(getBlock(world, x, y, z), data);
	}

	public abstract boolean hasData(Object handle, Block data);

}
