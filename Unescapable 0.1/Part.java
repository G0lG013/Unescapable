import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Part here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part extends Actor
{
    private int amountOfParts = 0;
    
    public Part() {
        
    }
    
    /**
     * Act - do whatever the Part wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        pickUpPart();
    }
    
    public void pickUpPart() {
        if (isTouching(Soldier.class)) {
            amountOfParts++;
            getWorld().removeObject(this);
        }
    }
    
}