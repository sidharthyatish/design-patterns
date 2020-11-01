package creational.factory;

abstract class Vehicle
{
    public abstract int getWheels();
    
    @Override
    public String toString()
    {
        return "Wheels : "+this.getWheels();
    }
}
