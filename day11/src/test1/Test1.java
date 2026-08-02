package test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("手机", 50);
        products.put("电脑", 30);
        products.put("平板", 20);
        System.out.println("添加 3 种商品后：" + products);

        //添加已存在的商品（手机 - 60），观察库存覆盖效果
        products.put("手机", 60);
        System.out.println("\n添加已存在的商品（手机 - 60）后：" + products);
        System.out.println("手机当前库存：" + products.get("手机"));

        //根据商品名称查询 "电脑" 的库存
        System.out.println("\n查询电脑的库存：" + products.get("电脑"));

        //删除 "平板" 商品并打印删除后的库存值
        Integer removedValue = products.remove("平板");
        System.out.println("\n删除平板后的库存值：" + removedValue);
        System.out.println("删除平板后的集合：" + products);

        //遍历打印所有商品的名称和库存（使用 entrySet() 方式）
        System.out.println("\n--- 遍历所有商品 ---");
        Set<Map.Entry<String, Integer>> entries = products.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }

        //判断集合中是否包含 "耳机" 商品
        System.out.println("\n集合中是否包含耳机：" + products.containsKey("耳机"));
    }
}
