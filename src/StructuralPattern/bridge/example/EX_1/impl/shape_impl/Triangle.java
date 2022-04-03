package StructuralPattern.bridge.example.EX_1.impl.shape_impl;

import StructuralPattern.bridge.example.EX_1.interf.IColor;
import StructuralPattern.bridge.example.EX_1.interf.Shape;

/**
 * 新增的具体图形
 */
public class Triangle extends Shape {
    public Triangle(IColor color) {
        super(color);
    }

    @Override
    public void draw() {
        color.paint("三角形");
    }
}
