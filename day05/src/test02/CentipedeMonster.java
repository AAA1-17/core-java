package test02;

public class CentipedeMonster extends Monster {

    public CentipedeMonster() {
        super();
    }

    public CentipedeMonster(String name, int life, int attack) {
        super(name, life, attack);
    }

    // 重写移动方法
    @Override
    public void move() {
        System.out.println("我是蜈蚣精，御风飞行");
    }
}
