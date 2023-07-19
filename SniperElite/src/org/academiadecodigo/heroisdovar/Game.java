package org.academiadecodigo.heroisdovar;

public class Game {

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired;


    /*public Game(GameObject[] gameObjects, SniperRifle sniperRifle, int shotsFired) {
        this.gameObjects = gameObjects;
        this.sniperRifle = sniperRifle;
        this.shotsFired = shotsFired;
    }*/


    public GameObject[] getGameObjects() {
        return gameObjects;
    }

    public SniperRifle getSniperRifle() {
        return sniperRifle;
    }

    public int getShotsFired() {
        return shotsFired;
    }

    public void setGameObjects(GameObject[] gameObjects) {
        this.gameObjects = gameObjects;
    }

    public void start() {
        setGameObjects(createObjects(10));
        SniperRifle m14 = new SniperRifle();


        for (int i = 0; i < gameObjects.length; i++) {
            if (gameObjects[i] instanceof Enemy) {
                Enemy enemy1 = (Enemy) gameObjects[i];
                while (!enemy1.isDead()) {
                    m14.shoot(enemy1);
                    shotsFired++;
                    System.out.println(enemy1);
                    if (enemy1.getHealth() == 0){
                        enemy1.setDead();
                        System.out.println("Enemy is dead");
                    }
                }
            } else {
                System.out.println(gameObjects[i].getMessage());
            }
        }
        System.out.println(shotsFired + " shots were fired.");




    }

    public GameObject[] createObjects(int numberOfObjects) {

        GameObject[] objects = new GameObject[numberOfObjects];


        for (int i = 0; i < objects.length; i++) {
            int num = (int) (Math.random() * 8);
            if (num <= 2){
                objects[i] = new Tree();
                continue;
            }
            if (num > 2 && num <= 5){
                objects[i] = new ArmouredEnemy();
                continue;
            }
            if (num > 5 && num <= 7){
                objects[i] = new SoldierEnemy();
                continue;
            }
        }

        return objects;
    }
}
