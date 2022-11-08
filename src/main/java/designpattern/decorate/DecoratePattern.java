package designpattern.decorate;

/**
 * @author tim
 * @date 2022/11/8 14:48
 */
public class DecoratePattern {
    public static void main(String[] args) {
        new DecorateRobot(new FirstRobot()).doSomething();
    }
}

interface Robot {
    void doSomething();
}

class FirstRobot implements Robot {

    @Override
    public void doSomething() {
        System.out.println("做饭");
        System.out.println("扫地");
    }
}

class DecorateRobot implements Robot {
    private Robot robot;

    public DecorateRobot(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void doSomething() {
        robot.doSomething();
        System.out.println("唱歌");
    }
}

