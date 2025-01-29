package GithubWeb;

import Base.BaseClass;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {

    @Test
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);

        login.openGitUrl();
        login.clickOnSignInBtn();
    }
    
    @Test
    public void SignUpPageMethod() throws InterruptedException {
        LoginPages signUp = new LoginPages(driver);

        signUp.openGitUrl();
        signUp.clickOnSignUpBtn();
        Thread.sleep(5000);
    }

    @Test
    public void TermsOfServiceMethod() throws InterruptedException {
        LoginPages termsLink = new LoginPages(driver);

        termsLink.openGitUrl();
        termsLink.clickOnSignUpBtn();
        termsLink.clickOnTermsOfSer();
        Thread.sleep(5000);

    }

    @Test
    public void PrivacyStmtMethod()  throws InterruptedException {
        LoginPages privacyLink = new LoginPages(driver);

        privacyLink.openGitUrl();
        privacyLink.clickOnSignUpBtn();
        privacyLink.clickOnPrivacyStmt();
        Thread.sleep(5000);
    }

}
