package selotest01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //Calling the chromedriver and giving the path
        System.setProperty("webdriver.chrome.driver","/Users/techproed/Documents/selenium libraries/drivers/chromedriver");
        //Creating the driver object
        WebDriver driver = new ChromeDriver();
        //going to the google.com
        driver.get("https://www.google.com/");
//        On the same class, Navigate to amazon home page https://www.amazon.com/
        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);
//        Navigate back to google
        driver.navigate().back();
        Thread.sleep(3000);
//        Navigate forward to amazon
        driver.navigate().forward();
//        Refresh the page
        driver.navigate().refresh();
//        Maximize the window
        driver.manage().window().maximize();
//        Close/Quit the browser
//        driver.close();
        driver.quit();


    }
}
