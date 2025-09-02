package Composition.Challenge;

public class Door {
    private int count;

    public Door(int count) {
        this.count = count;
    }

    public void openTheDoor() {
        System.out.println("The door opened");
    }
}
