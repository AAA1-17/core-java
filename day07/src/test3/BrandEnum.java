package test3;

public enum BrandEnum {
    HUAWEI("华为", "HarmonyOS"),
    XIAOMI("小米", "Android"),
    APPLE("苹果", "iOS"),
    OPPO("OPPO", "Android"),
    VIVO("vivo", "Android");

    private String chineseName;
    private String system;

    private BrandEnum(String chineseName, String system) {
        this.chineseName = chineseName;
        this.system = system;
    }


    public String getChineseName() {
        return chineseName;
    }

    public String getSystem() {
        return system;
    }
}
