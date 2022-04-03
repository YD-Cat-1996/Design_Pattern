package CreationalPattern.builder.onle_generics.interfaceImpl.director;

import CreationalPattern.builder.onle_generics.interfacePkg.Director;

/**
 * 抽象指挥者
 * <br>
 * 具有抽象的建造和返回方法
 * @param <T>
 */
public abstract class AbstractDirector<T> implements Director<T> {

    @Override
    public abstract void construct();

    @Override
    public abstract T getResult();
}
