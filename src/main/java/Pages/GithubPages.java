package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.GithubPaths.*;

public class GithubPages {

    WebDriver driver = null;

    public GithubPages (WebDriver driver){
        this.driver = driver;
    }

    public void openGitUrl(){
        driver.get("https://github.com/");
    }

    public void clickOnSignUpBtn(){
        WebElement SignUpButton = driver.findElement(signUp);
        SignUpButton.click();
    }

    public void clickOnTermsOfSer(){
        WebElement TermsLink = driver.findElement(TermsService);
        TermsLink.click();
    }
    public void clickOnPrivacyStmt() {
        WebElement PrivacyLink = driver.findElement(PrivacyStment);
        PrivacyLink.click();
    }
}
