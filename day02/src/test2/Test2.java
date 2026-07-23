package test2;

public class Test2 {
    public static void main(String[] args) {
        // 2. 进行两个值的交换
        int x = 100, y = 200;
        System.out.println("交换前: x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("交换后: x = " + x + ", y = " + y);
    }
}
