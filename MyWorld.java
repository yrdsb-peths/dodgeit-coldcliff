import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        hero hero = new hero();
        addObject(hero, 100, 100);
        
        apple apple = new apple();
        addObject(apple, 600, 100);
    }
}
