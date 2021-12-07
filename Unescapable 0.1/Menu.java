import greenfoot.*;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 1000x700 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        prepare();
    }

    public void act() 
    {
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,500,400);
        //start.setLocation(500,480);
        Exit exit = new Exit();
        addObject(exit,500,500);
        //exit.setLocation(500,570);
        Credits credits = new Credits();
        addObject(credits, 890, 600);
        //credits.setLocation(900, 600);
        Finger finger = new Finger();
        addObject(finger, 390, 400);
    }
}
