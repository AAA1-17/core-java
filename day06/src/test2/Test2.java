package test2;

public class Test2 {
    public static void main(String[] args) {
        USB mouse = new Mouse();
        mouse.start();
        mouse.stop();
        mouse.show();

        System.out.println("====================================");

        USB keyboard = new Keyboard();
        keyboard.start();
        keyboard.stop();
        keyboard.show();
    }
}
