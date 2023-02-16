package cn.huangrx.构建型模式.原型模式.controller;

import cn.huangrx.构建型模式.原型模式.shaps.BaseShape;

/**
 * 原型工厂测试
 *
 * @author hrenxiang
 * @since 2022-05-16 2:19 PM
 */
public class BundleShapeCacheTest {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();

        BaseShape shape1 = cache.get("Big green circle");
        BaseShape shape2 = cache.get("Medium blue rectangle");
        BaseShape shape3 = cache.get("Medium blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium blue rectangle (yay!)");
        } else {
            System.out.println("Big green circle == Medium blue rectangle (booo!)");
        }

        if (shape2 != shape3) {
            System.out.println("Medium blue rectangles are two different objects (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Rectangle objects are the same (booo!)");
        }
    }
}
