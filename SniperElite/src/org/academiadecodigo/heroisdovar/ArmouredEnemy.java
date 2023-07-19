package org.academiadecodigo.heroisdovar;

public class ArmouredEnemy extends Enemy{
    private int armour;

    public ArmouredEnemy(){
        this.armour = 50;
    }

    public int getArmour(){
        return armour;
    }

    public void setArmour(int armour){
        this.armour = armour;
    }

    public void hit(int value){
        if (armour > 0){
            setArmour(getArmour() - value);
        } else {
            setHealth(getHealth() - value);
        }
    }

    public String toString(){
        return "You have " + armour + " armour and " + getHealth() + " health";
    }
}
