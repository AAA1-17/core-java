package test02;

public class Test02 {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(5, 3);

        // 输出周长和面积
        System.out.println("矩形的周长: " + rect.getPerimeter());
        System.out.println("矩形的面积: " + rect.getArea());
    }
}
