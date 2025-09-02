package Final_Challenge_Hamburger;

public class Base_Hamburger {
    //Bread roll type, meat, up to 4 additions (lettuce, tomato, bacon, cheese)
    //price: base burger - 5$, lettuce - 0.5$, tomato - 0.5$, bacon - 1$, cheese - 1$
    private String name;
    private String breadType;
    protected double basePrice;
    protected double finalPrice;
    private double oneLettucePrice = 0.5;
    private double lettucePrice;
    private double oneTomatoPrice = 0.5;
    private double tomatoPrice;
    private double oneBaconPrice = 1;
    private double baconPrice;
    private double oneCheesePrice = 1;
    private double cheesePrice;

    public Base_Hamburger(String name, String breadType, double basePrice) {
        this.name = name;
        this.breadType = breadType;
        this.basePrice = basePrice;
    }

    public void addLettuce(int countLettuce) {
        if (countLettuce < 0){
            System.out.println("Count of lettuce can't be negative");
        } else if (countLettuce == 0) {}
        else {
            lettucePrice += countLettuce * oneLettucePrice;
            if (finalPrice < basePrice) {
                finalPrice = finalPrice + basePrice + (countLettuce * oneLettucePrice);
            }else {
                finalPrice = finalPrice + (countLettuce * oneLettucePrice);
            }
        }
    }

    public void addTomato(int countTomato) {
        if (countTomato < 0){
            System.out.println("Count of tomato can't be negative");
        } else if (countTomato == 0) {}
        else {
            tomatoPrice += countTomato * oneTomatoPrice;
            if (finalPrice < basePrice) {
                finalPrice = finalPrice + basePrice + (oneTomatoPrice * countTomato);
            }else {
                finalPrice = finalPrice + (oneTomatoPrice * countTomato);
            }
        }
    }

    public void addBacon(int countBacon) {
        if (countBacon < 0){
            System.out.println("Count of bacon can't be negative");
        }else if (countBacon == 0) {}
        else {
           baconPrice += countBacon * oneBaconPrice;
            if (finalPrice < basePrice) {
                finalPrice = finalPrice + basePrice + (oneBaconPrice * countBacon);
            }else {
                finalPrice = finalPrice + (oneBaconPrice * countBacon);
            }
        }
    }

    public void addCheese(int countCheese) {
        if (countCheese < 0){
            System.out.println("Count of cheese can't be negative");
        }else if (countCheese == 0) {}
        else {
            cheesePrice += countCheese * oneCheesePrice;
            if (finalPrice < basePrice) {
                finalPrice = finalPrice + basePrice + (oneCheesePrice * countCheese);
            }else {
                finalPrice = finalPrice + (oneCheesePrice * countCheese);
            }
        }
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        System.out.println(getName() + ": base price - " + basePrice + "$");
        return basePrice;
    }

    public double getFinalPrice() {
        System.out.println(getName() + ": final price - " + finalPrice + "$");
        return finalPrice;
    }

    public double getLettucePrice() {
        System.out.println("Lettuce - " + lettucePrice + "$");
        return lettucePrice;
    }

    public double getTomatoPrice() {
        System.out.println("Tomato - " + tomatoPrice + "$");
        return tomatoPrice;
    }

    public double getBaconPrice() {
        System.out.println("Bacon - " + baconPrice + "$");
        return baconPrice;
    }

    public double getCheesePrice() {
        System.out.println("Cheese - " + cheesePrice + "$");
        return cheesePrice;
    }
}
