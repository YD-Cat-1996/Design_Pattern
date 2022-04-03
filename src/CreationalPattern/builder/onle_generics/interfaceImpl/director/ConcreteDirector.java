package CreationalPattern.builder.onle_generics.interfaceImpl.director;

import CreationalPattern.builder.onle_generics.interfacePkg.Builder;

/**
 * 指挥者，泛型定义了需要建造的产品
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 22:20
 */

public class ConcreteDirector<T> extends AbstractDirector<T>{
    private Builder builder;
    public ConcreteDirector(Builder builder) {
        this.builder = builder;
    }
    public Builder getBuilder() {
        return builder;
    }
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.product();
    }

    public T getResult(){
        return (T) builder.getResult();
    }
}
