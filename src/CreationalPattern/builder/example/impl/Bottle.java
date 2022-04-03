package CreationalPattern.builder.example.impl;

import CreationalPattern.builder.example.interf.Packing;

/**
 * 瓶子
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
