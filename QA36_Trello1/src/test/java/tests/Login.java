package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login {
    WebDriver wd;

    @BeforeMethod
    public void preConditions(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.navigate().to("https://trello.com/");
    }


    @Test
    public void login1(){
        click(By.cssSelector("[href='/login']"));
        pause(2000);
        type(By.cssSelector("#user"),"katuha1995@gmail.com");
        click(By.cssSelector("#login"));
        pause(2000);
        type(By.cssSelector("#password"),"12345.com");
        click(By.cssSelector("#login-submit"));
        pause(2000);
    }

    private void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {

        wd.findElement(locator).click();
    }

    public void pause(int millis){
        try{
            Thread.sleep(millis);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }


    @AfterMethod
    public void postConditions(){
        wd.close();
        wd.quit();
    }
}
