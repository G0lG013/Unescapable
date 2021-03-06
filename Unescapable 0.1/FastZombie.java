import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FastZombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FastZombie extends Zombie
{
    private int fastZombieHp;
    GifImage gifImage = new GifImage("fastZombie.gif");
    public FastZombie(int fastZombieHp) {
        this.fastZombieHp = fastZombieHp;
        getImage().scale(60, 60);
    }
    /**
     * Act - do whatever the FastZombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animate();
        look();
        move(2);
        hitFastZombie();
        killFastZombie();
    }
    public void killFastZombie() {
        if (fastZombieHp == 0){
            getWorld().addObject(new Part(), this.getX(), this.getY());
            getWorld().removeObject(this);
        }
    }
    public void hitFastZombie() {
        if (isTouching(PistolBullet.class)) {
            getWorld().removeObject(getOneIntersectingObject(PistolBullet.class));
            fastZombieHp--;
        }
    }
    /**
     * To animate the zombies
     */
    public void animate() {
        setImage(gifImage.getCurrentImage());
        getImage().scale(60, 60);
    }
}