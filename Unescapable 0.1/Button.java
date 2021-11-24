import greenfoot.*;

/**
 * Write a description of class StartButton here.
 * 
 * @author (calysta) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    ///**
    // * The constructor for StartButton
    // */
    //public StartButton() {
    //    getWorld().showText("Start", 500, 390);
    //}
    private boolean mouseOver = false;
    private static int maxTrans = 255;
    /**
     * The method will check if mouse is hovering over a button
     */
    public void checkMouse() {
        if(Greenfoot.mouseMoved(null)) {
            mouseOver = Greenfoot.mouseMoved(this);
        }
        
        if(mouseOver) {
            adjustTrans(maxTrans / 2);
        }
        else {
            adjustTrans(maxTrans);
        }
    }
    
    public void adjustTrans(int adjust) {
        GreenfootImage tempImage = getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }
}
