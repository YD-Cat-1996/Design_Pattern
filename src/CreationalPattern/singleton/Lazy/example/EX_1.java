package CreationalPattern.singleton.Lazy.example;

/**
 * 通过懒汉单例模式使用一个人类实体
 */
public class EX_1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    People people1=People.getInstance();
                    people1.say();
                    People people2 = People.getInstance();
                    people2.say();
                    if(people1==people2){
                        System.out.println("是同一个人");
                    }else{
                        System.out.println("不是同一个人");
                    }
                }
            }).start();
        }
    }
}

class People{
    /**
     * volatile和synchronized保证了线程安全
     */
    private static volatile People instance=null;
    private People() {
        System.out.println("产生一个人");
    }
    public static synchronized People getInstance(){
        if (instance == null) {
            instance=new People();
        }else{
            System.out.println("已经有一个人了");
        }
        return instance;
    }
    public void say(){
        System.out.println("hello");
    }
}
