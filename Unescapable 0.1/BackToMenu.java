import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackToMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackToMenu extends Button
{   private GreenfootImage backToMenuImage;
    public BackToMenu(){
      backToMenuImage = new GreenfootImage("BackToMainMenu.png");
        backToMenuImage.scale(140, 180);
    }
    
    /**
     * Act - do whatever the BackToMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
 
        backToMenuIsClicked();
        }
    
    /**
     * A method that goes returns to Main menu when the user clicked it.
     * In addition it also sets the Soldier's Hp  to full
     */
    public void backToMenuIsClicked(){
           checkMouse();
         if(Greenfoot.mouseClicked(this)) {
             //Gets the current object from zombieworld class.
             Soldier soldier = (Soldier)getWorld().getObjects(Soldier.class).get(0);
             //resets this current soldier object's hp count
             soldier.setHpCount(3);
             
             Greenfoot.setWorld(new Menu());
    }
}

}
