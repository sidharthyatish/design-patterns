package creational.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        
        List<String> vehicles = new ArrayList(Arrays.asList("A","B","C"));
        Vehicle a = new Vehicle(vehicles);
        Vehicle b = (Vehicle) a.clone();
        System.out.println(a.getVehicleLists());
        System.out.println(b.getVehicleLists());
    }
    
}
