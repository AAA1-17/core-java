package test1;

public class Test1 {
    public static void main(String[] args) {
        // 1. 找出2个整数中的较大值
        int a = 10, b = 20;
        int max2 = (a > b) ? a : b;
        System.out.println(a + " 和 " + b + " 中的较大值是: " + max2);

        // 找3个整数中的较大值
        int c = 30;
        int max3 = (max2 > c) ? max2 : c;
        System.out.println(a + ", " + b + " 和 " + c + " 中的较大值是: " + max3);
    }
}
