package Inheritance;

public class Dog extends Animal{
    //части, которые есть у собак
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //super - call constructor from a parent class
    //+ we need to initialized parts of dog
    public Dog(String name, int size, int weight,
               int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override //Ctrl + O -> override method eat from the Animal class.
    //будет выполняться, то что написано ниже, а не в Animals
    public void eat() {
        System.out.println("Dog.eat() called");
        chew(); //call Dog.chew
        super.eat(); //call Animal.eat
    }

    public void walk() {
        super.move(5);
        System.out.println("Dog.walk() called");
    }

    public void run() {
        super.move(10);
        System.out.println("Dog.run() called");
    }

}
