package test2;

public interface USB {
    // 抽象方法
    void start();
    void stop();

    // 默认方法
    default void show() {
        System.out.println("USB 设备工作中");
    }
}
