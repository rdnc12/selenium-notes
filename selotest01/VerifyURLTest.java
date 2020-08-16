package selotest01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyURLTest {
    public static void main(String[] args) {
//        Create a new class: VerifyURLTest
//        Navigate to google homepage
//        Verify if google homepage url is “www.google.com"
        System.setProperty("webdriver.chrome.driver","C:/Users/HKLAHR/selenium dependencies/drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        //getting the page url
        String actualURL=driver.getCurrentUrl();
        String expectedURL="www.google.com";

        if (actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL : "+actualURL);
            System.out.println("EXPECTED : "+expectedURL);
        }
    }

}
