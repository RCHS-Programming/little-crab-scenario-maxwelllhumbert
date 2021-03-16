import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
  public void act()
    {
         
         turnAtEdge();
        randomTurn();
        move(20);
        lookForCrab();
        
        
    }
    
    public void move()
    {
        move(5);
    }
    
    /*
         *check weather we stumbed upon a worm to see if he ate it if not leave it be
         */
    public void lookForCrab()
    {
        if(isTouching(Crab.class))
        {
            removeTouching(Crab.class);
        }
    }
    
   /*
    * make te crab turn rigt between 0-45 degrees
    */
   public void randomTurn()
   {
       if(Greenfoot.getRandomNumber(100)<10)
         {
             turn(Greenfoot.getRandomNumber(910)-45);
          }
    }
    
    public void turnAtEdge()
    {
        if(isAtEdge() )
         {
             turn(50);
         }
    }
}
