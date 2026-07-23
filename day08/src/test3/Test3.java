package test3;

public class Test3 {
    public static void main(String[] args) {
        Book[] books = {
            new Book("A", 60, "甲"),
            new Book("B", 40, "乙"),
            new Book("C", 50, "丙")
        };

        //遍历数组，输出每本书的完整信息
        System.out.println("=== 所有书籍信息 ===");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        //找出价格大于50元的书籍
        System.out.println("\n=== 价格大于50元的书籍 ===");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPrice() > 50) {
                System.out.println(books[i]);
            }
        }
    }
}
