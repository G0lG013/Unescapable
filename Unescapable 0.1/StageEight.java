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
        timer = 2000;
    }
    public void act() {
        //countdown();
        showTimer();
        changeHp();
    }
    public int getTimer() {
        return timer;
    }
    public void showTimer() {
        showText("Timer: " + getTimer(), 800, 600);
    }
    //public void countDown() {
        //if (part.getAmountofParts() == 2) {
            //timer--;
        //}
    //}
}