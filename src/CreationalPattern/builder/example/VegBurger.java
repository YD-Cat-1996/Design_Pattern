package CreationalPattern.builder.example;

import CreationalPattern.builder.example.impl.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 25;
    }
}
