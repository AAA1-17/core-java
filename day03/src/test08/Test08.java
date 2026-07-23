package test08;

public class Test08 {
    public static void main(String[] args) {
        // 第6题
        int sum1 = 0;
        int i = 1;
        while (i <= 100) {
            sum1 += i;
            i++;
        }
        System.out.println("1+2+3+...+100 = " + sum1);

        // 第7题
        int sum2 = 0;
        int j = 1;
        do {
            sum2 += j;
            j += 2;
        } while (j <= 99);
        System.out.println("1+3+5+...+99 = " + sum2);
    }
}