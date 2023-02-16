package cn.huangrx.行为型模式.策略模式;

import org.apache.commons.lang3.StringUtils;

/**
 * 防止工厂类中过多的 if - else，使用表进行匹配 TableNoStateSortFactory
 */
public class AllSort {
    private String type;
    private ISort sort;

    public AllSort() {
    }

    public AllSort(String type, ISort sort) {
        this.type = type;
        this.sort = sort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ISort getSort() {
        return sort;
    }

    public void setSort(ISort sort) {
        this.sort = sort;
    }

    public boolean matchSort(String type) {
        return StringUtils.equals(type, this.type);
    }
}
