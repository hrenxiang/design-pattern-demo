package cn.huangrx.构建型模式.原型模式.shaps;

import java.awt.*;
import java.util.Objects;

/**
 * 圆
 *
 * @author    hrenxiang
 * @since     2022/5/16 1:49 PM
 */
public class Circle extends BaseShape {
    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public BaseShape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) {
            return false;
        }
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}