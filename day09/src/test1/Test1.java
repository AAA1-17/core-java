package test1;

public class Test1 {

    /**
     * 检查年龄是否合法
     *
     * @param age 年龄
     * @throws AgeIllegalException 当年龄小于0或大于150时抛出
     */
    public static void checkAge(int age) throws AgeIllegalException {
        if (age < 0 || age > 150) {
            throw new AgeIllegalException("年龄不能小于0或大于150");
        }
        System.out.println("年龄合法");
    }

    public static void main(String[] args) {
        // 测试合法年龄
        try {
            checkAge(100);
        } catch (AgeIllegalException e) {
            System.out.println(e.getMessage());
        }

        // 测试不合法年龄（小于0）
        try {
            checkAge(-200);
        } catch (AgeIllegalException e) {
            System.out.println("捕获异常: " + e.getMessage());
        }

        // 测试不合法年龄（大于150）
        try {
            checkAge(200);
        } catch (AgeIllegalException e) {
            System.out.println("捕获异常: " + e.getMessage());
        }
    }
}
