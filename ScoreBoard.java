import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Props
{
    int score = 0;
    GreenfootImage scoreImage;
    
    public ScoreBoard(){
        this.scoreImage= new GreenfootImage("Score: " +String.valueOf(this.score), 36, Color.WHITE, Color.BLACK);
        this.setImage(scoreImage);
    }
    
    public void addScore(int score){
        this.score += score ;
        this.setImage(scoreImage);
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public int getScore(){
        return this.score;
    }
    
    
    public void act()
    {   
        this.scoreImage= new GreenfootImage("Score: " + String.valueOf(this.score), 36, Color.WHITE, Color.BLACK);
        this.setImage(scoreImage);
    }
}
