package CreationalPattern.singleton.Hungry;

/**
 * 饿汉单例模式
 * 在类加载时创建实例，不存在线程安全问题
 */
public class HungrySingleton {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton instance1=Singleton.getInstance();
                    Singleton instance2=Singleton.getInstance();
                    instance1.show();
                    if(instance1==instance2) {
                        System.out.println("同一个实例");
                    }else {
                        System.out.println("不同一个实例");
                    }

                }
            }).start();
        }
    }
}

class Singleton{
    /**
     * 饿汉式会在类加载时创建实例，不会有线程安全问题
     */
    private static final Singleton instance=new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
    public void show(){
        System.out.println("hello");
    }
}
