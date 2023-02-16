package cn.huangrx.构建型模式.原型模式.controller;

import cn.huangrx.构建型模式.原型模式.shaps.BaseShape;
import cn.huangrx.构建型模式.原型模式.shaps.Circle;
import cn.huangrx.构建型模式.原型模式.shaps.Rectangle;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型工厂
 *
 * 你可以实现中心化的原型注册站 （或工厂）， 其中包含一系列预定义的原型对象。
 * 这样一来， 你就可以通过传递对象名称或其他参数的方式从工厂处获得新的对象。
 * 工厂将搜索合适的原型， 然后对其进行克隆复制， 最后将副本返回给你。
 *
 * @author    hrenxiang
 * @since     2022/5/16 2:18 PM
 */
public class BundledShapeCache {
    private Map<String, BaseShape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("Big green circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }

    public BaseShape put(String key, BaseShape shape) {
        cache.put(key, shape);
        return shape;
    }

    public BaseShape get(String key) {
        return cache.get(key).clone();
    }
}