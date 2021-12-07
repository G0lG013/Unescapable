import greenfoot.*;
/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Button
{
    private GreenfootImage exit;
    public Exit() {
        exit = new GreenfootImage("Exit.png");
        exit.scale(140, 130);
        //Font adjustedFont = new Font(30);
        //startButton.setFont(adjustedFont);
        //startButton.drawString("Exit", 0, 30);
        //startButton.setColor(Color.WHITE);
        setImage(exit);
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
