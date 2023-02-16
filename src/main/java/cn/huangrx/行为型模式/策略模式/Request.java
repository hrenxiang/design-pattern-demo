package cn.huangrx.行为型模式.策略模式;

/**
 * @author hrenxiang
 * @create 2023/2/15 22:30
 */
public class Request {

    public int[] sortArr = new int[]{1, 5, 6, 3, 2, 8, 10};
    public String type = "冒泡";

    public Request() {
    }

    public int[] getSortArr() {
        return sortArr;
    }

    public void setSortArr(int[] sortArr) {
        this.sortArr = sortArr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
