package test01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入租车人姓名：");
        String renterName = scanner.next();

        System.out.print("请输入租赁天数：");
        int days = scanner.nextInt();

        DongfengTruck truck = new DongfengTruck("京D1111", "蓝色", 500, 20.0);

        // 显示租赁信息
        truck.showRentalInfo(renterName, days);

        scanner.close();
    }
}
