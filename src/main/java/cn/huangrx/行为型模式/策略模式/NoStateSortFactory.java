package cn.huangrx.行为型模式.策略模式;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * 无状态时，通过缓存排序对象，直接获取使用
 *
 * @author hrenxiang
 * @create 2023/2/15 22:05
 */
public class NoStateSortFactory {

    /**
     * 使用不可变集合
     */
    private static Map<String, ISort> SORTMAP = ImmutableMap.of(
            SortTypeEnum.BUBBLE.getType(), new BubbleSort(),
            SortTypeEnum.INSERT.getType(), new InsertSort(),
            SortTypeEnum.SELECT.getType(), new SelectionSort()
    );

    public static ISort getStrategy(String type) {

        ISort iSort = SORTMAP.get(type);
        if (iSort == null) {
            throw new IllegalArgumentException("您输入的算法有误！");
        }
        return iSort;
    }
}
