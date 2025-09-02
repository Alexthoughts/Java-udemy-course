package Inheritance;

public class Accord extends Car {
    private int roadService;

    public Accord(int roadService) {
        super("Accord", "2WD", 5, 5, 6, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate){ //change gears (automatic transmission)
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
            changeGear(1);
        }else if (newVelocity > 0 && newVelocity <= 20){
            changeGear(1);
        }else if (newVelocity > 20 && newVelocity <= 40){
            changeGear(2);
        }else if (newVelocity > 40 && newVelocity <= 60){
            changeGear(3);
        }else if (newVelocity > 60 && newVelocity <= 80){
            changeGear(4);
        }else {
            changeGear(5);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}

