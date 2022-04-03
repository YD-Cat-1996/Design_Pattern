package CreationalPattern.builder.onle_generics.interfacePkg;

/**
 * 建造者接口
 * <br>
 * 定义了生产和返回产品的方法
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 22:10
 */
public interface Builder<T> {
    void product();
    T getResult();
}
