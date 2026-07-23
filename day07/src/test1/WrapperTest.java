package test1;

public class WrapperTest {
    public static void main(String[] args) {
        //1
        Integer a = 120;
        Integer b = 120;
        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println();

        //2
        Integer c = 150;
        Integer d = 150;
        System.out.println("c == d: " + (c == d));
        System.out.println("c.equals(d): " + c.equals(d));
        System.out.println();

        // 3
        String str = "2025";
        int num = Integer.parseInt(str);
        Integer numObj = num;
        System.out.println(numObj);
        System.out.println();

        // 4
        double dVal = 99.99;
        String dStr = String.valueOf(dVal);
        Double dObj = Double.parseDouble(dStr);
        System.out.println(dObj);
        System.out.println();

        // 5
        System.out.println("'5' 是否为数字: " + Character.isDigit('5'));
        System.out.println("'z' 是否为小写字母: " + Character.isLowerCase('z'));
    }
}
