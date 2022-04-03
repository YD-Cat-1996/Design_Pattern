package StructuralPattern.bridge.example.EX_1.impl.color_impl;

import StructuralPattern.bridge.example.EX_1.interf.IColor;

/**
 * 具体颜色
 */
public class Red implements IColor {
    @Override
    public void paint(String shape) {
        System.out.println("红色的"+shape);
    }
}
