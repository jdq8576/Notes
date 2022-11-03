package deepcopy.serialization;

/**
 * @author tim
 * @date 2022/10/1 1:08 下午
 */
public class Test {
    public static void main(String[] args) {
        BattleShip bs = new BattleShip("Dominix", new ClonePilot("Alex", "male"));
        System.out.println(bs);
        System.out.println(bs.name + " " + bs.pilot.name);
        BattleShip cloneBs = (BattleShip) CloneObjUtils.cloneObjBySerialization(bs);
        System.out.println(cloneBs);
        System.out.println(cloneBs.name + " " + cloneBs.pilot.name);
    }
}
