package Abstract_classes;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat(); //all must eat
    public abstract void breath();// all must breathe

    public String getName() {
        return name;
    }
}
