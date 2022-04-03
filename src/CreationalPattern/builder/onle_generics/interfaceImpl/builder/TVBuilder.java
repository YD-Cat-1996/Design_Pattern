package CreationalPattern.builder.onle_generics.interfaceImpl.builder;

import CreationalPattern.builder.onle_generics.interfaceImpl.HEA.TV;

/**
 * 电视（具体）建造者
 * <br>
 * 泛型定义了产品类型，实现了生产电视（具体产品）的方法
 * <br>
 * 该方法的局限在于生产方法中需要自己创建一个具体产品
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 22:57
 */
public class TVBuilder extends AbstractBuilder<TV>{
    @Override
    public void product() {
        item=new TV();
        item.setPrice(100);
        item.setName("小米电视");
    }
}
