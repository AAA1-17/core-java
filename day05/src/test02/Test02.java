package test02;

public class Test02 {
    public static void main(String[] args) {
        // 创建蛇怪对象
        SnakeMonster snake = new SnakeMonster("蛇妖甲", 5, 20);
        snake.attack();
        snake.snakeBloodSucking();
        snake.move();

        System.out.println("====================================");

        // 创建蜈蚣精对象
        CentipedeMonster centipede = new CentipedeMonster("蜈蚣乙", 60, 15);
        centipede.attack();
        centipede.move();
    }
}
