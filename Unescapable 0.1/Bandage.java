import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bandage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bandage extends Actor
{
    public Bandage() {
    }
    
    /**
     * Act - do whatever the Bandage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        pickUpBandage();
    }
    
    public void pickUpBandage() {
        if (isTouching(Soldier.class)) {
            getWorld().removeObject(this);
        }
    }
}
