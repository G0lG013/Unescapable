import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends Button
{
    public Credits()
    {
        GreenfootImage startButton = new GreenfootImage(70, 30);
        Font adjustedFont = new Font(20);
        startButton.setFont(adjustedFont);
        startButton.drawString("Credits", 0, 30);
        startButton.setColor(Color.WHITE);
        setImage(startButton);
    }
    
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkMouse();
        
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Credit());
        }
    }
}
