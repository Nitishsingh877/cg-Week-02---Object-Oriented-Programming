package AnimalHierarchy;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

    }
}
