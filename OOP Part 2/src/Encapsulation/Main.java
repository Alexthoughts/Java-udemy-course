package Encapsulation;

public class Main {
    public static void main(String[] args) {/*
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "knife";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health " + player.healthRemaining());*/

        EnchancedPlayer player = new EnchancedPlayer("Tim", 200, "knife");
//        player.health - нельзя менять т.к. health is private
        System.out.println("Initial health is " + player.getHealth());
        //100 т.к. this.health = 100, а this.health = health if (health > 0 && health <= 100)
    }



}
