package CreationalPattern.factory.factory_pattern.example;

/**
 * 用工厂模式设计畜牧场
 * <br>
 * 有马和牛的畜牧场，分别能生产马和牛两种动物
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 11:07
 */
public class EX_1 {
    public static void main(String[] args) {
        AnimalFarm  horseFarm = new HorseFarm();
        Animal horse= horseFarm.newAnimal();
        horse.say();
        AnimalFarm cattleFarm=new CattleFarm();
        Animal cattle=cattleFarm.newAnimal();
        cattle.say();
    }
}

/**
 * 动物接口
 */
interface Animal{
    void say();
}
// 具体的动物
class Horse implements Animal{
    public Horse() {
        System.out.println("新马出生了");
    }

    @Override
    public void say() {
        System.out.println("马在叫");
    }
}
class Cattle implements Animal{
    public Cattle() {
        System.out.println("新牛出生了");
    }

    @Override
    public void say() {
        System.out.println("牛在叫");
    }
}
/**
 * 畜牧场接口
 */
interface AnimalFarm{
    Animal newAnimal();
}
// 具体的畜牧场
class HorseFarm implements AnimalFarm{
    @Override
    public Animal newAnimal() {
        return new Horse();
    }
}
class CattleFarm implements AnimalFarm{
    @Override
    public Animal newAnimal() {
        return new Cattle();
    }
}
