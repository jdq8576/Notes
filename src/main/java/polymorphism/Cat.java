package polymorphism;

public class Cat extends Animal {
    public void run() {
        System.out.println("Cat is running...");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }
}
