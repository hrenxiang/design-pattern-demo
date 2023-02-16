package cn.huangrx.构建型模式.工厂模式;

/**
 * @author hrenxiang
 * @create 2023/2/15 18:16
 */
public class Caller {
    public static void main(String[] args) {
        AnimalFactory1 animalFactory1 = new AnimalFactory1();
        Animal chicken = animalFactory1.createAnimal("chicken");
        Animal duck = animalFactory1.createAnimal("duck");
        chicken.shout();
        duck.shout();

        Animal normal = animalFactory1.createAnimal("");
        normal.shout();
    }
}
