package test02;

public class Monster {
    private String name;      // 怪物名字
    private int life;         // 生命值
    private int attack;       // 攻击力

    public Monster() {
    }

    public Monster(String name, int life, int attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    // 攻击方法
    public void attack() {
        System.out.println("怪物" + name + "展开攻击");
        System.out.println("当前生命值是：" + life);
        System.out.println("攻击力是：" + attack);
    }

    // 移动方法（子类重写）
    public void move() {
        System.out.println(name + " 正在移动...");
    }
}
