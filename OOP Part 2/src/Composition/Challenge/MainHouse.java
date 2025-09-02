package Composition.Challenge;

public class MainHouse {
    public static void main(String[] args) {
        Window window = new Window(1);
        Door door = new Door(2);
        Bed bed = new Bed(1);
        Table table = new Table(2);
        SingleRoom bedRoom = new SingleRoom("bedroom", window, door, bed, table);

        bedRoom.getDoor().openTheDoor(); //два варианта с одинаковым результатом
        bedRoom.openWindow(); //composition
    }
}
