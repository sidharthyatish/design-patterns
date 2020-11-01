package structural.facade;

import java.sql.Driver;

public class BrowserReportFacade
{
    public static void generateReport(String browser, String reportType){
        Driver driver = null;
        switch (browser){
            case "firefox":
                driver = Firefox.firefoxDriver();
                switch (reportType){
                    case "html": Firefox.generateHTMLReport(driver); break;
                    case "junit": Firefox.generateJUnitReport(driver); break;
                }
                break;
            case "chrome":
                driver = Chrome.chromeDriver();
                switch (reportType){
                    case "html": Chrome.generateHTMLReport(driver); break;
                    case "junit": Chrome.generateJUnitReport(driver); break;
                }
                break;
        }
    }
}
