package test3;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 3. 键盘输入一个数字，判断是否为奇数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数: ");
        int num = scanner.nextInt();
        if (num % 2 != 0) {
            System.out.println(num + " 是奇数");
        } else {
            System.out.println(num + " 不是奇数（是偶数）");
        }
        scanner.close();
    }
}
