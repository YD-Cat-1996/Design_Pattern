package StructuralPattern.bridge.example.EX_1.impl.color_impl;

import StructuralPattern.bridge.example.EX_1.interf.IColor;

/**
 * 新增的具体颜色
 */
public class Yellow implements IColor {
    @Override
    public void paint(String shape) {
        System.out.println("黄色的"+shape);
    }
}
