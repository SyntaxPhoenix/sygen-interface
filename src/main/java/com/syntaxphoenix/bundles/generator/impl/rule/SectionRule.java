package com.syntaxphoenix.bundles.generator.impl.rule;

import java.util.ArrayList;
import java.util.Collections;

import com.syntaxphoenix.bundles.generator.api.noise.NoiseRule;
import com.syntaxphoenix.bundles.generator.impl.rule.section.Section;

public class SectionRule implements NoiseRule {

	private final ArrayList<Section> sections = new ArrayList<>();

	public SectionRule(Section... sections) {
		if (sections.length == 0) {
			throw new IllegalArgumentException("Can't construct SectionRule without sections!");
		}
		Collections.addAll(this.sections, sections);
	}

	@Override
	public boolean isApplyable(double originalNoise) {
		return true;
	}

	@Override
	public double apply(double originalNoise, double currentNoise, int x, int z) {
		for (Section section : sections) {
			if (section.getMin() <= originalNoise && section.getMax() >= originalNoise) {
				return section.getNoiseFor(originalNoise);
			}
		}
		return 0;
	}

}
