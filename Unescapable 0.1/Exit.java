import greenfoot.*;
/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Button
{
    public Exit() {
        GreenfootImage startButton = new GreenfootImage(50, 30);
        Font adjustedFont = new Font(30);
        startButton.setFont(adjustedFont);
        startButton.drawString("Exit", 0, 30);
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
            Greenfoot.stop();
        }
    }
}
