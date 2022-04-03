package CreationalPattern.factory.factory_pattern;

/**
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 11:00
 */
public class FactoryPattern {
    public static void main(String[] args) {
        Factory factory1=new ConcreteFactory_1();
        Product product1=factory1.newProduct();
        product1.show();
        System.out.println("----------------");
        Factory factory2=new ConcreteFactory_2();
        Product product2=factory2.newProduct();
        product2.show();
    }
}
interface Product{
    void show();
}
class ConcreteProduct_1 implements Product{
    @Override
    public void show() {
        System.out.println("具体产品1 显示");
    }
}
class ConcreteProduct_2 implements Product{
    @Override
    public void show() {
        System.out.println("具体产品2 显示");
    }
}
interface Factory{
    Product newProduct();
}
class ConcreteFactory_1 implements Factory{
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生产具体产品1");
        return new ConcreteProduct_1();
    }
}
class ConcreteFactory_2 implements Factory{
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生产具体产品2");
        return new ConcreteProduct_2();
    }
}
