package StructuralPattern.bridge.example.EX_1.interf;

/**
 * 抽象图形，定义了颜色和抽象的绘画方法
 */
public abstract class Shape {
    protected IColor color;

    public Shape(IColor color) {
        this.color = color;
    }
    public abstract void draw();
}
