package CreationalPattern.builder.onle_generics.interfaceImpl.builder;

import CreationalPattern.builder.onle_generics.interfacePkg.Builder;

/**
 * 抽象建造者
 * <br>
 * 带有产品对象，和实现了返回产品的方法
 * 具体的生产方法由具体建造者实现
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 22:13
 */
public abstract class AbstractBuilder<T> implements Builder {
    protected T item;

    public T getResult() {
        return item;
    }

    public abstract void product();
}
