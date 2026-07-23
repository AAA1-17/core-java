package test11;

public class Test11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");  // 不换行，同一行输出
            }
            System.out.println();  // 换行，开始下一行
        }
    }
}

