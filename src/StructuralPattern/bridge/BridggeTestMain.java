package StructuralPattern.bridge;

public class BridggeTestMain {
    public static void main(String[] args) {
        Shape redCircle=new Circle(100,100,10,new RedCircle());
        Shape greenCircle=new Circle(120,120,20,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}

/**
 * 绘画接口
 */
interface DrawApi{
    void drawCircle(int radius, int x, int y);
}
// 红圆
class RedCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                            +radius+", x: "+x+", y: "+y);
    }
}
// 绿圆
class GreenCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                            +radius+", x: "+x+", y: "+y);
    }
}

/**
 * 图形接口
 */
abstract class Shape{
    protected DrawApi drawApi;
    protected Shape(DrawApi drawApi){
        this.drawApi=drawApi;
    }
    public abstract void draw();
}
// 原型
class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius,DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius,x,y);
    }
}
