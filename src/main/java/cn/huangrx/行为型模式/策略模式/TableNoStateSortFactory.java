package cn.huangrx.行为型模式.策略模式;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

/**
 * 无状态时，共用一个算法对象
 *
 * @author hrenxiang
 * @create 2023/2/15 22:05
 */
public class TableNoStateSortFactory {

    private static final List<AllSort> SORTS = ImmutableList.of(
            new AllSort("冒泡", new BubbleSort()),
            new AllSort("插入", new InsertSort()),
            new AllSort("选择", new SelectionSort())
    );

//    static {
//        SORTS.add(new AllSort("冒泡", new BubbleSort()));
//        SORTS.add(new AllSort("插入", new InsertSort()));
//        SORTS.add(new AllSort("选择", new SelectionSort()));
//    }

    public static ISort getStrategy(String type) {

        ISort matchSort = null;
        for (AllSort sort : SORTS) {
            if (sort.matchSort(type)) {
                matchSort = sort.getSort();
                break;
            }
        }
        return matchSort;
    }
}