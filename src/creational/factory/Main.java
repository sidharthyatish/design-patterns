package creational.factory;

public class Main
{
    public static void main(String[] args)
    {
        Vehicle car = VehicleFactory.getInstance("car",4);
        Vehicle bike = VehicleFactory.getInstance("bike",2);
        System.out.println(car.getWheels());
        System.out.println(bike.getWheels());
    }
    
}
