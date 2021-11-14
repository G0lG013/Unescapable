import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZombieWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZombieWorld extends World
{
    //static instance Objects & variable with boolean data type.
    public static Crosshair crossHair = new Crosshair();
    public static Soldier soldier = new Soldier();
    public static MouseInfo mouseCoordinate = Greenfoot.getMouseInfo();
    public static boolean crossHairInWorld;
    /**
     * Constructor for objects of class ZombieWorld.
     * 
     */
    public ZombieWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        //set this variable to false since crossHair hasn't been added yet at the beginning of the game
        //this variable is used for either adding or removing crosshair inside the world
        crossHairInWorld = false;
        
        //adds the object in the middle of World.
        addObject(soldier, 300, 200);
        
       
       
    }
    
    public void act(){
       
        //A method that adds the crossHair.
        addCrossHair();
      
    }
    
    public void addCrossHair(){
      //initialized the value of mouseCoordinateX to soldier's X-coordinate position.  
      int mouseCoordinateX = soldier.getX();
       //initialized the value of mouseCoordinateY to soldier's Y-coordinate position.  
      int mouseCoordinateY = soldier.getY();
      //turns the object crosshair
      crossHair.turn(5);
        
      //if mouseCoordinate is not null(cursor is inside the world) && if crossHairInWorld is false
      if(mouseCoordinate!= null && !crossHairInWorld){ 
          //set mouseCoordinateX to the current X position of cursor
           mouseCoordinateX = mouseCoordinate.getX();
           //set mouseCoordinateY to the current Y position of cursor
          mouseCoordinateY = mouseCoordinate.getY();
          //set crossHairInWorld to true to confirm that crossHair will spawn in the world.
          crossHairInWorld = true;
    }else{
        //else(if cursor is outside world) then, remove the crossHair object in the world 
          removeObject(crossHair);
          //set crosshairInWorld to false to confirm that crossHair is removed from the world.
            crossHairInWorld = false;
        }
        /**
         * Adds the object crosshair in ZombieWorld since mouseCoordinateX & mouseCoordinateY is at soldier's position if cursor is outside the world
         * but, if the cursor is inside the world then, it will update these position so that the crosshair object will be at cursor's position.
         */
        addObject(crossHair, mouseCoordinateX, mouseCoordinateY);
    }
    
    
    
    
    
    
    
   
}
