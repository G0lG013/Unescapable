import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StageSeven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageSeven extends ZombieWorld
{

    /**
     * Constructor for objects of class StageSeven.
     * 
     */
    public StageSeven(int x, int y)
    {
        soldier.setLocation(x, y);
        populate();
    }
    public void populate() {
       addObject(new TankZombie(20), 200, 350);
    }
}
