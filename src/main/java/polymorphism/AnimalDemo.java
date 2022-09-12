package polymorphism;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();

        Animal cat = new Cat();

        dog.run();
        dog.eat();

        cat.run();
        cat.eat();
    }
}
