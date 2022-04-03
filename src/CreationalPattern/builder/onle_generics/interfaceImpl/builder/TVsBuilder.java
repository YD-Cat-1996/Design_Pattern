package CreationalPattern.builder.onle_generics.interfaceImpl.builder;

import CreationalPattern.builder.onle_generics.interfaceImpl.HEA.TV;

import java.util.ArrayList;

/**
 * 电视List集合（产品集合）建造者
 * <br>
 * 泛型定义了产品集合，实现了生产十个电视（具体产品）的方法
 * <br>
 * 该方法的局限在于生产方法中需要自己创建一个具体产品集合
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 23:52
 */
public class TVsBuilder extends AbstractBuilder<ArrayList<TV>> {
    @Override
    public void product() {
        item=new ArrayList();
        for (int i = 0; i < 10; i++) {
            TV tv=new TV();
            tv.setName("电视"+(i+1));
            tv.setPrice(i+1);
            item.add(tv);
        }
    }
}
