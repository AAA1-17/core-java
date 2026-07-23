package test1;

public class Test1 {
    public static void main(String[] args) {
        double[] scores = {10, 20, 30, 40, 50};

        //计算平均分
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = sum / scores.length;
        System.out.println("平均分：" + avg);

        //找出最低分
        double min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("最低分：" + min);

        //统计大于等于平均分的个数
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= avg) {
                count++;
            }
        }
        System.out.println("大于等于平均分的成绩个数：" + count);
    }
}
