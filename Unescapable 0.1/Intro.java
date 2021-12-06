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
        {"This is how it started...", "A scientist came and approach me about a mission", 
        "I agreed to do it", "I went to his lab on the night of the mission",
        "Scientist: Hello, nice to see you!", "Soldier: Hi, nice to see you again",
        "Scientist: So this is my time machine", "Soldier: I'll be going to the pass or future",
        "Scientist: The future, you ready?", "Soldier: I hope am",
        "Please proceed near the portal and i'll activate it", "Soldier: Roger!",
        "Scientist: The portal is open. You can go ahead", 
        "After entering the portal. Soldier is surprised on what he see",
        "Soldier: My God! What happened to this place"};
        
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
        curDialogue = 0;
        showText("Press enter to show dialogue", 850, 690);
        cooldownDialogue = 10;  
        countToCooldown = 0;
    }
    
    public void act() 
    {
        // Run this only IF enter or click
        nextText();  
        countToCooldown++;
        setStageOne();
    }
    
    /**
     * To add dialogue
     */
    public void nextText() 
    {
        if (curDialogue < dialogue.length && countToCooldown >= cooldownDialogue
        && (Greenfoot.isKeyDown("enter") || Greenfoot.mouseClicked(this))) {
            showText(dialogue[curDialogue], 500, 10 + (50 * curDialogue));
            curDialogue++;
            countToCooldown = 0;
        }
    }
    
    /**
     * To set StageOne after dialogue
     */
    public void setStageOne() {
        if (curDialogue == dialogue.length) {
            Greenfoot.setWorld(new StageOne());
        }
    }
}
