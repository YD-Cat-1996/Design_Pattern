package CreationalPattern.builder.onle_generics.interfacePkg;

/**
 * 家庭电器（产品）接口
 * <br>
 * 定义了设置和获取家电的名称、价格的方法，定义了家电展示的方法
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 22:59
 */
public interface HEA {
    void setName(String name);
    String getName();
    void setPrice(int price);
    int getPrice();
    void show();
}
