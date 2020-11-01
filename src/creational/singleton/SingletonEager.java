package creational.singleton;

/*
    Singleton:
    - Only single instance of the class is available at a time
    - Example : loggers. Multiple instances not needed
 */
public class SingletonEager
{
    //We have a static instance of this class
    //Initialising here itself very early the object is created. That's why it is 'eager'
    private static SingletonEager instance = new SingletonEager();
    
    //Constructor is private so no initialisation is possible
    private SingletonEager(){
    
    }
    
    //Only this method is accessible and that will return the instance
    public static SingletonEager getInstance()
    {
        return instance;
    }
}
