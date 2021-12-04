import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{
    private String[] dialogue = 
        {"This is how it started...", "I was working late night in the lab", 
        "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10"};
    
    private int curDialogue;
    
    private int cooldownDialogue;
    private int countToCooldown;
    
    /**
     * Constructor for objects of class Intro.
     * 
     */
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        showText("hi", 10, 10);
        curDialogue = 0;
        cooldownDialogue = 10;  
        countToCooldown = 0;
    }
    
    public void act() 
    {
        // Run this only IF enter or click
        nextText();  
        countToCooldown++;
    }
    
    /**
     * To add 
     */
    public void nextText() 
    {
       if (curDialogue < dialogue.length && countToCooldown >= cooldownDialogue
        && (Greenfoot.isKeyDown("enter") || Greenfoot.mouseClicked(this))) {
            showText(dialogue[curDialogue], 10, 10 + (50 * curDialogue));
            curDialogue++;
            countToCooldown = 0;
        }
    }
    
    
}
