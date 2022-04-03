package CreationalPattern.builder.example.impl;

import CreationalPattern.builder.example.interf.Packing;

/**
 * 纸盒
 */
public class Warpper implements Packing {
    @Override
    public String pack() {
        return "Warpper";
    }
}
