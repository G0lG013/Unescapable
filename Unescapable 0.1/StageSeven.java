import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StageSeven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageSeven extends ZombieWorld
{

    /**
     * Constructor for objects of class StageSeven.
     * 
     */
    public StageSeven(int x, int y)
    {
        soldier.setLocation(x, y);
        soldier.setRotation(180);
        populate();
        addWall();
    }
    
    public void populate() {
       addObject(new TankZombie(20), 200, 350);
    }
    
    /**
     * Adding wall to StageSeven
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
        for (int i = 0; i < 4; i++) {
            Wall2 wall2 = new Wall2();
            addObject(wall2, 15, 10 + (i * 45));
        }
        for (int i = 0; i < 4; i++) {
            Wall2 wall2 = new Wall2();
            addObject(wall2, 15, 690 - (i * 45));
        }
        for (int i = 0; i < 1; i++) {
            Wall2 wall2 = new Wall2();
            addObject(wall2, 985, 10 + (i * 45));
        }
        for (int i = 0; i < 1; i++) {
            Wall2 wall2 = new Wall2();
            addObject(wall2, 985, 690 - (i * 45));
        }
    }
}
