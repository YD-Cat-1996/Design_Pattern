package CreationalPattern.builder.example;

import CreationalPattern.builder.example.impl.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 50;
    }
}
