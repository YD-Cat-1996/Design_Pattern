package StructuralPattern.bridge.example.EX_1.impl.shape_impl;

import StructuralPattern.bridge.example.EX_1.interf.IColor;
import StructuralPattern.bridge.example.EX_1.interf.Shape;

/**
 * 具体图形
 */
public class Rectangle extends Shape {
    public Rectangle(IColor color) {
        super(color);
    }

    @Override
    public void draw() {
        color.paint("长方形");
    }
}
