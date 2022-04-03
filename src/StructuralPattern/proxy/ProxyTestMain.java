package StructuralPattern.proxy;

public class ProxyTestMain {

    public static void main(String[] args) {
        Subject proxySubject= new ProxySubject();
        proxySubject.Request();
        System.out.println("-------------");
        proxySubject=new ProxySubject(new RealSubject2());
        proxySubject.Request();
    }
}
/**
 * 主题接口
 */
interface Subject {
    void Request();
}
/**
 * 真实主题1
 */
class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("真实主题方法");
    }
}
/**
 * 真实主题2
 */
class RealSubject2 implements Subject {
    @Override
    public void Request() {
        System.out.println("另一个真实主题方法");
    }
}
/**
 * 代理主题
 * 组合了真实主题，可通过构造函数设置真实主题
 */
class ProxySubject implements Subject {
    private Subject realSubject;
    public ProxySubject() {
    }

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("访问真实主题之前的预处理");
    }
    public void postRequest(){
        System.out.println("访问真实主题之后的尾处理");
    }
}
