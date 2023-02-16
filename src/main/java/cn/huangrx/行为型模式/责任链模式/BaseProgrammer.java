package cn.huangrx.行为型模式.责任链模式;

public abstract class BaseProgrammer {
    protected BaseProgrammer next;

    public void setNext(BaseProgrammer next) {
        this.next = next;
    }

    abstract void handle(Bug bug);
}