import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    { 
       
        checkKeyPress();
        move(10);
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
            Greenfoot.playSound ("slurp.wav");
        }
    }
    
    /*
     * check weather a key is pressed if so turn the crab
     */
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn (-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
    }
    
}


