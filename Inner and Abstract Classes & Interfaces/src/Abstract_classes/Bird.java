package Abstract_classes;

public abstract class Bird extends Animal {
    // abstract because birds can fly + eat and breath from animal abstract class
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breath() {
        System.out.println(getName() + " is breathing");
    }

    public abstract void fly(); //birds can fly
}
