package CreationalPattern.builder.reflection_generics.interfaceImpl.builder;

import CreationalPattern.builder.reflection_generics.interfaceImpl.fruit.Banana;

import java.util.HashMap;

/**
 * 香蕉（具体）建造者
 * <br>
 * 泛型定义了水果（产品）的接口，实现了生产香蕉（具体产品）的方法
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 22:28
 */
public class BananaBuilder extends AbstractBuilder<Banana> {
    @Override
    public void product() {
//        item=new Banana();
        item.setName("香蕉");
    }
}
