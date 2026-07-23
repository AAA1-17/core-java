package test01;

public class Test01 {
    public static void main(String[] args) {

        Student student1 = new Student("2021001", "张三", "计算机科学");
        Student student2 = new Student("2021002", "李四", "软件工程");
        Student student3 = new Student("2021003", "王五", "信息安全");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
