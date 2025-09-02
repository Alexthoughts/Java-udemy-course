package Final_Challenge_Hamburger;

public class Healty_Hamburger extends Base_Hamburger {
    //Brown rye bread roll, meat + up to 6 additional items (4 basic + 2 special)
    //basics:base burger - 5$, lettuce - 0.5$, tomato - 0.5$, bacon - 1$, cheese - 1$
    //specials: carrot - 0.5$, olives - 1$
    private double oneCarrotPrice = 0.5;
    private double carrotPrice;
    private double olivePrice = 1;
    private double olivesPrice;

    public Healty_Hamburger(String name, String breadType, double basePrice) {
        super(name, breadType, basePrice);
    }

    public void addCarrot(int countCarrot) {
        if (countCarrot < 0) {
            System.out.println("Count of carrot can't be negative");
        } else if (countCarrot == 0) {
        }else {
            carrotPrice += countCarrot * oneCarrotPrice;
            if (finalPrice < basePrice) {
                finalPrice = finalPrice + basePrice + (oneCarrotPrice * countCarrot);
            } else {
                finalPrice = finalPrice + (oneCarrotPrice * countCarrot);
            }
        }
    }

    public void addOlives(int countOlives) {
        if (countOlives < 0) {
            System.out.println("Count of olives can't be negative");
        } else if (countOlives == 0) {
        }else {
            olivesPrice += countOlives * olivePrice;
            if (finalPrice < basePrice) {
                finalPrice = finalPrice + basePrice + (olivePrice * countOlives);
            } else {
                finalPrice = finalPrice + (olivePrice * countOlives);
            }
        }
    }

    public double getCarrotPrice() {
        System.out.println("Carrot - " + carrotPrice + "$");
        return carrotPrice;
    }

    public double getOlivesPrice() {
        System.out.println("Olives - " + olivesPrice + "$");
        return olivesPrice;
    }
}
