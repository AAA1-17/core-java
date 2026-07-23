package test13;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入行数: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // 打印前面的空格
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

