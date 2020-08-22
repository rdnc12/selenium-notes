package webelements02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HKLAHR\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        if (driver.getTitle().equals("facebook")) {
            System.out.println("TITLE VERIFY PASSED");
        } else {
            System.out.println("TITLE VERIFY FAILED");
            System.out.println("ACTUAL : " + driver.getTitle());
            System.out.println("EXPECTED : " + "facebook");
        }
        System.out.println("=================================");

        Thread.sleep(3000);
        driver.navigate().to("https://www.walmart.com/");

        if (driver.getTitle().contains("Walmart.com")) {
            System.out.println("TITLE VERIFY PASSED");
        } else {
            System.out.println("TITLE INCLUDES VERIFY FAILED");
            System.out.println("ACTUAL : " + driver.getTitle());
            System.out.println("EXPECTED : " + "Walmart.com");
        }
        System.out.println("=================================");

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().refresh();

        Thread.sleep(3000);
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.quit();


    }
}
