package CreationalPattern.factory.abstract_factory_pattern;

/**
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 11:38
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        Factory concreteFacotry1=new ConcreteFactory1();
        Product product1=concreteFacotry1.newProduct1();
        product1.show();
        Product product2=concreteFacotry1.newProduct2();
        product2.show();
        System.out.println("-----------------");
        Factory concreteFacotry2=new ConcreteFactory2();
        Product product3=concreteFacotry2.newProduct1();
        product3.show();
        Product product4=concreteFacotry2.newProduct2();
        product4.show();
    }
}
interface Product{
    void show();
}
class ConcreteProduct1 implements Product{
    public ConcreteProduct1() {
        System.out.println("具体产品1 生产");
    }

    @Override
    public void show() {
        System.out.println("具体产品1 显示");
    }
}
class ConcreteProduct2 implements Product{
    public ConcreteProduct2() {
        System.out.println("具体产品2 生产");
    }

    @Override
    public void show() {
        System.out.println("具体产品2 显示");
    }
}
class ConcreteProduct3 implements Product{
    public ConcreteProduct3() {
        System.out.println("具体产品3 生产");
    }

    @Override
    public void show() {
        System.out.println("具体产品3 显示");
    }
}
class ConcreteProduct4 implements Product{
    public ConcreteProduct4() {
        System.out.println("具体产品4 生产");
    }

    @Override
    public void show() {
        System.out.println("具体产品4 显示");
    }
}

interface Factory{
    Product newProduct1();
    Product newProduct2();
}
class ConcreteFactory1 implements Factory{
    @Override
    public Product newProduct1() {
        System.out.println("具体工厂1 开始生产");
        return new ConcreteProduct1();
    }

    @Override
    public Product newProduct2() {
        System.out.println("具体工厂1 开始生产");
        return new ConcreteProduct2();
    }
}
class ConcreteFactory2 implements Factory{
    @Override
    public Product newProduct1() {
        System.out.println("具体工厂2 开始生产");
        return new ConcreteProduct3();
    }

    @Override
    public Product newProduct2() {
        System.out.println("具体工厂2 开始生产");
        return new ConcreteProduct4();
    }
}
