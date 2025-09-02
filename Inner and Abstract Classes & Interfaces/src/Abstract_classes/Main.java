package Abstract_classes;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Malysh");
        dog.eat();
        dog.breath();

        Parrot parrot = new Parrot("Kesha");
        parrot.eat();
        parrot.breath();
        parrot.fly();
    }
}
