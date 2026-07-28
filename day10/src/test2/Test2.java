package test2;

import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        HashSet<Integer> scores = new HashSet<>();

        // 添加成绩（包含重复）
        scores.add(85);
        scores.add(90);
        scores.add(75);
        scores.add(85);  // 重复
        scores.add(90);  // 重复
        scores.add(70);
        scores.add(70);  // 重复
        scores.add(80);

        // 输出去重后的所有成绩
        System.out.println("去重后的成绩：");
        for (Integer score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        // 手动遍历计算总数、总和、平均分
        int count = 0;
        int sum = 0;
        for (Integer score : scores) {
            count++;
            sum += score;
        }

        double average = (double) sum / count;

        // 输出统计结果
        System.out.println("\n统计结果：");
        System.out.println("去重后的成绩总数：" + count);
        System.out.println("所有成绩的总和：" + sum);
        System.out.println("所有成绩的平均分：" + average);
    }
}
