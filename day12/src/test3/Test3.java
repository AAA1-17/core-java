package test3;

import java.util.Optional;

public class Test3 {

    /**
     * 使用 Optional 类获取经理姓名，避免空指针异常
     * @param dept 部门对象
     * @return 经理姓名
     */
    public static String getManagerName(Dept dept) {
        return Optional.ofNullable(dept)
                .map(d -> d.getManager())
                .map(m -> m.getEmployeeName())
                .orElse("未知姓名");
    }

    public static void main(String[] args) {
        // 场景 1：部门为 null
        String result1 = Optional.ofNullable((Dept) null)
                .map(Dept::getDeptName)
                .orElse("默认部门");
        System.out.println("场景 1（部门为 null）：" + result1);

        // 场景 2：部门非 null，但经理为 null
        Dept dept2 = new Dept("技术部", null);
        String managerName2 = Optional.ofNullable(dept2)
                .map(Dept::getManager)
                .map(Employeeloyee::getEmployeeName)
                .orElse("默认经理");
        System.out.println("场景 2（经理为 null）：" + managerName2);

        // 场景 3：部门和经理非 null，但经理姓名为 null
        Dept dept3 = new Dept("财务部", new Employeeloyee(null, 35));
        String managerName3 = getManagerName(dept3);
        System.out.println("场景 3（姓名为 null）：" + managerName3);

        // 场景 4：所有属性均非 null
        Dept dept4 = new Dept("市场部", new Employeeloyee("张三", 40));
        String managerName4 = getManagerName(dept4);
        System.out.println("场景 4（所有属性非 null）：" + managerName4);
    }
}
