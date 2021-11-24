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
    
    public static int whichStage;  
    
    /**
     * Constructor for objects of class ZombieWorld.
     * 
     */
    public ZombieWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        
        //set this variable to false since crossHair hasn't been added yet at the beginning of the game
        //this variable is used for either adding or removing crosshair inside the world
        crossHairInWorld = false;
        
        //adds the object in the middle of World.
        addObject(soldier, 300, 200);
        
        whichStage = 1;
        
    }
    
    public void act(){
       
        //A method that adds the crossHair.
        addCrossHair();
        changeStage();
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
    
    /**
     * Which stages depending in which stage you are in.
     */
    public void changeStage()
    {
        switch (whichStage) {
            case 1: 
                // If soldier is in StageOne and wants to go to StageTwo
                if (soldier.getSoldierYCoordinate() <= 5) {
                    StageTwo stageTwo = new StageTwo();
                    Greenfoot.setWorld(stageTwo);
                    whichStage = 2;
                    soldier.setLocation(500, 650);
                }
                // If soldier is in StageOne and wants to go to StageFour
                if (soldier.getSoldierXCoordinate() >= 995) {
                    StageFour stageFour = new StageFour();
                    Greenfoot.setWorld(stageFour);
                    whichStage = 4;
                    soldier.setLocation(50, 350);
                }
                // If soldier is in StageOne and wants to go to StageSix
                if (soldier.getSoldierXCoordinate() <= 5) {
                    StageSix stageSix = new StageSix();
                    Greenfoot.setWorld(stageSix);
                    whichStage = 6;
                    soldier.setLocation(950, 350);
                }
                // If soldier is in StageOne and wants to go to StageEight
                if (soldier.getSoldierYCoordinate() >= 695) {
                    StageEight stageEight = new StageEight();
                    Greenfoot.setWorld(stageEight);
                    whichStage = 8;
                    soldier.setLocation(500, 50);
                }
                break;
            case 2: 
                // If soldier is in StageTwo and wants to go to StageThree
                if (soldier.getSoldierYCoordinate() <= 5) {
                    StageThree stageThree = new StageThree();
                    Greenfoot.setWorld(stageThree);
                    whichStage = 3;
                    soldier.setLocation(500, 650);
                }
                // If soldier is in StageTwo and wants to go to StageOne
                if (soldier.getSoldierYCoordinate() >= 695) {
                    StageOne stageOne = new StageOne();
                    Greenfoot.setWorld(stageOne);
                    whichStage = 1;
                    soldier.setLocation(500, 50);
                }
                break;
            case 3: 
                // If soldier is in StageThree and wants to go to StageTwo
                if (soldier.getSoldierYCoordinate() >= 695) {
                    StageTwo stageTwo = new StageTwo();
                    Greenfoot.setWorld(stageTwo);
                    whichStage = 2;
                    soldier.setLocation(500, 50);
                }
                break;
            case 4:
                // If soldier is in StageFour and wants to go to StageFive
                if (soldier.getSoldierXCoordinate() >= 995) {
                    StageFive stageFive = new StageFive();
                    Greenfoot.setWorld(stageFive);
                    whichStage = 5;
                    soldier.setLocation(50, 350);
                }
                // If soldier is in StageFour and wants to go to StageOne
                if (soldier.getSoldierXCoordinate() <= 5) {
                    StageOne stageOne = new StageOne();
                    Greenfoot.setWorld(stageOne);
                    whichStage = 1;
                    soldier.setLocation(950, 350);
                }
                break;
            case 5:
                // If soldier is in StageFive and wants to go to StageFour
                if (soldier.getSoldierXCoordinate() <= 5) {
                    StageFour stageFour = new StageFour();
                    Greenfoot.setWorld(stageFour);
                    whichStage = 4;
                    soldier.setLocation(950, 350);
                }
                break;
            case 6:
                // If soldier is in StageSix and wants to go to StageSeven
                if (soldier.getSoldierXCoordinate() <= 5) {
                    StageSeven stageSeven = new StageSeven();
                    Greenfoot.setWorld(stageSeven);
                    whichStage = 7;
                    soldier.setLocation(950, 350);
                }
                // If soldier is in StageSix and wants to go to StageOne
                if (soldier.getSoldierXCoordinate() >= 995) {
                    StageOne stageOne = new StageOne();
                    Greenfoot.setWorld(stageOne);
                    whichStage = 1;
                    soldier.setLocation(50, 350);
                }
                break;
            case 7: 
                // If soldier is in StageSeven and wants to go to StageSix
                if (soldier.getSoldierXCoordinate() >= 995) {
                    StageSix stageSix = new StageSix();
                    Greenfoot.setWorld(stageSix);
                    whichStage = 6;
                    soldier.setLocation(50, 350);
                }
                break;
            case 8: 
                // If soldier is in StageEight and wants to go to StageOne
                if (soldier.getSoldierYCoordinate() <= 5) {
                    StageOne stageOne = new StageOne();
                    Greenfoot.setWorld(stageOne);
                    whichStage = 1;
                    soldier.setLocation(500, 650);
                }
                break;
        }
    }
}
