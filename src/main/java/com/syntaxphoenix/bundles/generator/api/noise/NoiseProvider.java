package com.syntaxphoenix.bundles.generator.api.noise;

import com.syntaxphoenix.bundles.generator.api.Seeded;

public interface NoiseProvider extends Seeded {

	double getNoise(int x, int z);

}
