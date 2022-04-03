package CreationalPattern.builder.reflection_generics.interfaceImpl.builder;

import CreationalPattern.builder.reflection_generics.interfacePkg.Builder;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 抽象建造者，实现了产返回产品的方法
 * 具体的生产方法由具体建造者实现
 * <br>
 * 在调用抽象类的构造方法时获取泛型的具体类型，通过反射调用产品对象的无参构造方法建造对象
 * <br>
 * 需要确保建造的对象拥有无参构造方法，和具体建造者能调用抽象建造者的无参构造方法
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 22:13
 */
public abstract class AbstractBuilder<T> implements Builder<T> {
    protected T item;
    private Class clz;
    public AbstractBuilder() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        Type type = pt.getActualTypeArguments()[0];
        if (type instanceof ParameterizedTypeImpl){
            clz =((ParameterizedTypeImpl) type).getRawType();
        }else {
            clz = (Class) type; // 获取具体对象的具体类型
        }
        try {
            item= (T) clz.newInstance(); // 创建对象
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public T getResult() {
        return item;
    }

    public abstract void product();
}
