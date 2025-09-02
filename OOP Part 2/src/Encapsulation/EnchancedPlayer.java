package Encapsulation;

public class EnchancedPlayer {
    private String name;
    private int health = 100; //not accessible from another class
    private String weapon;

    public EnchancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player died");
            //Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return health;
    }
}
