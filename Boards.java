import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boards extends Actor
{
    protected String message = "";
    int size = 36;
    
    public void setMessage(String message){
        this.message = message;
        GreenfootImage msg= new GreenfootImage(this.message, size, Color.WHITE, Color.BLACK);
        this.setImage(msg);
    }
}
