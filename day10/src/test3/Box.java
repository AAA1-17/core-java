package test3;

public class Box<T> {

    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }

    public void showType() {
        System.out.println("当前存储数据的类型是：" + content.getClass().getName());
    }
}
