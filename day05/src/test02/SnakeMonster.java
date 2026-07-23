package test02;

public class SnakeMonster extends Monster {

    public SnakeMonster() {
        super();
    }

    public SnakeMonster(String name, int life, int attack) {
        super(name, life, attack);
    }

    //补血术（生命值<10时补20）
    public void snakeBloodSucking() {
        if (getLife() < 10) {
            setLife(getLife() + 20);
            System.out.println("实施大蛇补血术。。。。。，当前生命值是：" + getLife());
        } else {
            System.out.println("生命值充足，无需补血");
        }
    }

    // 重写移动方法
    @Override
    public void move() {
        System.out.println("我是蛇怪，我走S型路线");
    }
}
