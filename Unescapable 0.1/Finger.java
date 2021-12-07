import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Finger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Finger extends Actor
{
    GifImage gifImage = new GifImage("ChosenHandMenu.gif");

    /**
     * Act - do whatever the finger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(gifImage.getCurrentImage());
        chooseMenu();
    }
    /***
     * A method that sets the location of the finger depending on mouse 
     * coordinates. 
     */
    public void chooseMenu(){
          MouseInfo mousePosition = Greenfoot.getMouseInfo();
          if(mousePosition !=null){
              
              if(mousePosition.getY() < 410){
              
              this.setLocation(390, 400);
              
            }
             if(mousePosition.getY() > 450 && mousePosition.getY() <= 500 ){
                this.setLocation(390, 500);
                
            }
            
            if(mousePosition.getX() > 890 && 
            mousePosition.getY() > 500 && mousePosition.getY() <= 710 )
            this.setLocation(780, 600);
            }
          
        
    }
    
    
}