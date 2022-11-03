package deepcopy.clonable;

/**
 * @author tim
 * @date 2022/10/1 1:20 下午
 */
public class Test {
    public static void main(String[] args) {
        Cruiser cruiser = new Cruiser("VNI", new ClonePilot("Alex", "male"));
        System.out.println(cruiser);
        Cruiser cloneCruiser = cruiser.clone();
        System.out.println(cloneCruiser);
        System.out.println(cruiser.pilot);
        System.out.println(cloneCruiser.pilot);
        System.out.println(cruiser.pilot.name);
        System.out.println(cloneCruiser.pilot.name);
    }
}
