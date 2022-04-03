package CreationalPattern.builder.reflection_generics.interfaceImpl.fruit;

import CreationalPattern.builder.reflection_generics.interfacePkg.Fruit;

/**
 * 抽象水果
 * <br>
 * 实现了设置和获取水果名称的方法
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 22:16
 */
public class AbstractFruit implements Fruit {
    private String name;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String string) {
        this.name=string;
    }
}
