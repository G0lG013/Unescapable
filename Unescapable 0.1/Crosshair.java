import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crosshair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crosshair extends Actor
{
    /**
     * Act - do whatever the Crosshair wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //A method that follows Cursor
        followCursor();
        
    }
    
    /**
     * A method that follows Cursor by setting the location of this class to the cursor's current x and y position 
     * in realtime. In addition, the crosshair image also turns while following the cursor.
     */
    public void followCursor(){
        //Declare mouseLocation object and set its value to the Mouse information.
        MouseInfo mouseLocation = Greenfoot.getMouseInfo();
        
        //if mouse location is not outside the world which is not null
        if(mouseLocation != null){
            //then set the realtime position of this crosshair class to the current x and y position of cursor.
            setLocation( mouseLocation.getX(), mouseLocation.getY());
            //turn the crosshair image to 5.
            turn(5);
        }
    }
}
