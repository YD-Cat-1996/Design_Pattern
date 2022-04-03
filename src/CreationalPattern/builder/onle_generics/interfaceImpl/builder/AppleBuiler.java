package CreationalPattern.builder.onle_generics.interfaceImpl.builder;

import CreationalPattern.builder.onle_generics.interfaceImpl.fruit.Apple;

/**
 * 苹果（具体）建造者
 * <br>
 * 泛型定义了产品类型，实现了生产苹果（具体产品）的方法
 * <br>
 * 该方法的局限在于生产方法中需要自己手动创建一个具体产品
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 22:12
 */
public class AppleBuiler extends AbstractBuilder<Apple> {
    @Override
    public void product() {
        item=new Apple();
        item.setName("苹果");
    }
}
