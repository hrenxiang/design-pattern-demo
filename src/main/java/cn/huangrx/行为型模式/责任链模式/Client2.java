package cn.huangrx.行为型模式.责任链模式;


public class Client2 {
    public static void main(String[] args) {

        ProjectManager manager = new ProjectManager();

        Bug easy = new Bug(20);
        Bug middle = new Bug(50);
        Bug hard = new Bug(100);

        manager.assignBug(easy);
        manager.assignBug(middle);
        manager.assignBug(hard);
    }
}