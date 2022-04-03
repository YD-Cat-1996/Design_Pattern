package CreationalPattern.builder.example.impl;

import CreationalPattern.builder.example.interf.Item;
import CreationalPattern.builder.example.interf.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
    @Override
    public abstract double price();
}
