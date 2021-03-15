import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
         if(isAtEdge() )
         {
             turn(50);
         }
         if(Greenfoot.getRandomNumber(100)<10)
         {
             turn(Greenfoot.getRandomNumber(910)-45);
          }
        move(20);
        
        if (isTouching(Worm.class))
        {
            removeTouching(Worm.class);
        }
    }
    
    public void move()
    {
        move(5);
    }
}


