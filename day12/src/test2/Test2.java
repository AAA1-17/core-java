package test2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("冰箱", 2999.99, "家电"));
        goodsList.add(new Goods("面包", 8.9, "食品"));
        goodsList.add(new Goods("卫衣", 129.9, "服饰"));
        goodsList.add(new Goods("洗衣机", 1999.99, "家电"));
        goodsList.add(new Goods("饼干", 5.5, "食品"));
        goodsList.add(new Goods("运动鞋", 399.9, "服饰"));
        goodsList.add(new Goods("空调", 3599.99, "家电"));
        goodsList.add(new Goods("巧克力", 25.8, "食品"));

        // 使用 Stream 流完成操作
        List<String> result = goodsList.stream()
                // 1. 过滤出家电类商品，且价格大于 2000
                .filter(goods -> "家电".equals(goods.getType()) && goods.getPrice() > 2000)
                // 2. 按价格升序排序
                .sorted(Comparator.comparing(Goods::getPrice))
                // 3. 提取商品名和价格，拼接成格式：商品名：价格元
                .map(goods -> goods.getName() + "：" + goods.getPrice() + "元")
                // 4. 收集为 List<String>
                .collect(Collectors.toList());

        System.out.println("--- 符合条件的商品信息 ---");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
