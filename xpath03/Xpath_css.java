package xpath03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_css {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HKLAHR\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
//        user goes to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        Thread.sleep(2000);//puts 2 second wait
        driver.manage().window().maximize();
        Thread.sleep(2000);
//        Locate the elements of email textbox,password textbox, and signin button
        WebElement emailTextBox=driver.findElement(By.xpath("//input[@id='session_email']"));
        WebElement passwordTextBox=driver.findElement(By.xpath("//input[@type='password']"));
        WebElement signInButton=driver.findElement(By.xpath("//input[@value='Sign in']"));
//        Enter below username and password then click sign in button
        emailTextBox.sendKeys("testtechproed@gmail.com");
//        Username :  testtechproed@gmail.com
//        Password : Test1234!
        Thread.sleep(2000);
        passwordTextBox.sendKeys("Test1234!");
        Thread.sleep(2000);
        signInButton.click();
        Thread.sleep(2000);
//        Then verify that the expected user id testtechproed@gmail.com
        //1. find the webelement of the testtechproed@gmail.com
        //2. get the text of the webelement using getText() method
        //3. We can assertion- verify the result
        String expectedIDText="testtechproed@gmail.com";
        WebElement userId=driver.findElement(By.xpath("//span[@class='navbar-text']"));
        String actualUserIdText=userId.getText();
        if (expectedIDText.equals(actualUserIdText)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
            System.out.println("EXPECTED ID : "+expectedIDText);
            System.out.println("ACTUAL ID TEXT : "+actualUserIdText);
        }
//        Sign out from the page
        Thread.sleep(2000);
        WebElement signOut=driver.findElement(By.xpath("(//a[@class='nav-item nav-link'])[2]"));
        signOut.click();
        //To understand if we signed out, we can find a core element like sign in button to verify
        Thread.sleep(2000);
        //I am checking if signInButton element is visible after clicking on sign out
        WebElement signIn=driver.findElement(By.xpath("//input[@value='Sign in']"));
        if (signIn.isDisplayed()){
            System.out.println("PASSED. YOU ARE IN SING IN PAGE");
        }else{
            System.out.println("FAILED. YOU ARE NOT ON SIGN IN PAGE");
        }
    }

}
