package test1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "张三", 85));
        students.add(new Student(2, "李四", 90));
        students.add(new Student(3, "王五", 80));
        students.add(new Student(1, "张三重复", 70)); // 重复 id=1
        students.add(new Student(4, "赵六", 0));

        // 按 id 去重（保留第一个）
        ArrayList<Student> uniqueStudents = new ArrayList<>();
        Set<Integer> seenIds = new HashSet<>();
        for (Student s : students) {
            if (!seenIds.contains(s.getId())) {
                seenIds.add(s.getId());
                uniqueStudents.add(s);
            }
        }

        // 按分数降序排序
        uniqueStudents.sort(Comparator.comparingDouble(Student::getScore).reversed());

        System.out.println("\n去重并按分数降序排序后：");
        for (Student s : uniqueStudents) {
            System.out.println(s);
        }
    }
}
