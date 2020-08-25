package xpath03;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    /*
     Create a class : GoogleSearchTest
        Create main method and complete the following task.
        user goes to https://www.google.com
        // Search for porcelain teapot"
        // And print how many related results displayed on Google
        // And click on shopping
        // Then verify the texts: Home, Stores, Departments
      */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HKLAHR\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // user goes to url:
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        // Locate the elements of email textbox,password textbox, and signin button
        WebElement searchTextBox= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        // we can click on Enter using Keys.
        searchTextBox.sendKeys("porcelain teapot"+ Keys.ENTER);
        WebElement searchResultElement= driver.findElement(By.xpath("//div[@id='result-stats']"));
        String searchResultText=searchResultElement.getText().substring(6,16);
        System.out.println(searchResultText);
        // And click on Shopping
        WebElement shopping= driver.findElement(By.linkText("Shopping"));
        shopping.click();
        Thread.sleep(2000);
        WebElement home= driver.findElement(By.linkText("Home"));
        String actualHomeText=home.getText();
        String expectedHomeText="Home";
        if(actualHomeText.equals(expectedHomeText)){
            System.out.println("Pass: Home was displayed on the page");
        }else{
            System.out.println("Fail: Home was displayed on the page");
        }
        Thread.sleep(2000);
        WebElement stores= driver.findElement(By.linkText("Stores"));
        String actualStoresText=stores.getText();
        String expectedStoresText="Stores";
        if(actualStoresText.equals(expectedStoresText)){
            System.out.println("Pass: Stores was displayed on the page");
        }else{
            System.out.println("Fail: Stores was not displayed on the page");
        }
        Thread.sleep(2000);
        WebElement departments= driver.findElement(By.linkText("Departments"));
        String actualDepartmentsText=departments.getText();
        String expectedDepartmentsText="Departments";
        if(actualDepartmentsText.equals(expectedDepartmentsText)){
            System.out.println("Pass: Departments was displayed on the page");
        }else{
            System.out.println("Fail: Departments was not displayed on the page");
        }
        driver.close();
    }
}
