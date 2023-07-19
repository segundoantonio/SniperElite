package org.academiadecodigo.heroisdovar;

public class SniperRifle {

    private int bulletDamage;

    public SniperRifle() {
        this.bulletDamage = 50;
    }

    public int getBulletDamage() {
        return bulletDamage;
    }

    public void shoot(Enemy enemy) {
        enemy.hit(bulletDamage);
    }
}
