package cn.huangrx.行为型模式.责任链模式;

public class Programmer {
    // 程序员类型：菜鸟、普通、优秀
    public String type;

    public Programmer(String type) {
        this.type = type;
    }

    public void solve(Bug bug) {
        System.out.println(type + "程序员解决了一个难度为 " + bug.value + " 的 bug");
    }
}