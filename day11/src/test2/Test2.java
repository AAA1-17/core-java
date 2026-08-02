package test2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        TreeMap<Employee, String> treeMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                // 按工资从高到低排序（降序）
                return e2.getSalary().compareTo(e1.getSalary());
            }
        });

        // 创建 4 个员工对象
        Employee emp1 = new Employee(1, "张三", 1000);
        Employee emp2 = new Employee(2, "李四", 8000);
        Employee emp3 = new Employee(3, "王五", 6000);
        Employee emp4 = new Employee(4, "赵六", 4000);

        // 添加员工到集合中（key 为员工对象，value 为部门）
        treeMap.put(emp1, "技术部");
        treeMap.put(emp2, "财务部");
        treeMap.put(emp3, "技术部");
        treeMap.put(emp4, "市场部");

        // 获取工资最高的员工（第一个元素）
        Map.Entry<Employee, String> highestEntry = treeMap.firstEntry();
        System.out.println("工资最高的员工：" + highestEntry.getKey() + "，部门：" + highestEntry.getValue());

        // 获取工资最低的员工（最后一个元素）
        Map.Entry<Employee, String> lowestEntry = treeMap.lastEntry();
        System.out.println("工资最低的员工：" + lowestEntry.getKey() + "，部门：" + lowestEntry.getValue());

        // 遍历打印所有员工的完整信息
        System.out.println("\n--- 所有员工信息 ---");
        for (Map.Entry<Employee, String> entry : treeMap.entrySet()) {
            Employee emp = entry.getKey();
            String department = entry.getValue();
            System.out.println(emp + "，部门：" + department);
        }
    }
}
