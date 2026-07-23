package test07;

public class Test07 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=99 ; i=i+2) {
            sum=sum+i;
        }
        System.out.println("1+3+5+...+99 = " + sum);
    }
}
