import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StageEight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageEight extends ZombieWorld
{
    public int timer;
    //public Part part = new Part();
    /**
     * Constructor for objects of class StageEight.
     * 
     */
    public StageEight(int x, int y)
    {
        soldier.setLocation(x, y);
        soldier.setRotation(90);
        timer = 200;
        addWall();
        addObject(new Computer(), 500, 500);
    }
    
    public void act() {
        countDown();
        showTimer();
        changeHp();
        addPortal();
    }
    public void countDown() {
        if (timer > 0) {
            timer--;
        }
    }
    public int getTimer() {
        return timer;
    }
    
    public void showTimer() {
        showText("Timer: " + getTimer(), 800, 600);
    }
    
    /**
     * Adding wall to StageEight
     */
    public void addWall()
    {
        for (int i = 0; i < 4; i++) {
            Wall wall = new Wall();
            addObject(wall, 10 + (i * 45), 15);
        }
        for (int i = 0; i < 4; i++) {
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
        for (int i = 0; i < 4; i++) {
            Wall2 wall2 = new Wall2();
            addObject(wall2, 985, 10 + (i * 45));
        }
        for (int i = 0; i < 4; i++) {
            Wall2 wall2 = new Wall2();
            addObject(wall2, 985, 690 - (i * 45));
        }
    }
    
    public void addPortal() {
        if (timer <= 0) {
            addObject(new Portal(), 500, 200);
        }
    }
}   