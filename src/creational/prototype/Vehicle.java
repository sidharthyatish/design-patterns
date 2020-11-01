package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable
{
    private List<String> vehicleLists;
    
    public Vehicle(){
        this.vehicleLists = new ArrayList<>();
    }
    
    public Vehicle(List<String> list){
        this.vehicleLists = list;
    }
    
    public List<String> getVehicleLists()
    {
        return vehicleLists;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        List<String> tempList = new ArrayList<>(this.getVehicleLists());
        
        return new Vehicle(tempList);
    }
}
