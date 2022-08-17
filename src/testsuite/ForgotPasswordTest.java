package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {


    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp()
    {
        openBrowser(baseUrl);

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
    public void closeBrowser(){
        {
            //driver.close();
        }
    }
}
