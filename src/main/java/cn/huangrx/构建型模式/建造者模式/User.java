package cn.huangrx.构建型模式.建造者模式;

public class User {

    public static void main(String[] args) {
        new User().buyMilkTea();
    }

    private void buyMilkTea() {
        MilkTea milkTea = new MilkTea.Builder("原味").build();
        show(milkTea);

        MilkTea chocolate = new MilkTea.Builder("巧克力味")
                .ice(false)
                .build();
        show(chocolate);

        MilkTea strawberry = new MilkTea.Builder("草莓味")
                .size("大杯")
                .pearl(false)
                .ice(true)
                .build();
        show(strawberry);
    }

    private void show(MilkTea milkTea) {
        String pearl;
        if (milkTea.isPearl()) {
            pearl = "加珍珠";
        } else {
            pearl = "不加珍珠";
        }
        String ice;
        if (milkTea.isIce()) {
            ice = "加冰";
        } else {
            ice = "不加冰";
        }
        System.out.println("一份" + milkTea.getSize() + "、"
                + pearl + "、"
                + ice + "的"
                + milkTea.getType() + "奶茶");
    }
}