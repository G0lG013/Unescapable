import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TankZombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TankZombie extends Zombie
{
    GifImage gifImage = new GifImage("HeavyZombie.gif");
    private int tankZombieHp;
    
    public TankZombie(int tankZombieHp) {
        this.tankZombieHp = tankZombieHp;
    }
    /**
     * Act - do whatever the TankZombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        look();
        move(1);
        hitTankZombie();
        killTankZombie();
    }
    public void killTankZombie() {
        if (tankZombieHp == 0){
            getWorld().addObject(new Part(), this.getX(), this.getY());
            getWorld().removeObject(this);
            
        }
    }
    public void hitTankZombie() {
        if (isTouching(PistolBullet.class)) {
            getWorld().removeObject(getOneIntersectingObject(PistolBullet.class));
            tankZombieHp--;
        }
    }
}
