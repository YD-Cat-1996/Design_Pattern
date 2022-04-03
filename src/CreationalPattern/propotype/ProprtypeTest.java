package CreationalPattern.propotype;

/**
 * 原型模式，通过克隆的方式实现对象的创建
 */
public class ProprtypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1=new Realizetype();
        Realizetype obj2=obj1.clone();
        System.out.println("obj1==obj2 ? "+(obj1==obj2));
    }
}

class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("具体原型创建成功");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Realizetype) super.clone();
    }
}
