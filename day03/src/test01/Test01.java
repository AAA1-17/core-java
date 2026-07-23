package test01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年龄: ");
        int age = scanner.nextInt();

        if (age < 6) {
            System.out.println("儿童");
        } else if (age >= 6 && age <= 13) {
            System.out.println("少儿");
        } else if (age >= 14 && age <= 17) {
            System.out.println("青少年");
        } else if (age >= 18 && age <= 35) {
            System.out.println("青年");
        } else if (age >= 36 && age <= 50) {
            System.out.println("中年");
        } else {
            System.out.println("中老年");
        }

        scanner.close();
    }
}
