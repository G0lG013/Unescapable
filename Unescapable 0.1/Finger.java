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
    }
}