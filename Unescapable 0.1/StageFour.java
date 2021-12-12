import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StageFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageFour extends ZombieWorld
{

    /**
     * Constructor for objects of class StageFour.
     * 
     */
    public StageFour(int x, int y, int dir)
    {
        soldier.setLocation(x, y);
        soldier.setRotation(dir);
    }
}
