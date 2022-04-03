package StructuralPattern.bridge.example.EX_1;

import StructuralPattern.bridge.example.EX_1.impl.color_impl.Green;
import StructuralPattern.bridge.example.EX_1.impl.color_impl.Red;
import StructuralPattern.bridge.example.EX_1.impl.color_impl.Yellow;
import StructuralPattern.bridge.example.EX_1.impl.shape_impl.Circle;
import StructuralPattern.bridge.example.EX_1.impl.shape_impl.Rectangle;
import StructuralPattern.bridge.example.EX_1.impl.shape_impl.Square;
import StructuralPattern.bridge.example.EX_1.impl.shape_impl.Triangle;
import StructuralPattern.bridge.example.EX_1.interf.Shape;

public class BridgeEX_1_Main {
    public static void main(String[] args) {
        // 创建不同颜色的图形
        Shape redCircle=new Circle(new Red());
        Shape greenCircle=new Circle(new Green());
        redCircle.draw();
        greenCircle.draw();
        System.out.println("--------------------");

        Shape redRectangle=new Rectangle(new Red());
        Shape greenRectangle=new Rectangle(new Green());
        redRectangle.draw();
        greenRectangle.draw();
        System.out.println("--------------------");

        Shape redSquare=new Square(new Red());
        Shape greenSquare=new Square(new Green());
        redSquare.draw();
        greenSquare.draw();
        System.out.println("--------------------");

        // 若需要增加颜色，只需实现具体颜色类，然后和具体图形组合即可
        // 若需要增加图形，只需实现具体图形类，然后和具体颜色组合即可
        Shape yellowCircle=new Circle(new Yellow());
        yellowCircle.draw();
        Shape redTriangle=new Triangle(new Red());
        redTriangle.draw();
    }
}
