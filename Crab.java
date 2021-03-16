import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
         
         turnAtEdge();
        randomTurn();
        move(20);
        lookForWorm();
        
        
    }
    
    public void move()
    {
        move(5);
    }
    
    /*
         *check weather we stumbed upon a worm to see if he ate it if not leave it be
         */
    public void lookForWorm()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
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


