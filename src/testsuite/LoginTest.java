package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp()
    {
        openBrowser(baseUrl);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        //Enter “Admin” username
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");

        //* Enter “admin123 password
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("admin123");

        //* Click on ‘LOGIN’ button
        WebElement clickLogin = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        clickLogin.click();

        //* Verify the ‘Welcome’ text is display
        WebElement TextClick = driver.findElement(By.linkText("Welcome Paul"));
        String actualTest = TextClick.getText();
        String expectedTest = "Welcome Paul";
        Assert.assertEquals(expectedTest,actualTest);

    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully()
    {
        //click on the ‘Forgot your password’ link
        WebElement forgotPassword = driver.findElement(By.xpath("//div[@id='forgotPasswordLink']"));
        forgotPassword.click();

        //* Verify the text ‘Forgot Your Password?’
        WebElement VerifyText = driver.findElement(By.xpath("//div[@id='forgotPasswordLink']"));
        String actualTest = VerifyText.getText();
        String expectedTest = "Forgot your password?";
        Assert.assertEquals(expectedTest,actualTest);

    }

    @After
    public void closeBrowser()
    {

    }

}
