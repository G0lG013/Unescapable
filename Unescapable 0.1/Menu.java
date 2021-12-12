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
    // Greenfoot image = get;
    public Menu()
    {    
        // Create a new world with 1000x700 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        prepare();
         //image.scale();
        MenuInfo();
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
    
    /**
     * Extra information we need to add in the menu
     */
    public void MenuInfo() {
        showText("MAJED SOLIS DE GUZMAN", 210, 40);
        showText("CALYSTA THEESA", 450, 40);
        showText("JERICHO NIEVA", 640, 40);
        showText("RACHELLE BADUA", 840, 40);
        showText("Game Programming 1", 220, 660);
        showText("Tassia Araujo", 440, 660);
        showText("Ivan Miloslavov", 640, 660);
        showText("Fall 2021", 820, 660);
    }
}
