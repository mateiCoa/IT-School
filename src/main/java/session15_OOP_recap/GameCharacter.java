package session15_OOP_recap;

public class GameCharacter {

    private Weapon weapon;

    public GameCharacter(Weapon weapon) {
        this.weapon = weapon;
    }

    void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void attack() {
        weapon.use();
    }
}