import greenfoot.*;  
import java.util.*;
import lang.stride.*;

/**
 * 
 */
public class Zombie extends Actor
{
    private int zombieHp;
     ZombieWorld zombieWorld = (ZombieWorld)getWorld();
    //NumberOfDeadZombie
    private int numDeadZombies = 0;
    public Zombie() {
        
    }
    /**
     * Zombie constructor
     */
    public Zombie(int zombieHp) {
        getImage().scale(55, 65);
        this.zombieHp = zombieHp;
    }
    
    private GifImage zombiegif = new GifImage("Zombie_Soldier.gif");
    
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animate();
        look();
        moving(1);
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
    
    public void moving(int move){
        move(move);
    }
    
    public void hitZombie () {
        if (isTouching(PistolBullet.class)) {
            getWorld().removeObject(getOneIntersectingObject(PistolBullet.class));
            zombieHp--;
        }
    }
    
    public void killZombie() {
        if (zombieHp == 0){
            if (Greenfoot.getRandomNumber(100) < 7) {
                getWorld().addObject(new Bandage(), getX(), getY());
            }
            //plays the sound of zombie when its killed.
            Greenfoot.playSound("zombieDead.wav"); 
            getWorld().addObject(new Blood(), getX(), getY());
            getWorld().removeObject(this);
            // if zombie dies then increment the number of dead zombies in the world.
            zombieWorld.deadZombiesInWorld++;
        }
    }
    
    public int getNumDeadZombies(){
        return numDeadZombies; 
    }
}