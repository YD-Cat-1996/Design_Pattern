package CreationalPattern.builder.reflection_generics;

import CreationalPattern.builder.reflection_generics.interfaceImpl.builder.*;
import CreationalPattern.builder.reflection_generics.interfaceImpl.director.ConcreteDirector;
import CreationalPattern.builder.reflection_generics.interfaceImpl.fruit.Apple;
import CreationalPattern.builder.reflection_generics.interfaceImpl.fruit.Banana;
import CreationalPattern.builder.reflection_generics.interfaceImpl.HEA.TV;
import CreationalPattern.builder.reflection_generics.interfacePkg.Builder;
import CreationalPattern.builder.reflection_generics.interfacePkg.Director;
import CreationalPattern.builder.reflection_generics.interfacePkg.Fruit;
import CreationalPattern.builder.reflection_generics.interfacePkg.HEA;

import java.util.List;
import java.util.Map;

/**
 * 通过泛型和反射设计通用的建造者模式
 * <br>
 * 泛型定义了建造的产品
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 22:10
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("-----生产水果-----");

        Builder appleBuiler=new AppleBuiler();
        // 泛型约束了生产的对象
        Director<Apple> appleDirector =new ConcreteDirector(appleBuiler);
        appleDirector.construct();
        Fruit apple= appleDirector.getResult();
        System.out.println("产品名称："+apple.getName());

        System.out.println("\n-----生产水果-----");

        Builder bananaBuilder=new BananaBuilder();
        // 泛型约束了生产的对象
        Director<Apple> bananaDirector =new ConcreteDirector(bananaBuilder);
        bananaDirector.construct();
        Fruit banana= appleDirector.getResult();
        System.out.println("产品名称："+banana.getName());


        System.out.println("\n-----生产家电-----");

        Builder tvBuilder=new TVBuilder();
        // 泛型约束了生产的对象
        Director<TV> tvDirector =new ConcreteDirector(tvBuilder);
        tvDirector.construct();
        TV tv= tvDirector.getResult();
        System.out.println("产品名称："+tv.getName());
        System.out.println("产品价格："+tv.getPrice());
        tv.show();
        // 支持Map
        System.out.println("\n--生产水果集合Map--");

        Builder bananasBuilder=new BananasBuilder();
        // 泛型约束了生产的对象
        Director<Map<String,Banana>> bananasDirector =new ConcreteDirector(bananasBuilder);
        bananasDirector.construct();
        Map<String,Banana> bananaMap=bananasDirector.getResult();
        for (Map.Entry<String,Banana> entry:bananaMap.entrySet()){
            System.out.println(entry.getKey()+"："+entry.getValue().getName());
        }
        // 支持List
        System.out.println("\n--生产家电集合List--");

        Builder tvsBuilder=new TVsBuilder();
        // 泛型约束了生产的对象
        Director<List<TV>> tvsDirector =new ConcreteDirector(tvsBuilder);
        tvsDirector.construct();
        List<TV> tvs= tvsDirector.getResult();
        System.out.println("产品名称+价格：");
        for (HEA hea : tvs) {
            System.out.println(hea.getName()+"："+hea.getPrice()+"元");
        }
    }
}
