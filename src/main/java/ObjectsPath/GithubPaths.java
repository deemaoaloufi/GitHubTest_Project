package ObjectsPath;

import org.openqa.selenium.By;

public class GithubPaths {

    // Sign In Xpath
    public static final By signIn = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a");

    // Sign Up Xpath
    public static final By signUp = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/a");

    // Terms of Service Xpath
    public static final By TermsService = By.xpath("//*[contains(text(), 'Terms of Service')]");

    // GitHub Privacy Statement Xpath
    public static final By PrivacyStment = By.xpath("//*[contains(text(), 'Privacy Statement')]");

}

