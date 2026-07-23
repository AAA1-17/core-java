package test2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入18位身份证号：");
        String idCard = scanner.next();

        //截取出生年月日（第7-14位，索引6-13）
        String year = idCard.substring(6, 10);
        String month = idCard.substring(10, 12);
        String day = idCard.substring(12, 14);
        System.out.println("出生日期：" + year + "年" + month + "月" + day + "日");

        //判断是否以数字1-9开头
        char firstChar = idCard.charAt(0);
        if (firstChar >= '1' && firstChar <= '9') {
            System.out.println("身份证号以数字1-9开头：是");
        } else {
            System.out.println("身份证号以数字1-9开头：否");
        }

        //反转身份证号
        StringBuilder sb = new StringBuilder(idCard);
        String reversed = sb.reverse().toString();
        System.out.println("反转后的身份证号：" + reversed);

        scanner.close();
    }
}
