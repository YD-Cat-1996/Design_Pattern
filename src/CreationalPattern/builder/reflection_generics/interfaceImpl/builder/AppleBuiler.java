package CreationalPattern.builder.reflection_generics.interfaceImpl.builder;

import CreationalPattern.builder.reflection_generics.interfaceImpl.fruit.Apple;

/**
 * 苹果（具体）建造者
 * <br>
 * 泛型定义了水果（产品）的接口，和实现了生产苹果（具体产品）的方法
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 22:12
 */
public class AppleBuiler extends AbstractBuilder<Apple> {
    @Override
    public void product() {
//        item=new Apple();
        item.setName("苹果");
    }
}
