import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PistolBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PistolBullet extends Actor
{   
    /**
     * Act - do whatever the PistolBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
       
        move(10);
       //A method that removes the bullet once its reach the edge of the world.
        removeBulletAtEdge();
      
    }
    /**
     * A method that removes the bullet at the edge.
     */
    public void removeBulletAtEdge(){
        if(this.isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
   
    
}
