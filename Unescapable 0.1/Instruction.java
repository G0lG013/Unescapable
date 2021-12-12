import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction extends World
{

    /**
     * Constructor for objects of class Instruction.
     * 
     */
    public Instruction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        showInstructions();
    }
    
    /**
     * Show the instructions of game 
     */
    public void showInstructions() {
        showText("INSTRUCTIONS", 500, 100);
        showText("W to move forward", 500, 175);
        showText("S to move backward", 500, 275);
        showText("Mouse to make the character face the same direction as the pointer", 500, 375);
        showText("Shift to make teh character run / speed up", 500, 475);
        showText("Spacebar to make soldier shoot", 500, 575);
    }
}
