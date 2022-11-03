package deepcopy.serialization;

import java.io.Serializable;

public class BattleShip implements Serializable {
    String name;
    ClonePilot pilot;

    BattleShip(String name, ClonePilot pilot) {
        this.name = name;
        this.pilot = pilot;
    }
}