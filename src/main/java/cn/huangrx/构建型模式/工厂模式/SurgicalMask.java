package cn.huangrx.构建型模式.工厂模式;

abstract class Mask {
}


class SurgicalMask extends Mask {
    @Override
    public String toString() {
        return "这是医用口罩";
    }
}


class N95Mask extends Mask {
    @Override
    public String toString() {
        return "这是 N95 口罩";
    }
}

class MaskFactory {
    Mask create(String type){
        // 使用简单工厂模式实现此处的逻辑
        switch (type) {
            case "N95Mask": return new N95Mask();
            case "SurgicalMask": return new SurgicalMask();
            default: throw new IllegalArgumentException("类型错误");
        }
    }

    public static void main(String[] args) {
        MaskFactory maskFactory = new MaskFactory();
        Mask n95Mask = maskFactory.create("N95Mask");
        Mask surgicalMask = maskFactory.create("SurgicalMask");
        System.out.println(n95Mask.toString());
        System.out.println(surgicalMask.toString());
    }
}

class N95MaskFactory {
    public N95Mask create() {
        return new N95Mask();
    }
}

class SurgicalMaskFactory {
    public SurgicalMask create() {
        return new SurgicalMask();
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(new N95MaskFactory().create());
        System.out.println(new SurgicalMaskFactory().create());
    }
}