package StructuralPattern.adapter;

public class AdapterTestMain {
    public static void main(String[] args) {
        TestInterface adaptee=new Adaptee();
        Target target=new ObjectAdapter(adaptee);
        target.request();
    }
}
// 适配者接口
interface TestInterface{
    void TestRequest();
}
// 适配者
class Adaptee implements TestInterface{
    public void TestRequest(){
        System.out.println("适配者的方法");
    }
}
// 目标接口
interface Target{
    void request();
}
// 适配器
class ObjectAdapter implements Target{
    private TestInterface adaptee; // 适配者接口
    public ObjectAdapter(TestInterface adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        System.out.println("适配器启动");
        // 调用适配者
        adaptee.TestRequest();
    }
}
