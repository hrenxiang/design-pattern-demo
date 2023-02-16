package cn.huangrx.构建型模式.原型模式.shaps;

import java.awt.*;
import java.util.Objects;

/**
 * 形状
 *
 * @author hrenxiang
 * @since 2022-05-16 1:47 PM
 */
public abstract class BaseShape {
    public int x;
    public int y;
    public String color;

    public BaseShape() {
    }

    public BaseShape(BaseShape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    @Override
    public abstract BaseShape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof BaseShape)) {
            return false;
        }
        BaseShape BaseShape2 = (BaseShape) object2;
        return BaseShape2.x == x && BaseShape2.y == y && Objects.equals(BaseShape2.color, color);
    }

    @Override
    public String toString() {
        return "BaseShape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
