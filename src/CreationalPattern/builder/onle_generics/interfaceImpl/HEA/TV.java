package CreationalPattern.builder.onle_generics.interfaceImpl.HEA;

/**
 * 电视（具体产品）
 * <br>
 * 实现了电视展示的方法
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 23:02
 */
public class TV extends AbstractHEA {
    @Override
    public void show() {
        System.out.println("电视被打开了");
    }
}
