package CreationalPattern.singleton.Hungry.example;

public class EX_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    BaJie instance = BaJie.getInstance();
                    BaJie instance1 = BaJie.getInstance();
                    if(instance==instance1){
                        System.out.println("都是八戒");
                    }else {
                        System.out.println("不是八戒");
                    }
                }
            }).start();
        }
    }
}

class BaJie{
    private static BaJie instance=new BaJie();
    private String name="八戒";
    private BaJie(){
        System.out.println("创建八戒");
    }
    public static BaJie getInstance(){
        return instance;
    }

    public String getName() {
        return name;
    }
}
