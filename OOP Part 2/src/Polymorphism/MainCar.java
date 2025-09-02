package Polymorphism;

class Car {
private boolean engine;
private int cylinders;
private String name;
private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }
    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String brake() {
        return "Car -> break()";
    }
}

class Accord extends Car {
    public Accord(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return "Accord -> startEngine()";
    }
    @Override
    public String brake() {
        return "Accord -> brake()";
    }
}

class Vejron extends Car {
    public Vejron(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
        //Vejron -> startEngine()
    }
    @Override
    public String brake() {
        return getClass().getSimpleName() +" -> brake()";
    }
}
public class MainCar {
    public static void main(String[] args) {
        Vejron vejron = new Vejron(4, "Accord");
        System.out.println(vejron.startEngine());
        System.out.println(vejron.brake());
    }
}
