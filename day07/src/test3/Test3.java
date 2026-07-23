package test3;

public class Test3 {
    public static void main(String[] args) {
        //遍历所有品牌
        BrandEnum[] brands = BrandEnum.values();
        for (int i = 0; i < brands.length; i++) {
            BrandEnum brand = brands[i];
            System.out.println((i + 1) + ". " + brand.name() + " - " + brand.getChineseName() + " - " + brand.getSystem());
        }

        System.out.println("====================================");

        //switch匹配APPLE
        BrandEnum target = BrandEnum.APPLE;
        switch (target) {
            case APPLE:
                System.out.println("苹果手机使用 iOS 系统，流畅稳定");
                break;
            default:
                System.out.println(target.getChineseName() + "手机使用 " + target.getSystem() + " 系统");
                break;
        }
    }
}
