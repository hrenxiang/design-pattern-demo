package cn.huangrx.行为型模式.策略模式;

import java.util.Arrays;

/**
 * @author hrenxiang
 * @create 2023/2/15 22:32
 */
public class Test {

    public static void main(String[] args) {

        // 模拟外部请求
        Request request = new Request();
//        // 获取默认算法
//        ISort strategy = NoStateSortFactory.getStrategy(request.getType());
//        assert strategy != null;
//        // 对默认数组进行排序
//        strategy.sort(request.sortArr);
//        // 输出排序结果
//        System.out.println(Arrays.toString(request.sortArr));

//        ISort strategy1 = TableNoStateSortFactory.getStrategy(request.getType());
//        strategy1.sort(request.getSortArr());
//        System.out.println(Arrays.toString(request.getSortArr()));

        try {
            ISort strategy = TableStateSortFactory.getStrategy(request.getType());
            strategy.sort(request.getSortArr());
            System.out.println(Arrays.toString(request.getSortArr()));
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
