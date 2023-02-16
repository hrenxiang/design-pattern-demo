package cn.huangrx.行为型模式.策略模式;

import org.apache.commons.lang3.StringUtils;

/**
 * 防止工厂类中过多的 if - else，使用表进行匹配 TableStateSortFactory
 */
public class AllSort2<T> {
    private String type;
    private Class<T> sortClass;

    public AllSort2() {
    }

    public AllSort2(String type, Class<T> sortClass) {
        this.type = type;
        this.sortClass = sortClass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Class<T> getSortClass() {
        return sortClass;
    }

    public void setSortClass(Class<T> sortClass) {
        this.sortClass = sortClass;
    }

    public boolean matchSort(String type) {
        return StringUtils.equals(type, this.type);
    }
}
