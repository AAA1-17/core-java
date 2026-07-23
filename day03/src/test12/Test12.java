package test12;

public class Test12 {
    public static void main(String[] args) {
        int days = 0;
        for (int year = 2000; year < 2026; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                days += 366;  // 闰年
            } else {
                days += 365;  // 平年
            }
        }
        System.out.println("2000年1月1日到2026年1月1日相距 " + days + " 天");
    }
}