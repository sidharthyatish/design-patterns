package creational.singleton;

public class SingletonThread
{
    private static SingletonThread instance;
    private SingletonThread(){
    
    }
    
    //Only one thread can get at a time
    public synchronized static SingletonThread getInstance()
    {
        //We are lazy in initialising the class. Only when get instance method is called we are doing it
        if(instance==null){
            instance = new SingletonThread();
        }
        return instance;
    }
    
    //Instead of making whole method synchronised just make the init part synchronized
    //TODO write this below func as a separate class
    public synchronized static SingletonThread getInstance2()
    {
        //We are lazy in initialising the class. Only when get instance method is called we are doing it
        
        synchronized (SingletonThread.class){
            if(instance==null){
                instance = new SingletonThread();
            }
        }
        
        return instance;
    }
}
