import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Environments here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Environments extends Props
{
    /**
     * Act - do whatever the Environments wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int newY = this.getY()+2;
        this.setLocation(this.getX(), newY);
        
        if(newY >= this.getWorld().getHeight()-1){
            this.getWorld().removeObject(this);
        }
    }
}
