package StructuralPattern.adapter.example.EX_1.adapter;

import StructuralPattern.adapter.example.EX_1.interf.AnotherInterface;
import StructuralPattern.adapter.example.EX_1.interf.Motor;

/**
 * 电能适配器
 */
public class ElectricAdapter implements Motor {
    private AnotherInterface eMotor;

    public ElectricAdapter(AnotherInterface eMotor) {
        this.eMotor = eMotor;
    }

    @Override
    public void drive() {
        System.out.println("电能适配器");
        eMotor.drive();
    }
}
