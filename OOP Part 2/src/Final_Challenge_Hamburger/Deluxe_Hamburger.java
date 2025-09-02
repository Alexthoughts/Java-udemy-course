package Final_Challenge_Hamburger;

public class Deluxe_Hamburger extends Base_Hamburger{
    //basic burger (Bread roll type and meat) + chips + drink
    //without any additions
    //base burger - 5$, chips - 3$, drink - 2$
    private double oneChipsPrice = 3;
    private double chipsPrice;
    private double drinkPrice = 2;
    private double drinksPrice;

    public Deluxe_Hamburger(String name, String breadType, double basePrice) {
        super(name, breadType, basePrice);
    }

    public void addChips (int countChips) {
        if (countChips < 0) {
            System.out.println("Count of chips can't be negative");
        } else if (countChips == 0) {
        }else {
                chipsPrice += countChips * oneChipsPrice;
            if (finalPrice < basePrice) {
                finalPrice = finalPrice + basePrice + (oneChipsPrice * countChips);
            } else {
                finalPrice = finalPrice + (oneChipsPrice * countChips);
            }
        }
    }

    public void addDrinks (int countDrinks) {
        if (countDrinks < 0) {
            System.out.println("Count of drinks can't be negative");
        } else if (countDrinks == 0) {}
        else {
            drinksPrice += countDrinks * drinkPrice;
            if (finalPrice < basePrice) {
                finalPrice = finalPrice + basePrice + (countDrinks * drinkPrice);
            } else {
                finalPrice = finalPrice + (countDrinks * drinkPrice);
            }
        }
    }

    //перепишем методы из класса Base_Burger т.к. в Deluxe нельзя добавлять ингридиенты
    @Override
    public void addLettuce(int countLettuce) {
        System.out.println("Cannot add additions to DeluxeBurger");
    }

    @Override
    public void addTomato(int countTomato) {
        System.out.println("Cannot add additions to DeluxeBurger");
    }

    @Override
    public void addBacon(int countBacon) {
        System.out.println("Cannot add additions to DeluxeBurger");
    }

    @Override
    public void addCheese(int countCheese) {
        System.out.println("Cannot add additions to DeluxeBurger");
    }

    public double getChipsPrice() {
        System.out.println("Chips - " + chipsPrice + "$");
        return chipsPrice;
    }

    public double getDrinksPrice() {
        System.out.println("Drinks - " + drinksPrice + "$");
        return drinksPrice;
    }
}
