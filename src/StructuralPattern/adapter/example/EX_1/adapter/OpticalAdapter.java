package StructuralPattern.adapter.example.EX_1.adapter;

import StructuralPattern.adapter.example.EX_1.interf.AnotherInterface;
import StructuralPattern.adapter.example.EX_1.interf.Motor;

/**
 * 光能适配器
 */
public class OpticalAdapter implements Motor {
    private AnotherInterface oMotor;

    public OpticalAdapter(AnotherInterface oMotor) {
        this.oMotor = oMotor;
    }

    @Override
    public void drive() {
        System.out.println("光能适配器");
        oMotor.drive();
    }
}
