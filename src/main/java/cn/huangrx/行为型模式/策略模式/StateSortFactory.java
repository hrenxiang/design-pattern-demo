package cn.huangrx.行为型模式.策略模式;

/**
 * 有状态时，每次都新建排序算法对象
 *
 * @author hrenxiang
 * @create 2023/2/15 22:05
 */
public class StateSortFactory {
    public static ISort getStrategy(String type) {

        SortTypeEnum sortType = SortTypeEnum.convert(type);
        if (sortType == null) {
            throw new IllegalArgumentException("您输入的算法有误！");
        }
        switch (sortType) {
            case BUBBLE: return new BubbleSort();
            case INSERT: return new InsertSort();
            case SELECT: return new SelectionSort();
            default: break;
        }
        return null;
    }
}
