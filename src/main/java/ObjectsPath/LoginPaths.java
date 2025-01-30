package ObjectsPath;

import org.openqa.selenium.By;

public class LoginPaths {

    // Username Xpath
    public static final By email = By.xpath("//input[@id='login_field']");

    // Password Xpath
    public static final By password = By.xpath("//input[@id='password']");

    // Sign in button Xpath
    public static final By signInBtn = By.xpath("//input[@name='commit']");
}
