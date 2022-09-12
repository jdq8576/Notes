package polymorphism;

public class AddNumbers {
    public int addition(int x, int y) {
        return x + y;
    }

    public int addition(int x, int y, int z) {
        return x + y + z;
    }

    public int addition(double x, double y) {
        return (int) (x + y);
    }

    public static void main(String[] args) {
        AddNumbers addNumbers = new AddNumbers();
        System.out.println(addNumbers.addition(1, 2));
        System.out.println(addNumbers.addition(1, 2, 3));
        System.out.println(addNumbers.addition(3, 4));
    }
}
