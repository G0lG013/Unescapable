import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StageThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageThree extends ZombieWorld
{

    /**
     * Constructor for objects of class StageThree.
     * 
     */
    public StageThree(int x, int y)
    {
        soldier.setLocation(x, y);
        soldier.setRotation(270);
        populate();
    }
    public void populate() {
       addObject(new FastZombie(10), 500, 200);
    }
}
