import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StageFive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageFive extends ZombieWorld
{

    /**
     * Constructor for objects of class StageFive.
     * 
     */
    public StageFive(int x, int y)
    {
        soldier.setLocation(x, y);
        soldier.setRotation(0);
        addWall();
         addObject(new SpitterZombie(20), 700, 350);
    }
    
    /**
     * Adding wall to StageFive
     */
    public void addWall()
    {
        for (int i = 0; i < 7; i++) {
            Wall wall = new Wall();
            addObject(wall, 10 + (i * 45), 15);
        }
        for (int i = 0; i < 7; i++) {
            Wall wall = new Wall();
            addObject(wall, 990 - (i * 45), 15);
        }
        for (int i = 0; i < 7; i++) {
            Wall wall = new Wall();
            addObject(wall, 10 + (i * 45), 685);
        }
        for (int i = 0; i < 7; i++) {
            Wall wall = new Wall();
            addObject(wall, 990 - (i * 45), 685);
        }
        for (int i = 0; i < 1; i++) {
            Wall2 wall2 = new Wall2();
            addObject(wall2, 15, 10 + (i * 45));
        }
        for (int i = 0; i < 1; i++) {
            Wall2 wall2 = new Wall2();
            addObject(wall2, 15, 690 - (i * 45));
        }
        for (int i = 0; i < 4; i++) {
            Wall2 wall2 = new Wall2();
            addObject(wall2, 985, 10 + (i * 45));
        }
        for (int i = 0; i < 4; i++) {
            Wall2 wall2 = new Wall2();
            addObject(wall2, 985, 690 - (i * 45));
        }
    }
}
