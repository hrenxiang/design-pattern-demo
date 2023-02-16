package cn.huangrx.构建型模式.工厂模式;

import org.apache.commons.lang3.StringUtils;

/**
 * @author hrenxiang
 * @create 2023/2/15 17:55
 */
public class AnimalFactory1 {

    public Animal createAnimal(String type) {
        // 根据类型转换为已设置的 枚举，便于判断。
        AnimalType animalType = AnimalType.convertEnumByType(type);
        if (animalType == null) {
            throw new IllegalArgumentException("目前还未发现这种动物！");
        }
        switch (animalType) {
            case CHICKEN:
                //我们可以在这里写创建每只鸡时，共用的逻辑，比如我们需要鸡蛋，然后孵化箱孵化，喂饲料等
                //简化类很多重复的代码。
                return new Chicken();
            case DUCK:
                return new Duck();
            default:
                throw new IllegalArgumentException("目前还未发现这种动物！");
        }
    }

}
