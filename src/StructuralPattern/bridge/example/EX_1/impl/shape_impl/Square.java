package StructuralPattern.bridge.example.EX_1.impl.shape_impl;

import StructuralPattern.bridge.example.EX_1.interf.IColor;
import StructuralPattern.bridge.example.EX_1.interf.Shape;

/**
 * 具体图形
 */
public class Square extends Shape {
    public Square(IColor color) {
        super(color);
    }

    @Override
    public void draw() {
        color.paint("正方形");
    }
}
