package cn.huangrx.行为型模式.策略模式;

import org.apache.commons.lang3.StringUtils;

/**
 * 排序算法枚举
 *
 * @author hrenxiang
 * @create 2023/2/15 22:08
 */
public enum SortTypeEnum {

    /**
     * 名字
     */
    BUBBLE("冒泡"),
    INSERT("插入"),
    SELECT("选择");

    SortTypeEnum(String type) {
        this.type = type;
    }

    private final String type;

    public String getType() {
        return type;
    }

    public static SortTypeEnum convert(String name) {
        if (StringUtils.isNotBlank(name)) {
            SortTypeEnum[] values = SortTypeEnum.values();
            for (SortTypeEnum value : values) {
                if (value.type.equals(name)) {
                    return value;
                }
            }
        }
        return null;
    }
}
