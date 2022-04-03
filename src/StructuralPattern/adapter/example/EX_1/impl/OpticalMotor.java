package StructuralPattern.adapter.example.EX_1.impl;

import StructuralPattern.adapter.example.EX_1.interf.AnotherInterface;

/**
 * 其它接口实现类
 */
public class OpticalMotor implements AnotherInterface {
    @Override
    public void drive() {
        System.out.println("光能发动几驱动汽车");
    }
}
