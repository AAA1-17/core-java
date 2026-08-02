package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", 90));
        students.add(new Student("李四", 30));
        students.add(new Student("王五", 60));
        students.add(new Student("马六", 50));
        students.add(new Student("侯七", 80));

        // 3. 使用 Predicate 筛选成绩≥60分的及格学生
        Predicate<Student> passPredicate = s -> s.getScore() >= 60;
        List<Student> passedStudents = filterStudents(students, passPredicate);
        
        System.out.println("--- 及格学生列表 ---");
        for (Student s : passedStudents) {
            System.out.println(s);
        }

        // 4. 使用 Function 生成评级
        Function<Integer, String> gradeFunction = score -> {
            if (score >= 90) return "优秀";
            if (score >= 80) return "良好";
            if (score >= 60) return "及格";
            return "不及格";
        };

        // 5. 遍历所有学生，打印姓名、成绩、评级
        System.out.println("\n--- 所有学生信息及评级 ---");
        for (Student s : students) {
            String grade = gradeFunction.apply(s.getScore());
            System.out.println(s.getName() + " | 成绩：" + s.getScore() + " | 评级：" + grade);
        }
    }

    // 使用 Predicate 筛选学生的方法
    private static List<Student> filterStudents(List<Student> students, Predicate<Student> predicate) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (predicate.test(s)) {
                result.add(s);
            }
        }
        return result;
    }
}
