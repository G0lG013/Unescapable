import greenfoot.*;  
import java.util.*;
import lang.stride.*;

/**
 * 
 */
public class Zombie extends Actor
{
    private int zombieHp;
    
    
    //NumberOfDeadZombie
    private int numDeadZombies = 0;
    /**
     * Zombie constructor
     */
    public Zombie(int zombieHp) {
        getImage().scale(55, 65);
        this.zombieHp = zombieHp;
    }
    
    private GifImage zombiegif = new GifImage("zombieGif.gif");
    
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animate();
        look();
        move(1);
        eatSoldier();
        hitZombie();
        killZombie();
    }
    
    /**
     * To animate the zombies
     */
    public void animate() {
        setImage(zombiegif.getCurrentImage());
        getImage().scale(55, 65);
    }
    
    /**
     * To face towards the soldier
     */
    public void look() {
        Actor soldier = (Actor)getWorld().getObjects(Soldier.class).get(0);
        turnTowards(soldier.getX(), soldier.getY());
    }
    
    /**
     * To eat the soldier
     */
    public void eatSoldier() {
        if (isTouching(Soldier.class)) {
            removeTouching(Soldier.class);
            Greenfoot.stop();
        }
    }
    
    public void hitZombie () {
        if (isTouching(PistolBullet.class)) {
            getWorld().removeObject(getOneIntersectingObject(PistolBullet.class));
            zombieHp--;
        }
    }
    
    public void killZombie() {
        if (zombieHp == 0){
            getWorld().removeObject(this);
            numDeadZombies++;// if zombie dies then increment the number of dead zombies
        }
    }
    
    public int getNumDeadZombies(){
        return numDeadZombies; 
    }
    
    
}