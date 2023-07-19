package org.academiadecodigo.heroisdovar;

public class SoldierEnemy extends Enemy {


    public void hit(int value) {
        setHealth(getHealth() - value);
    }

    public String toString() {
        return "You have " + getHealth() + " health";
    }
}
