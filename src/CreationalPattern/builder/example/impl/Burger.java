package CreationalPattern.builder.example.impl;

import CreationalPattern.builder.example.interf.Item;
import CreationalPattern.builder.example.interf.Packing;

/**
 * 汉堡抽象类
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Warpper();
    }

    @Override
    public abstract double price();
}
