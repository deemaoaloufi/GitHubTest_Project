package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.GithubPaths.*;
import static ObjectsPath.LoginPaths.*;


public class LoginPages {

    WebDriver driver = null;

    public LoginPages(WebDriver driver) {
        this.driver = driver;
    }

    public void openGitUrl() {
        driver.get("https://github.com/");
    }

    public void clickOnSignInBtn() {
        WebElement SignInBtn = driver.findElement(signIn);
        SignInBtn.click();
    }

    public void fillEmail(){
        WebElement Email = driver.findElement(email);
        Email.sendKeys("deemaoaloufi@gmail.com");
    }

    public void fillPassword(){
        WebElement passWord = driver.findElement(password);
        passWord.sendKeys("Aa119324299");
    }

    public void ClickOnSignIn(){
        WebElement signin = driver.findElement(signInBtn);
        signin.click();
    }

}