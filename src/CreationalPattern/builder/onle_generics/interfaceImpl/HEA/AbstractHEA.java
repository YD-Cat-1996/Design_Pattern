package CreationalPattern.builder.onle_generics.interfaceImpl.HEA;

import CreationalPattern.builder.onle_generics.interfacePkg.HEA;

/**
 * 抽象家庭电器产品
 * <br>
 * 实现了设置和获取产品的名字、价格的方法
 * 具体的家电展示的方法由具体产品实现
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 23:00
 */
public abstract class AbstractHEA implements HEA {
    private int price;
    private String name;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name){
        this.name=name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price){
        this.price=price;
    }

    @Override
    public abstract void show();
}
