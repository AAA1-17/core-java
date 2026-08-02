package test3;

import java.util.Properties;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        // 创建 Properties 对象
        Properties props = new Properties();

        // 1. 添加配置项
        props.setProperty("subject", "Java");
        props.setProperty("time", "2h");
        props.setProperty("stage", "入门");
        props.setProperty("tool", "IDEA");

        // 2. 查询配置值
        String time = props.getProperty("time");
        System.out.println("每日学习时长：" + time);

        // 查询不存在的配置，返回默认值
        String goal = props.getProperty("学习目标", "掌握核心知识点");
        System.out.println("学习目标：" + goal);

        // 3. 使用 stringPropertyNames() 遍历所有配置的键值对
        System.out.println("\n--- 所有配置项 ---");
        Set<String> keys = props.stringPropertyNames();
        for (String key : keys) {
            String value = props.getProperty(key);
            System.out.println(key + " = " + value);
        }
    }
}
