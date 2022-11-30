package proxystudy.p1;

/**
 * @author tim
 * @date 2022/11/30 20:13
 */
public class BigStar implements Star {
    private String name;

    public BigStar(String name) {
        this.name = name;
    }

    @Override
    public String sing(String name) {
        System.out.println(this.name + "正在唱: " + name);
        return "谢谢！谢谢！";
    }

    @Override
    public void dance() {
        System.out.println(this.name + "正在优美的跳舞～～");
    }

}
