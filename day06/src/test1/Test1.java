package test1;

public class Test1 {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财");
        dog.eat();
        dog.sleep();

        System.out.println("====================================");

        Cat cat = new Cat("咪咪");
        cat.eat();
        cat.sleep();
    }
}
