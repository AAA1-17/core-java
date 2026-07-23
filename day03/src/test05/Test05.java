package test05;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入季度(1-4或A-D): ");
        String input = scanner.next();

        switch (input) {
            case "1":
            case "A":
                System.out.println("第一季度：3-5月（春季）");
                break;
            case "2":
            case "B":
                System.out.println("第二季度：6-8月（夏季）");
                break;
            case "3":
            case "C":
                System.out.println("第三季度：9-11月（秋季）");
                break;
            case "4":
            case "D":
                System.out.println("第四季度：12-2月（冬季）");
                break;
            default:
                System.out.println("输入错误");
                break;
        }

        scanner.close();
    }
}
