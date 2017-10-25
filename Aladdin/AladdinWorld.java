import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AladdinWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AladdinWorld extends World
{
    
     int counter =0;
     private Background img0, img1;
    /**
     * Constructor for objects of class AladdinWorld.
     * 
     */
    public AladdinWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 350, 1, false); 
        img0 = new Background();
        addObject(img0, getWidth ()/2, getHeight()/2);
        img1 = new Background();
        addObject(img1, getWidth() + getWidth()/2, getHeight()/2);
        Aladdin B1 = new Aladdin();
        addObject(B1,100,getHeight()/2);
        
        Music m1=new Music();
        addObject(m1,getWidth()-20,20);
        
    }
   
    
      
    public void act() {
    
        counter ++;
        
        img0.scroll();
        img1.scroll();
        
        
        if(counter % 59 == 0)
        {
           Hurdle P1 = new Hurdle();
           
           GreenfootImage image = P1.getImage();
           addObject(P1,getWidth(),getHeight()/2 + image.getHeight()/2);
       
           
        }
         if(counter % 73 == 0)
        {
           Hurdle2 P1 = new Hurdle2();
           
           GreenfootImage image = P1.getImage();
          // addObject(P1,getWidth(),40);
           addObject(P1,getWidth(),getHeight() + image.getHeight()/2);
       
           
        }
        
        if(counter % 87==0)
        {
            Hurdle P2=new Hurdle();
            GreenfootImage image =P2.getImage();
            addObject(P2,getWidth(),getHeight()-30);
        }
        
         if(counter % 300==0)
        {
            Hurdle P3=new Hurdle();
            GreenfootImage image =P3.getImage();
            addObject(P3,getWidth(),18);
        }
        
         if(counter %30 ==0)
        {
            Grabber g1=new Grabber();
            GreenfootImage img=g1.getImage();
            addObject(g1,getWidth(),50);
        }
        
        /*if(counter % 235==0)
        {
            Hurdle P4=new Hurdle();
            GreenfootImage image =P4.getImage();
            addObject(P4,getWidth(),100);
        }
        */
   
        
    
    }
}

