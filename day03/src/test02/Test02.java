package test02;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入购买数量: ");
        int count = scanner.nextInt();

        double price = 26.5;
        double total;

        if (count >= 500) {
            total = count * price * 0.8 - 1000;
        } else if (count >= 100) {
            total = count * price * 0.9;
        } else {
            total = count * price;
        }

        System.out.println("购买" + count + "本的应付金额为: " + total + "元");

        scanner.close();
    }
}
