package creational.singleton;

public class SingletonLazy
{
    private static SingletonLazy instance;
    private SingletonLazy(){
    
    }
    
    public static SingletonLazy getInstance()
    {
        //We are lazy in initialising the class. Only when get instance method is called we are doing it
        if(instance==null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
