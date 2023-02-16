package cn.huangrx.构建型模式.原型模式.controller;

import cn.huangrx.构建型模式.原型模式.shaps.Circle;
import cn.huangrx.构建型模式.原型模式.shaps.Rectangle;
import cn.huangrx.构建型模式.原型模式.shaps.BaseShape;

import java.util.ArrayList;
import java.util.List;

/**
 * 控制器
 *
 * @author    hrenxiang
 * @since     2022/5/16 1:52 PM
 */
public class Api {

    /**
     * 测试
     */
    public static void main(String[] args) {
        List<BaseShape> baseShapes = new ArrayList<>();
        List<BaseShape> baseShapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        baseShapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        baseShapes.add(anotherCircle);
        System.out.println(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        baseShapes.add(rectangle);

        cloneAndCompare(baseShapes, baseShapesCopy);
    }

    private static void cloneAndCompare(List<BaseShape> baseShapes, List<BaseShape> baseShapesCopy) {
        for (BaseShape baseShape : baseShapes) {
            baseShapesCopy.add(baseShape.clone());
        }
        System.out.println(baseShapes);
        System.out.println(baseShapesCopy);

        for (int i = 0; i < baseShapes.size(); i++) {
            // == 比较的是引用，equals比较的是重写的具体逻辑
            if (baseShapes.get(i) != baseShapesCopy.get(i)) {
                System.out.println(i + ": BaseShapes are different objects (yay!)");
                if (baseShapes.get(i).equals(baseShapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": BaseShape objects are the same (booo!)");
            }
        }
    }
}