import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soldier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soldier extends Actor
{   
    //Declared an instance object gifImage with a value of the survivor gif file from image.
    GifImage gifImage = new GifImage("soldierWithGunStanding.gif");
    //Declared three instance variables with each data types of int.
    private int pistolReloadTime;
    private int delayPistolCount;
    private int runningLimit;
    public static int hpCount;
    //private int hpCount;
    private int hitCd;
    private int hitCdTimer;
    Bandage bandage = new Bandage();
    //declaring an object from DeadZombie class (to get the image)
    DeadZombie deadZombie = new DeadZombie();
    
    //
    
    /**
     * Constructor
     */
    public Soldier()
    {  
       //Set the value to 20 inside the constructor. if we change this value less than 20 then, the fire rate of the pistol will increased.  
       pistolReloadTime = 20;
       //initialize the value to 0 inside the contructor
       delayPistolCount = 0;
       hitCd = 50; 
       hitCdTimer = 0;
       hpCount = 3;
    }
    
    /**
     * Act - do whatever the Soldier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //Increment delayPistolCount so that it will reach the value of the pistolReloadTime.
        delayPistolCount++;
        
        //Sets the image of the soldier based on gifImage object
        setImage(gifImage.getCurrentImage());
        //A method that enables the user to control the main character
        userInput();
        
        //A method that changes the direction of main character depending on the mouse position
        direction();
        
        increaseHp();
         
        die();
        hitCdTimer++;
    }
    
    /**
     * userInput method which sets all the user's control for the soldier object.
     * 
     */
    public void userInput()
    {   
        // record current position
        int curX = getX();
        int curY = getY();
        if(hpCount > 0){
        //If w is pressed on the keyboard
        if(Greenfoot.isKeyDown("w"))
        {   //Soldier will move forward
            move(2);
            //If shift and w is pressed the soldier will run.
            if(Greenfoot.isKeyDown("shift")){
                move(3);
            }
        }
        
        //if s is pressed on the keyboard
         if(Greenfoot.isKeyDown("s"))
        {   //Soldier will move backward
            move(-2);
        }
        
        // Now that we moved, are we inside a fence (touching)?
        // IF yes, then "cancel" the move
        if (isTouching(HorizontalFence.class) || isTouching(VerticalFence.class)) 
        {
            setLocation(curX, curY);

        }
        
        //Calls a method shootPistol() when the user pressed space in the keyboard
        if(Greenfoot.isKeyDown("space"))
        {   
            shootPistol();
        
        }
    }
    }
    
    /**
     * A method that enables to change the main character's direction based on the cursor's position.
     */
    public void direction()
    {
        MouseInfo mouseDirection = Greenfoot.getMouseInfo();
        if(mouseDirection != null){
            turnTowards(mouseDirection.getX(), mouseDirection.getY());
        }
    }
    /**
     * Method that stops the gameplay when the soldier died.
     * Note: Going back to main menu is not yet implemented.
     */
    public void die() {
        boolean soldierIsDead;
        if (isTouching(Zombie.class) && hitCdTimer >= hitCd && hpCount > 0) {
            hpCount--;
            hitCdTimer = 0;
            Greenfoot.playSound("Pain.wav");
            soldierIsDead = false;
        }
      
        
         if (hpCount == 0) {
                Greenfoot.playSound("die.wav");
                
                hpCount = -1;
               
                
            }
         
            if(hpCount == -1){
                
                
                setImage(deadZombie.getImage());
                //getWorld().removeObject(zombie);
            }
    }
    
    public void increaseHp() {
        if (isTouching(Bandage.class)) {
            if (hpCount < 3) {
                hpCount++;
            }
        }
    }
    
    /**
     * A method that enables the main character to shoot pistol
     */
    public void shootPistol(){
        //Initialized an object pb from pistolBullet class   
        PistolBullet pb = new PistolBullet();
        
        //if the pistolRealodTime 20 is greater than <= delayPistolCount 20 above(since its incremented inside the act method) then,
        if( pistolReloadTime <= delayPistolCount){
            //spawn a bullet in the world with the same x and y position of the soldier.
            getWorld().addObject(pb, this.getX(), this.getY());
            //Set the rotation of the object based on the soldier's rotation.
            pb.setRotation(this.getRotation());
           //reset the delayCount so that it will reincrease from act method and reavalute from if statement above. 
           delayPistolCount = 0;
           //Sound added.
           Greenfoot.playSound("gunShot.wav");
        }
    }
    
    /**
     * A method that returns he current X coordinate position of the survivor.
     */
    public int getSoldierXCoordinate()
    {
       return this.getX(); 
    }
    
    /**
     * A method that returns the current X coordinate position of the survivor.
     */
    public int getSoldierYCoordinate()
    {
        return this.getY();
    }
    
    public void setHpCount(int hp) {
        this.hpCount = hp;
    }
    
    public int getHpCount() {
        return this.hpCount;
    }
    
    public Soldier getSoldier() {
        return this;
    }
}
