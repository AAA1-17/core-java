package test14;

public class Test14 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 100; i <= 999; i++) {
            int hundreds = i / 100;        // 百位数字
            int tens = (i / 10) % 10;      // 十位数字
            int units = i % 10;            // 个位数字

            int cubeSum = hundreds * hundreds * hundreds
                        + tens * tens * tens
                        + units * units * units;

            if (cubeSum == i) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("水仙花数共有 " + count + " 个");
    }
}
