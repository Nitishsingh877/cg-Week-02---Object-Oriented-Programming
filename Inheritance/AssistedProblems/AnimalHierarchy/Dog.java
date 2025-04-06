package AnimalHierarchy;

public class Dog extends Animal{
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("dog produce sound called Bark ");
    }
}
