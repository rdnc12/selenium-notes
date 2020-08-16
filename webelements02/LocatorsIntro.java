package webelements02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsIntro {
//    Create a class : LocatorsIntro
//    Create main method and complete the following task.
//    user goes to http://a.testaddressbook.com/sign_in 
//    Locate the elements of email textbox,password textbox, and signin button
//    Enter below username and password then click sign in button
//    Username :  testtechproed@gmail.com
//    Password : Test1234!
//    Then verify that the expected user id  testtechproed@gmail.com
//    Verify the Addresses and Sign Out  texts are displayed
//    Find the number of total link on the page
//    Sign out from the page
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/techproed/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //    user goes to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        //    Locate the elements of email textbox,password textbox, and signin button
        //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        //<input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">
        WebElement signinButton=driver.findElement(By.name("commit"));
        //    Enter below username and password then click sign in button
        //    Username : testtechproed@gmail.com
        //    Password : Test1234!
        Thread.sleep(3000);
        //Sending username in the email text box
        emailTextBox.sendKeys("testtechproed@gmail.com");
        Thread.sleep(3000);
        //sending the pasword in the password textbox
        passwordTextBox.sendKeys("Test1234!");
        Thread.sleep(3000);
        //click on sign in button
        signinButton.click();
    }
}

