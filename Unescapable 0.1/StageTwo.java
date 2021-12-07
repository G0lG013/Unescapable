import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StageTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageTwo extends ZombieWorld
{

    /**
     * Constructor for objects of class StageTwo.
     * 
     */
    public StageTwo(int x, int y)
    {
        soldier.setLocation(x, y);
       // addFence();
    }
    
    /**
     * Adding fence to StageTwo
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
        for (int i = 0; i < 7; i++) {
            VerticalFence verticalFence = new VerticalFence();
            addObject(verticalFence, 10, 65 + (i * 95));
        }
        for (int i = 0; i < 7; i++) {
            VerticalFence verticalFence = new VerticalFence();
            addObject(verticalFence, 990, 65 + (i * 95));
        }
    }
}
