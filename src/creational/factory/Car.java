package creational.factory;

public class Car extends Vehicle
{
    int wheel;
    
    Car(int wheel){
        this.wheel = wheel;
    }
    
    @Override
    public int getWheels()
    {
        return this.wheel;
    }
}
