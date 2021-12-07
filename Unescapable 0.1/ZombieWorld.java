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
    public Soldier soldier;
    public static MouseInfo mouseCoordinate = Greenfoot.getMouseInfo();
    public static boolean crossHairInWorld;
    public static int whichStage;
    
    private GifImage hpGif3 = new GifImage("FullHealth4.gif"); 
    private GifImage hpGif2 = new GifImage("Health2.gif");;
    private GifImage hpGif1 = new GifImage("Health1.gif");
    
   
    //initialize a variable name waveLevel with a data type of integer
    public static int waveLevel;
    
    //initialize a variable name zombieCounter with a data type of integer
    public static int zombieCounter;
    
    public int zombieSpawnDelay;
    public int zombieSpawnTimer;
     public Hp hp = new Hp();
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
        soldier = new Soldier();
        addObject(soldier, 300, 200);
        
        whichStage = 1;
        
        //Set the default value of waveLevel to 1.
        waveLevel = 1;
        
        //Set the default value of zombieCounter to 0
        zombieCounter = 0;
        
        zombieSpawnDelay = 50;
        
        addObject(hp, 100, 625);
        
        setPaintOrder(Soldier.class, Zombie.class, Part.class, Bandage.class, DeadZombie.class);
    }
    
    public void act(){
       
        //A method that adds the crossHair.
        addCrossHair();
        zombieSpawnLocation();
        changeStage();
        zombieSpawnTimer++;
        changeHp();
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
                if (soldier.getSoldierYCoordinate() <= 5 && 
                    soldier.getSoldierXCoordinate() > 400 && 
                    soldier.getSoldierXCoordinate() < 600) {
                    Greenfoot.setWorld(new StageTwo(500, 650));
                    whichStage = 2;
                    //soldier.setLocation(500, 650);
                }
                // If soldier is in StageOne and wants to go to StageFour
                if (soldier.getSoldierXCoordinate() >= 995 && 
                    soldier.getSoldierYCoordinate() > 220 && 
                    soldier.getSoldierYCoordinate() < 480) {
                    Greenfoot.setWorld(new StageFour(50, 350));
                    whichStage = 4;
                    //soldier.setLocation(50, 350);
                }
                // If soldier is in StageOne and wants to go to StageSix
                if (soldier.getSoldierXCoordinate() <= 5 && 
                    soldier.getSoldierYCoordinate() > 220 && 
                    soldier.getSoldierYCoordinate() < 480) {
                    Greenfoot.setWorld(new StageSix(950, soldier.getY()));
                    whichStage = 6;
                    //soldier.setLocation(950, soldier.getY());
                }
                // If soldier is in StageOne and wants to go to StageEight
                if (soldier.getSoldierYCoordinate() >= 695 && 
                    soldier.getSoldierXCoordinate() > 400 && 
                    soldier.getSoldierXCoordinate() < 600) {
                    Greenfoot.setWorld(new StageEight(500, 50));
                    whichStage = 8;
                    //soldier.setLocation(500, 50);
                }
                 
                break;
            case 2: 
                // If soldier is in StageTwo and wants to go to StageThree
                if (soldier.getSoldierYCoordinate() <= 5 && 
                    soldier.getSoldierXCoordinate() > 400 && 
                    soldier.getSoldierXCoordinate() < 600) {
                    Greenfoot.setWorld(new StageThree(500, 650));
                    whichStage = 3;
                    //soldier.setLocation(500, 650);
                }
                // If soldier is in StageTwo and wants to go to StageOne
                if (soldier.getSoldierYCoordinate() >= 695 && 
                    soldier.getSoldierXCoordinate() > 400 && 
                    soldier.getSoldierXCoordinate() < 600) {
                    Greenfoot.setWorld(new StageOne(500, 50));
                    whichStage = 1;
                    //soldier.setLocation(500, 50);
                }
                
                break;
            case 3: 
                // If soldier is in StageThree and wants to go to StageTwo
                if (soldier.getSoldierYCoordinate() >= 695 && 
                    soldier.getSoldierXCoordinate() > 400 && 
                    soldier.getSoldierXCoordinate() < 600) {
                    Greenfoot.setWorld(new StageTwo(500, 50));
                    whichStage = 2;
                    //soldier.setLocation(500, 50);
                }
               
                break;
            case 4:
                // If soldier is in StageFour and wants to go to StageFive
                if (soldier.getSoldierXCoordinate() >= 995 && 
                    soldier.getSoldierYCoordinate() > 220 && 
                    soldier.getSoldierYCoordinate() < 480) {
                    Greenfoot.setWorld(new StageFive(50, 350));
                    whichStage = 5;
                    //soldier.setLocation(50, 350);
                }
                // If soldier is in StageFour and wants to go to StageOne
                if (soldier.getSoldierXCoordinate() <= 5 && 
                    soldier.getSoldierYCoordinate() > 220 && 
                    soldier.getSoldierYCoordinate() < 480) {
                    Greenfoot.setWorld(new StageOne(950, 350));
                    whichStage = 1;
                    //soldier.setLocation(950, 350);
                }
                
                break;
            case 5:
                // If soldier is in StageFive and wants to go to StageFour
                if (soldier.getSoldierXCoordinate() <= 5 && 
                    soldier.getSoldierYCoordinate() > 220 && 
                    soldier.getSoldierYCoordinate() < 480) {
                    Greenfoot.setWorld(new StageFour(950, 350));
                    whichStage = 4;
                    //soldier.setLocation(950, 350);
                }
               
                break;
            case 6:
                // If soldier is in StageSix and wants to go to StageSeven
                if (soldier.getSoldierXCoordinate() <= 5 && 
                    soldier.getSoldierYCoordinate() > 220 && 
                    soldier.getSoldierYCoordinate() < 480) {
                    Greenfoot.setWorld(new StageSeven(950, 350));
                    whichStage = 7;
                    //soldier.setLocation(950, 350);
                }
                // If soldier is in StageSix and wants to go to StageOne
                if (soldier.getSoldierXCoordinate() >= 995 && 
                    soldier.getSoldierYCoordinate() > 220 && 
                    soldier.getSoldierYCoordinate() < 480) {
                    Greenfoot.setWorld(new StageOne(50, 350));
                    whichStage = 1;
                    //soldier.setLocation(50, 350);
                }
              
                break;
            case 7: 
                // If soldier is in StageSeven and wants to go to StageSix
                if (soldier.getSoldierXCoordinate() >= 995 && 
                    soldier.getSoldierYCoordinate() > 220 && 
                    soldier.getSoldierYCoordinate() < 480) {
                    Greenfoot.setWorld(new StageSix(50, 350));
                    whichStage = 6;
                    //soldier.setLocation(50, 350);
                }
                 
                break;
            case 8: 
                // If soldier is in StageEight and wants to go to StageOne
                if (soldier.getSoldierYCoordinate() <= 5 && 
                    soldier.getSoldierXCoordinate() > 400 && 
                    soldier.getSoldierXCoordinate() < 600) {
                    Greenfoot.setWorld(new StageOne(500, 650));
                    whichStage = 1;
                    //soldier.setLocation(500, 650);
                }
                break;
        }
    }
    
    /**
     * A method that spawns zombies on each specific edges of the stage
     *  All stages has the size of 1000 x 700
     *  
     *  top spawn location x = 500, y = 0
     *  left spawn location x = 0, y = 350
     *  right spawn location x = 1000, y = 350
     *  bottom spawn location x = 500, y = 700
     */
    public void zombieSpawnLocation()
    {
        
        //an int array variable topSpawnXnY which has elements of {x,y}
        int []topSpawnXnY = {500, 0};
        //an int array variable leftSpawnXnY which has elements of {x,y}
        int []leftSpawnXnY = {0, 350};
        //an int array variable rightSpawnXnY which has elements of {x,y}
        int []rightSpawnXnY = {1000,350};
        //an int array variable bottomSpawnXnY which has elements of {x,y}
        int [] bottomSpawnXnY = {500, 700};
        
        //an int variable that will contain a random int
        int zombiesRandomSpawn = 0;
        
        //an int array variable zombiesAtX and Y which will set all the elements of SpawnXnY.
        int [] zombiesAtX = {};
        int [] zombiesAtY = {};
        
        //changes the value of zombiesAtX and Y array, and zombiesRandomSpawn depending on which stage
        //
        if(whichStage == 1){
            
            zombiesRandomSpawn = Greenfoot.getRandomNumber(4);
            
            //set the elements value of zombiesAtX and AtY array.
            zombiesAtX = new int[] {topSpawnXnY[0], leftSpawnXnY[0], rightSpawnXnY[0], bottomSpawnXnY[0]};
            zombiesAtY = new int[] {topSpawnXnY[1], leftSpawnXnY[1], rightSpawnXnY[1], bottomSpawnXnY[1]};
        }
        
         if(whichStage == 2 || whichStage == 4 || whichStage == 6)
        {
            zombiesRandomSpawn = Greenfoot.getRandomNumber(2);     
            if(whichStage == 2)
            {
                zombiesAtX = new int[] {bottomSpawnXnY[0],topSpawnXnY[0]};
                zombiesAtY = new int[] {bottomSpawnXnY[1], topSpawnXnY[1]};  
            }
            
            if(whichStage == 4 || whichStage == 6){
                 zombiesAtX = new int[] {leftSpawnXnY[0],rightSpawnXnY[0]};
                zombiesAtY = new int[] {leftSpawnXnY[1], rightSpawnXnY[1]};  
            }
            
        }
        
        else if(whichStage == 3 || whichStage == 5 || whichStage == 7 || whichStage == 8)
        {
            zombiesRandomSpawn = 0;
            if(whichStage == 3)
            {
                 zombiesAtX = new int[] {bottomSpawnXnY[0]};
                zombiesAtY = new int[] {bottomSpawnXnY[1]};  
            }
            
            if(whichStage == 5)
            {
                 zombiesAtX = new int[] {leftSpawnXnY[0]};
                zombiesAtY = new int[] {leftSpawnXnY[1]};  
            }
            
             if(whichStage == 7)
            {
                 zombiesAtX = new int[] {rightSpawnXnY[0]};
                zombiesAtY = new int[] {rightSpawnXnY[1]};  
            }
            
             if(whichStage == 8)
            {
                 zombiesAtX = new int[] {topSpawnXnY[0]};
                zombiesAtY = new int[] {topSpawnXnY[1]};  
            }
        }
        while(zombieCounter < 10 && zombieSpawnTimer >= zombieSpawnDelay)
        {
            
            
            
            addObject(new Zombie(1), zombiesAtX[zombiesRandomSpawn], zombiesAtY[zombiesRandomSpawn]);
            zombieCounter++;
            zombieSpawnTimer = 0;
        
        }
    }
    
  //  public boolean noMoreZombies(){
     //   boolean result = false;
    //    if()    
  //      return result;
  //  }
    
    public void increaseWave(){
        
    }
    public void changeHp() {
        if (soldier.getHpCount() == 3) {
            hp.setImage(hpGif3.getCurrentImage());
        }
        if (soldier.getHpCount() == 2) {
            hp.setImage(hpGif2.getCurrentImage());
        }
        if (soldier.getHpCount() == 1) {
            hp.setImage(hpGif1.getCurrentImage());
        }
    }
}
