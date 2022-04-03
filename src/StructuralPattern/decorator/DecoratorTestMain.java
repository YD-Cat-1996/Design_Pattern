package StructuralPattern.decorator;

public class DecoratorTestMain {

    public static void main(String[] args) {
        Shape circle=new Circle(10);
        Shape circle_20 = new Circle(20);
        Shape rectangle = new Rectangle(3, 4, 5);

        circle_20=new RedShapeDecorator(circle_20);
        rectangle=new RedShapeDecorator(rectangle);

        System.out.println("-------------------------");

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("-------------------------");

        System.out.println("Circle of red border");
        circle_20.draw();

        System.out.println("-------------------------");

        System.out.println("Rectangle of red border");
        rectangle.draw();
    }
}


// 抽象图形
interface Shape{
    void draw();
}
// 具体图形
class Rectangle implements Shape{
    private int A;
    private int B;
    private int C;

    public Rectangle(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle, A: "+A+", B: "+B+", C: "+C);
    }
}
// 具体图形
class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Circle, radius: "+radius);
    }
}
// 抽象装饰器
abstract class ShapeDecorator implements Shape{
    protected Shape decorateShape; // 被装饰的图形真实图形

    public ShapeDecorator(Shape decorateShape) {
        this.decorateShape = decorateShape;
    }

    @Override
    public void draw() {
        decorateShape.draw();
    }
}
// 具体装饰器
class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decorateShape) {
        super(decorateShape);
    }

    @Override
    public void draw() {
        decorateShape.draw(); // 调用被装饰的图形的方法
        setRedBorder(decorateShape);
    }
    // 装饰方法
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}