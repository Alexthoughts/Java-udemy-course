package Inner_classes;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);

        for (int i=0; i<maxGears; i++) {
            addGear(i, i*5.3);
        }
    }
//    operate clutch = управлять сцеплением
    public void operateClutch (boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear>=0 && newGear<=maxGears && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear: " + newGear);
        } else {
            System.out.println("Can't change the gear");
            this.currentGear = 0;
        }
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        //            revs = обороты, ratio = соотношение
    }
}
