package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class WellsfargoLogin {
    WebDriver driver= null;
    @Given("User in a home page.")
    public void user_in_a_home_page() throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.wellsfargo.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
    @When("User try to sign on  using right username and Password")
    public void user_try_to_sign_on_using_right_username_and_password() throws InterruptedException {
        WebElement userid=driver.findElement(By.xpath("//input[@id='userid']"));
        userid.sendKeys("soha");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
       password.sendKeys("13456$$444");
       Thread.sleep(5000);

    }
    @Then("user able to sign on")
    public void user_able_to_sign_on() throws InterruptedException {
        WebElement signon = driver.findElement(By.xpath("//input[@id='btnSignon']"));
        signon.click();
        Thread.sleep(5000);
        driver.close();
    }
}





//    @When("User try to sign on using wrong username and right password")
//    public void user_try_to_sign_on_using_wrong_username_and_right_password() {
//        WebElement userid = driver.findElement(By.xpath("//input[@id='userid']"));
//        userid.sendKeys("..");
//        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//        password.sendKeys("13456$$444");
//        WebElement signon = driver.findElement(By.xpath("//input[@id='btnSignon']"));
//        signon.click();
//    }
//    @Then("user unable to sign on")
//    public void user_unable_to_sign_on() {
//
//    }

//    @When("User try to sign on using right username and wrong password")
//    public void user_try_to_sign_on_using_right_username_and_wrong_password() {
//        WebElement userid = driver.findElement(By.xpath("//input[@id='userid']"));
//        userid.sendKeys("soha");
//        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//        password.sendKeys("..");
//        WebElement signon = driver.findElement(By.xpath("//input[@id='btnSignon']"));
//        signon.click();
//    }
//    @When("User try to sign on using wrong username and wrong password")
//    public void user_try_to_sign_on_using_wrong_username_and_wrong_password() {
//        WebElement userid = driver.findElement(By.xpath("//input[@id='userid']"));
//        userid.sendKeys("..");
//        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//        password.sendKeys("..");
//        WebElement signon = driver.findElement(By.xpath("//input[@id='btnSignon']"));
//        signon.click();
//    }
//    @When("User try to sign on using right username and right password")
//    public void user_try_to_sign_on_using_right_username_and_right_password() {
//        WebElement userid = driver.findElement(By.xpath("//input[@id='userid']"));
//        userid.sendKeys("soha");
//        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//        password.sendKeys("13456$$444");
//        WebElement signon = driver.findElement(By.xpath("//input[@id='btnSignon']"));
//        signon.click();
//    }
//    @When("sign on time out")
//    public void sign_on_time_out() {
//
//    }


