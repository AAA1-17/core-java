package test3;

public class Test3 {
    public static void main(String[] args) {
        // 创建 Box<String> 存放字符串
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, 泛型！");

        System.out.println("--- Box<String> ---");
        stringBox.showType();
        System.out.println("内容：" + stringBox.get());

        // 创建 Box<Integer> 存放整数
        Box<Integer> integerBox = new Box<>();
        integerBox.set(100);

        System.out.println("\n--- Box<Integer> ---");
        integerBox.showType();
        System.out.println("内容：" + integerBox.get());
    }
}
