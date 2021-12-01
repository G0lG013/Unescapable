import greenfoot.*;

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Button
{
    public Start() {
        GreenfootImage startButton = new GreenfootImage(65, 30);
        Font adjustedFont = new Font(30);
        startButton.setFont(adjustedFont);
        startButton.drawString("Start", 0, 30);
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
            Greenfoot.setWorld(new Intro());
        }
    }
}