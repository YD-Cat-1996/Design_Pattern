package CreationalPattern.builder.reflection_generics.interfacePkg;

/**
 * 指挥者接口
 * <br>
 * 定义了指挥者的建造和返回对象的方法
 * @param <T>
 */
public interface Director<T> {
    /**
     * 建造对象
     */
    void construct();

    /**
     * 返回对象
     * @return
     */
    T getResult();
}
