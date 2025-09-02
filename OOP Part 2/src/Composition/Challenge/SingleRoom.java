package Composition.Challenge;

public class SingleRoom {
    private String name;
    private Window window;
    private Door door;
    private Bed bed;
    private Table table;

    public SingleRoom(String name, Window window, Door door, Bed bed, Table table) {
        this.name = name;
        this.window = window;
        this.door = door;
        this.bed = bed;
        this.table = table;
    }

    public void openWindow() {
        window.openTheWindow();
    }

    public Door getDoor() {
        return door;
    }
}

