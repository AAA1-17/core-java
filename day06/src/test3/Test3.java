package test3;

public class Test3 {
    public static void printArea(Shape shape) {
        System.out.println("面积：" + shape.getArea());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("圆形：");
        printArea(circle);

        System.out.println("====================================");

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("矩形：");
        printArea(rectangle);
    }
}
