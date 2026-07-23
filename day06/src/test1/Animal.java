package test1;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 抽象方法
    public abstract void eat();

    // 普通方法
    public void sleep() {
        System.out.println("动物睡觉");
    }
}
