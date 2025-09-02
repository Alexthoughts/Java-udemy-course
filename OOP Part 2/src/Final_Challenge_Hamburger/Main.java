package Final_Challenge_Hamburger;

public class Main {
    public static void main(String[] args) {
        Base_Hamburger base_hamburger = new Base_Hamburger("BigMac", "classic", 5);
        base_hamburger.getBasePrice();
        base_hamburger.addLettuce(1);
        base_hamburger.getLettucePrice();
        base_hamburger.addBacon(1);
        base_hamburger.getBaconPrice();
        base_hamburger.addCheese(2);
        base_hamburger.getCheesePrice();
        base_hamburger.addTomato(2);
        base_hamburger.getTomatoPrice();
        base_hamburger.getFinalPrice();

        System.out.println("\n");

        Healty_Hamburger healty_hamburger = new Healty_Hamburger("BioBurger", "rye", 5);
        healty_hamburger.getBasePrice();
        healty_hamburger.addLettuce(2);
        healty_hamburger.getLettucePrice();
        healty_hamburger.addBacon(0);
        healty_hamburger.getBaconPrice();
        healty_hamburger.addCheese(1);
        healty_hamburger.getCheesePrice();
        healty_hamburger.addTomato(1);
        healty_hamburger.getTomatoPrice();
        healty_hamburger.addOlives(2);
        healty_hamburger.getOlivesPrice();
        healty_hamburger.addCarrot(1);
        healty_hamburger.getCarrotPrice();
        healty_hamburger.getFinalPrice();

        System.out.println("\n");

        Deluxe_Hamburger deluxe_hamburger = new Deluxe_Hamburger("DeluxeBurger", "classic", 5);
        deluxe_hamburger.getBasePrice();
        deluxe_hamburger.addChips(1);
        deluxe_hamburger.getChipsPrice();
        deluxe_hamburger.addDrinks(1);
        deluxe_hamburger.addDrinks(-1);
        deluxe_hamburger.addDrinks(1);
        deluxe_hamburger.getDrinksPrice();
        deluxe_hamburger.addBacon(5);
        deluxe_hamburger.getBaconPrice();
        deluxe_hamburger.getFinalPrice();
    }
}
