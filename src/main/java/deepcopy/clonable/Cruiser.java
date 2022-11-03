package deepcopy.clonable;


public class Cruiser implements Cloneable {
    String name;
    ClonePilot pilot;

    Cruiser(String name, ClonePilot pilot) {
        this.name = name;
        this.pilot = pilot;
    }

    //Object.clone方法是protected修饰的，无法在外部调用。所以这里需要重载clone方法，改为public修饰，并且处理成员变量浅拷贝的问题。
    public Cruiser clone() {
        try {
            Cruiser dest = (Cruiser) super.clone();
            dest.pilot = this.pilot.clone();
            return dest;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}