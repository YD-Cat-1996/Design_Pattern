package CreationalPattern.builder.example;

import CreationalPattern.builder.example.impl.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 30;
    }
}
