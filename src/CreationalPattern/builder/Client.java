package CreationalPattern.builder;

/**
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 13:57
 */
public class Client {
    public static void main(String[] args) {
        Builder builder=new ConcreteBuiler();
        Director director=new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
/**
 * 产品接口
 */
class Product{
    private String partA;
    private String partB;
    private String partC;

    public void show(){
        System.out.println(this.toString());
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}

/**
 * 抽象建造者
 */
abstract class Builder{
    protected Product product=new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getProduct() {
        return product;
    }
}
// 具体建造者
class ConcreteBuiler extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
class Director{
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }
}
