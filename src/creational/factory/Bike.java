package creational.factory;

public class Bike extends Vehicle
{
    int wheel;
    
    Bike(int wheel){
        this.wheel = wheel;
    }
    @Override
    public int getWheels()
    {
        return this.wheel;
    }
}
