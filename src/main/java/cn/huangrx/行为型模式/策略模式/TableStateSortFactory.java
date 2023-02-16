package cn.huangrx.行为型模式.策略模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 有状态时，每次都新建排序算法对象
 *
 * @author hrenxiang
 * @create 2023/2/15 22:05
 */
public class TableStateSortFactory {

    private static final List<AllSort2<ISort>> SORTS = new ArrayList<>();

    static {
        SORTS.add(new AllSort2("冒泡", BubbleSort.class));
        SORTS.add(new AllSort2("插入", InsertSort.class));
        SORTS.add(new AllSort2("选择", SelectionSort.class));
    }

    public static ISort getStrategy(String type) throws InstantiationException, IllegalAccessException {

        ISort matchSort = null;
        for (AllSort2 sort : SORTS) {
            if (sort.matchSort(type)) {
                Class sortClass = sort.getSortClass();
                matchSort = (ISort) sortClass.newInstance();
                break;
            }
        }
        return matchSort;
    }
}