package exercise3;

public class Player {

    private int health;
    private int strength;
    private int lives;
    private int healthBackup;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health < 0 ? 0 : health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {

        this.strength = strength < 0 ? 0 : strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives < 0 ? 0 : lives;
    }

    public Player(int health, int strength, int lives) {
        setHealth(health);
        setStrength(strength);
        setLives(lives);
        this.healthBackup = health < 0 ? 0 : health;


    }

    public void decrementLive() {
        if (lives < 0) {
            // Cementario
        } else {
            lives = lives--;
            setHealth(healthBackup);
        }

    }

    public void attack(Player playerWhoAttack) {
        setHealth(health - playerWhoAttack.getStrength());
        if (health <= 0) {
            decrementLive();
        }

    }
}
