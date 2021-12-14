import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpitterZombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpitterZombie extends Zombie
{
    private int spitTimer;
    private int spitDelay;
    private boolean isLaunchingSpit;
    private int spitterZombieHp;
      GifImage gifImage = new GifImage("SpitterZombie.gif");
    public SpitterZombie(int spitterZombieHp){
        
        this.spitterZombieHp = spitterZombieHp;
        spitTimer = 0;
        spitDelay = 100;
        isLaunchingSpit = false;
    }
    /**
     * Act - do whatever the SpitterZombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
         setImage(gifImage.getCurrentImage());
        look();
       spitTimer++;
        randomMove();
        hitspitterZombie();
        killSpitterZombie();
    }
    
    
    public void spit(){
        
        SpitShot sp = new SpitShot();
      
        getWorld().addObject(sp, this.getX(), this.getY());
            //Set the rotation of the object based on the soldier's rotation.
            sp.setRotation(this.getRotation());
            spitTimer = 0;
        
    }
    
    public void randomMove(){
        int randomChanceToMove = Greenfoot.getRandomNumber(100);
        int randomToMove = Greenfoot.getRandomNumber(5);
        
        if(spitTimer >= spitDelay){
            
        if(randomChanceToMove < 5){
            move(0);
             spit();
             isLaunchingSpit = true;
        }else{
            isLaunchingSpit = false;
        }
        
     
    }
    
       if(isLaunchingSpit == false){
            move(3);
            
        }
    } 
    
     public void killSpitterZombie() {
        if (spitterZombieHp == 0){
            //getWorld().addObject(new Part(), this.getX(), this.getY());
            getWorld().removeObject(this);
            
        }
    }
    public void hitspitterZombie() {
        if (isTouching(PistolBullet.class)) {
            getWorld().removeObject(getOneIntersectingObject(PistolBullet.class));
            spitterZombieHp--;
        }
    }
        
}

    
