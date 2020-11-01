package structural.facade;

import java.sql.Driver;

public class Chrome
{
    public static Driver chromeDriver(){
        return null;
    }
    
    public static void generateHTMLReport(Driver driver){
        System.out.println("Generating chrome HTML report");
    }
    
    public static void generateJUnitReport(Driver driver){
        System.out.println("Generating chrome Junit report");
    }
}
