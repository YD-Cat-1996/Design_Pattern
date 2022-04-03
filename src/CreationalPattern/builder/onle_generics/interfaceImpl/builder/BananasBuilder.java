package CreationalPattern.builder.onle_generics.interfaceImpl.builder;


import CreationalPattern.builder.onle_generics.interfaceImpl.fruit.Banana;

import java.util.HashMap;

/**
 * 香蕉Map集合（具体）建造者
 * <br>
 * 泛型定义了水果（产品）的接口，实现了生产香蕉（具体产品）的方法
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 22:28
 */
public class BananasBuilder extends AbstractBuilder<HashMap<String, Banana>> {
    @Override
    public void product() {
        item=new HashMap<>();
        for (int i = 0; i < 10; i++) {
            Banana banana=new Banana();
            banana.setName("香蕉"+(i+1));
            item.put("香蕉君"+(i+1),banana);
        }
    }
}
