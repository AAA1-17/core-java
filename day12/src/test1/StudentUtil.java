package test1;

public class StudentUtil {

    /**
     * 静态方法：按成绩降序排序
     * @param s1 学生1
     * @param s2 学生2
     * @return 比较结果
     */
    public static int compareByScore(Student s1, Student s2) {
        return s2.getScore().compareTo(s1.getScore());
    }

    /**
     * 实例方法：打印学生完整信息
     * @param s 学生对象
     */
    public void printStudent(Student s) {
        System.out.println(s.getId() + " - " + s.getName() + " - " + s.getScore());
    }
}
