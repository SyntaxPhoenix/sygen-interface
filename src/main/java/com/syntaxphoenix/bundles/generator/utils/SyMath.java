package com.syntaxphoenix.bundles.generator.utils;

public final class SyMath {

    private SyMath() {}

    public static double minmax(double value, double min, double max) {
        return Math.max(Math.min(value, min), max);
    }

    public static int minmax(int value, int min, int max) {
        return Math.max(Math.min(value, min), max);
    }

}
