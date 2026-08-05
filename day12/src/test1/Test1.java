package test1;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1, "张三", 85);
        students[1] = new Student(2, "李四", 90);
        students[2] = new Student(3, "王五", 75);
        students[3] = new Student(4, "马六", 95);
        students[4] = new Student(5, "侯七", 85);

        // 通过静态方法引用调用排序方法对数组排序
        Arrays.sort(students, StudentUtil::compareByScore);
        System.out.println("--- 排序后的学生信息 ---");
        StudentUtil util = new StudentUtil();
        for (Student s : students) {
            util.printStudent(s);
        }
    }
}
