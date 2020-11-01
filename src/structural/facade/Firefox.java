package structural.facade;

import java.sql.Driver;

public class Firefox
{
    public static Driver firefoxDriver(){
        return null;
    }
    
    public static void generateHTMLReport(Driver driver){
        System.out.println("Generating firefox HTML report");
    }
    
    public static void generateJUnitReport(Driver driver){
        System.out.println("Generating firefox Junit report");
    }
}
