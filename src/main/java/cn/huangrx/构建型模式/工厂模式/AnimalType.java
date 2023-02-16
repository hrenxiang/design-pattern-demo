package cn.huangrx.构建型模式.工厂模式;

import org.apache.commons.lang3.StringUtils;

/**
 * @author hrenxiang
 * @create 2023/2/15 17:58
 */
public enum AnimalType {
    /**
     * 鸡
     */
    CHICKEN("chicken", "鸡"),
    /**
     * 鸭
     */
    DUCK("duck", "鸭");


    AnimalType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    private String type;
    private String desc;

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public static AnimalType convertEnumByType(String type) {
        if (StringUtils.isNotBlank(type)) {
            AnimalType[] values = AnimalType.values();
            for (AnimalType value : values) {
                if (value.type.equals(type)) {
                    return value;
                }
            }
        }

        return null;
    }
}
