import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends World
{
    private GreenfootImage creditContent;
    /**
     * Constructor for objects of class Credit.
     * 
     */
    public Credit()
    {    
        super(1000, 700, 1); 
        creditContent = new GreenfootImage("CreditsContent.png");
        creditContent.scale(800, 500);
        getBackground().drawImage(creditContent, 110, 100);
        showText("Press shift to go back to menu", 195, 632);
    }
    
    public void act() {
        pressToBackToMenu();
    }
    
    /**
     * Press shift to go back to menu
     */
    public void pressToBackToMenu() {
        if (Greenfoot.isKeyDown("shift")) {
            Greenfoot.setWorld(new Menu());
        }
    }
}
