package CreationalPattern.factory.abstract_factory_pattern.example;

/**
 * @author YD-Cat
 * @version 1.0
 * @date 2020/6/26 12:34
 */
public class EX_1 {
    public static void main(String[] args) {
        Farm gdFarm=new GDFarm();
        Animal horse =gdFarm.newAnimal();
        Plant fruit=gdFarm.newPlant();
        horse.say();
        fruit.show();
        System.out.println("--------------------");
        Farm gxFarm=new GXFarm();
        Animal cattle=gxFarm.newAnimal();
        Plant vegetable= gxFarm.newPlant();
        cattle.say();
        vegetable.show();
    }
}

/**
 * 动物接口
 */
interface Animal{
    void say();
}
class Horse implements Animal{
    public Horse() {
        System.out.println("新马出生");
    }

    @Override
    public void say() {
        System.out.println("马叫了");
    }
}
class Cattle implements Animal{
    public Cattle() {
        System.out.println("新牛出生");
    }

    @Override
    public void say() {
        System.out.println("牛叫了");
    }
}

/**
 * 植物接口
 */
interface Plant{
    void show();
}
class Fruitage implements Plant{
    public Fruitage() {
        System.out.println("植物：水果");
    }

    @Override
    public void show() {
        System.out.println("水果被展示");
    }
}

class Vegetables implements Plant{
    public Vegetables() {
        System.out.println("植物：蔬菜");
    }

    @Override
    public void show() {
        System.out.println("蔬菜被展示");
    }
}

/**
 * 牧场接口
 */
interface Farm{
    Animal newAnimal();
    Plant newPlant();
}

class GDFarm implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("广东牧场正在生产动物");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("广东牧场正在种植植物");
        return new Fruitage();
    }
}

class GXFarm implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("广西牧场正在生产动物");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("广西牧场正在种植植物");
        return new Vegetables();
    }
}
