package CreationalPattern.singleton.Lazy;

/**
 * 懒汉单例模式
 * 在使用时才创建实例，存在线程安全问题
 */
public class LazySingleton {
    static Singleton instance=Singleton.getInstance();
    public static void main(String[] args) {
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        System.out.println(singleton1==singleton2);
        System.out.println(instance==singleton2);
    }
}

class Singleton {
    /**
     * volatile和synchronized保证了线程安全
     */
    private static volatile Singleton instance;
    private Singleton(){};
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
