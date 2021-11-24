import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StageOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageOne extends ZombieWorld
{

    /**
     * Constructor for objects of class StageOne.
     * 
     */
    public StageOne()
    {
       addFence();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    /**
     * Adding fence to StageOne
     */
    public void addFence()
    {
        for (int i = 0; i < 4; i++) {
            HorizontalFence horizontalFence = new HorizontalFence();
            addObject(horizontalFence, 48 + (i * 95), 10);
        } 
        for (int i = 0; i < 4; i++) {
            HorizontalFence horizontalFence = new HorizontalFence();
            addObject(horizontalFence, 667 + (i * 95), 10);
        }
        for (int i = 0; i < 4; i++) {
            HorizontalFence horizontalFence = new HorizontalFence();
            addObject(horizontalFence, 48 + (i * 95), 690);
        }
        for (int i = 0; i < 4; i++) {
            HorizontalFence horizontalFence = new HorizontalFence();
            addObject(horizontalFence, 667 + (i * 95), 690);
        }
        for (int i = 0; i < 2; i++) {
            VerticalFence verticalFence = new VerticalFence();
            addObject(verticalFence, 10, 65 + (i * 95));
        }
        for (int i = 0; i < 2; i++) {
            VerticalFence verticalFence = new VerticalFence();
            addObject(verticalFence, 10, 540 + (i * 95));
        }
        for (int i = 0; i < 2; i++) {
            VerticalFence verticalFence = new VerticalFence();
            addObject(verticalFence, 990, 65 + (i * 95));
        }
        for (int i = 0; i < 2; i++) {
            VerticalFence verticalFence = new VerticalFence();
            addObject(verticalFence, 990, 540 + (i * 95));
        }
    }
}
