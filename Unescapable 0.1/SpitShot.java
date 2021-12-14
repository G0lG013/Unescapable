import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpitShot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpitShot extends Actor
{
     /**
     * Act - do whatever the SpitShot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     

  private  int soldierXPos; 
         private int soldierYPos;
    public SpitShot(){
      
    }
    public void act()
    {
        // Add your action code here.
       move(10);
        removeSpitAtEdge();
       //spitLimit();
    }
    
       public void removeSpitAtEdge(){
        if(this.isAtEdge() || isTouching(Wall.class) || isTouching(Wall2.class)){
            getWorld().removeObject(this);
        }
    }
    
    
    


}
