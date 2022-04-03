package CreationalPattern.propotype.TestPackage;

import java.io.*;

/**
 * 深克隆，可实现克隆对象的对象成员
 * 通过将对象写入流和从流读出创建对象
 */
public class Test_Deep_Clone {
    public static void main(String[] args) throws Exception {
        Deep_Clone_Realizetype obj1 = new Deep_Clone_Realizetype();
        TestObj testObj=new TestObj(); // 成员对象
        testObj.setInteger(new Integer(100));
        obj1.setObject(testObj);

        // 对象写到流里面
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(baos);
        oos.writeObject(obj1); // 写入
        // 将对象从流里读出
        ByteArrayInputStream baoi = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(baoi);
        Deep_Clone_Realizetype obj2= (Deep_Clone_Realizetype) ois.readObject(); // 读出

        System.out.println("具体原型克隆成功");
        System.out.println("-------------------");
        System.out.println("obj1==obj2 ? "+(obj1==obj2));
        System.out.println("obj1.object==obj2.object ? "+(obj1.getObject()==obj2.getObject()));
        System.out.println("-------------------");
        System.out.println("obj1.object "+obj1.getObject());
        System.out.println("obj2.object "+obj2.getObject());
        System.out.println("-------------------");
        System.out.println("obj1.object.integer==obj2.object.integer ? "+(obj1.getObject().getInteger()==obj2.getObject().getInteger()));
    }
}

class Deep_Clone_Realizetype implements Serializable{
    private TestObj object;

    public Deep_Clone_Realizetype() {
        System.out.println("具体原型创建成功");
    }

    public TestObj getObject() {
        return object;
    }

    public void setObject(TestObj object) {
        this.object = object;
    }
}

class TestObj implements Serializable{
    private Integer integer;

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }
}
