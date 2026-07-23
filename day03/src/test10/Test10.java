package test10;

public class Test10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                sum += i;
            }
        }
        System.out.println("100以内能被3整除但不能被5整除的数字之和 = " + sum);
    }
}