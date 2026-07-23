package test02;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // 计算周长
    public int getPerimeter() {
        return 2 * (length + width);
    }

    // 计算面积
    public int getArea() {
        return length * width;
    }
}
