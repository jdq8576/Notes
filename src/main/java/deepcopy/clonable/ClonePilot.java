package deepcopy.clonable;

public class ClonePilot implements Cloneable {
    String name;
    String sex;

    ClonePilot(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    //因为所有成员变量都是基本类型，所以只需要调用Object.clone()即可
    public ClonePilot clone() {
        try {
            ClonePilot dest = (ClonePilot) super.clone();
            return dest;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}