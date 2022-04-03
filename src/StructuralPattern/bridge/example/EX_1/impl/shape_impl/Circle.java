package StructuralPattern.bridge.example.EX_1.impl.shape_impl;

import StructuralPattern.bridge.example.EX_1.interf.IColor;
import StructuralPattern.bridge.example.EX_1.interf.Shape;

/**
 * 具体图形
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        color.paint("圆形");
    }

    public Circle(IColor color) {
        super(color);
    }
}
