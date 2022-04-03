package CreationalPattern.propotype.TestPackage;

/**
 * 浅克隆，不可克隆对象的对象成员
 * 通过调用Object的clone方法实现，需要实现Cloneable接口
 */
public class Test_Shallow_Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shallow_Clone_Realizetype obj1=new Shallow_Clone_Realizetype();
        obj1.setObject(new Object());

        Shallow_Clone_Realizetype obj2= obj1.clone();

        System.out.println("obj1==obj2 ? "+(obj1==obj2));
        System.out.println("obj1.object==obj2.object ? "+(obj1.getObject()==obj2.getObject()));
    }
}

class Shallow_Clone_Realizetype implements Cloneable{
    private Object object;

    public Shallow_Clone_Realizetype() {
        System.out.println("具体原型创建成功");
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    protected Shallow_Clone_Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型克隆成功");
        return (Shallow_Clone_Realizetype) super.clone();
    }
}
