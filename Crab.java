import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    /*
    *create a crab and initialize its two images
    **/
    public Crab()
    {
        image1=new GreenfootImage("crab.png");
        image2=new GreenfootImage("crab2.png");
        setImage(image1);
    }
    public void act()
    { 
        checkKeyPress();
        move(10);
        lookForWorm();
        switchImage();
        
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
            
            wormsEaten = wormsEaten + 1;
            
            getWorld().showText("score: " + wormsEaten, 50, 500);
            
            if( wormsEaten == 100 )
            {
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
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
    
    /*
     * switch image to crab animated
     */
    public void switchImage()
    {
    if(getImage()==image1)
       {
           setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }
}


