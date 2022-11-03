package deepcopy.serialization;

import java.io.Serializable;

public class ClonePilot implements Serializable {
    String name;
    String sex;

    ClonePilot(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

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