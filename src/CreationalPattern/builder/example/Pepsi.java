package CreationalPattern.builder.example;

import CreationalPattern.builder.example.impl.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 30.5;
    }
}
