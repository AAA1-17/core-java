package test09;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个小于10的整数: ");
        int n = scanner.nextInt();
        
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
        
        scanner.close();
    }
}

