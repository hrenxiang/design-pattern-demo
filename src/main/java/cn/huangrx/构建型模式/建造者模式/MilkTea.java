package cn.huangrx.构建型模式.建造者模式;

public class MilkTea {
    private String type;
    private String size;
    private boolean pearl;
    private boolean ice;

    /**
     * 私有方法，外部不能通过构造方法进行创建，但其实没有必要，在我看来，建造者模式只是对一个对象或行为的扩展。
     */
	private MilkTea() {}

    private MilkTea(Builder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.pearl = builder.pearl;
        this.ice = builder.ice;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public boolean isPearl() {
        return pearl;
    }
    public boolean isIce() {
        return ice;
    }

    public static class Builder {

        private final String type;
        private String size = "中杯";
        private boolean pearl = true;
        private boolean ice = false;

        public Builder(String type) {
            this.type = type;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder pearl(boolean pearl) {
            this.pearl = pearl;
            return this;
        }

        public Builder ice(boolean cold) {
            this.ice = cold;
            return this;
        }

        public MilkTea build() {
            return new MilkTea(this);
        }
    }
}