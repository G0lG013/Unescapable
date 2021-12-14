import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Button
{
    private GreenfootImage instruction;
    public Instructions()
    {
        instruction = new GreenfootImage("Controls.png");
        //GreenfootImage instructionButton = new GreenfootImage(100,60);
        //Font adjustedFont = new Font(20);
        //instructionButton.setFont(adjustedFont);
        //instructionButton.drawString("Instructions", 0, 30);
        //instructionButton.setColor(Color.WHITE);
        setImage(instruction);
    }
    
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkMouse();
        
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Instruction());
        }
    }
}
