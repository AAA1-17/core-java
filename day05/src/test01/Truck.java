package test01;

public class Truck {
    private String plateNumber;   // 车牌号
    private String brand;         // 车型
    private String color;         // 颜色
    private double loadCapacity;  // 载重量
    private double dailyRate;     // 日租金

    public Truck() {
    }

    public Truck(String plateNumber, String brand, String color, double loadCapacity, double dailyRate) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.color = color;
        this.loadCapacity = loadCapacity;
        this.dailyRate = dailyRate;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    // 计算租金
    public double calculateRent(int days) {
        return dailyRate * days;
    }

    // 显示租赁信息
    public void showRentalInfo(String renterName, int days) {
        System.out.println("租赁信息");
        System.out.println("车牌号：" + plateNumber);
        System.out.println("车型：" + brand);
        System.out.println("颜色：" + color);
        System.out.println("载重量：" + (int)loadCapacity);
        System.out.println("租车人：" + renterName);
        System.out.println("应付金额：" + calculateRent(days));
    }
}
