package org.academiadecodigo.heroisdovar;

abstract public class Enemy extends GameObject{
    private int health;
    private boolean isDead = false;

    public Enemy(){
        this.health = 100;
    }


    public int getHealth(){
        return health;
    }

    public boolean isDead(){
        return isDead;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setDead(){
        this.isDead = true;
    }

    abstract public void hit(int value);

    public String getMessage() {
        return "I am a soldier";
    }
}
