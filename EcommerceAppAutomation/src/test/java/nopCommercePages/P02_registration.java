package nopCommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static TestCasesDefinitions.Hooks.driver;
import Util.Utils;
import nopCommercePages.*;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P02_registration {
Utils utils = new Utils();

    public String registerPageURL() {
        return "https://demo.nopcommerce.com/register";
    }

    public String registerPageResultURL() {
        return "https://demo.nopcommerce.com/register";
    }


    public void humanCheckBox() {

        By humanCheckBox = By.xpath("//*[@id=\"JStsl2\"]/div/label/input");
        driver.findElement(humanCheckBox);
    }

    public void maleCheckBox()  {
       utils.sleep(10);
        //driver.switchTo().frame((WebElement) By.xpath("//*[@id=\"JStsl2\"]/div/label/input"));

       driver.findElement(By.xpath("//*[@id=\"JStsl2\"]/div/label/input")).click();


    }


    public WebElement firstNameTxtFld() {

        By firstNameTxtFld = By.id("FirstName");
        return driver.findElement(firstNameTxtFld);
    }

    public WebElement lastNameTxtFld() {
        By lastNameTxtFld = By.id("LastName");
        return driver.findElement(lastNameTxtFld);
    }

    public WebElement birthDayScrlPn() {
        By birthDayScrlPn = By.name("DateOfBirthDay");
        return driver.findElement(birthDayScrlPn);
    }

    public WebElement day19() {
        By day19 = By.cssSelector("select[name=\"DateOfBirthDay\"] > option[value=\"7\"]");
        return driver.findElement(day19);
    }

    public WebElement birthMonthScrlPn() {
        By birthMonthScrlPn = By.name("DateOfBirthMonth");
        return driver.findElement(birthMonthScrlPn);
    }

    public WebElement month7() {
        By month7 = By.cssSelector("select[name=\"DateOfBirthMonth\"] > option[value=\"7\"]");
        return driver.findElement(month7);
    }

    public WebElement birthYearScrlPn() {
        By birthYearScrlPn = By.name("DateOfBirthYear");
        return driver.findElement(birthYearScrlPn);
    }

    public WebElement year1995() {
        By year1995 = By.cssSelector("option[value=\"1995\"]");
        return driver.findElement(year1995);
    }

    public WebElement emailAddressTxtFld() {
        By emailAddressTxtFld = By.cssSelector("div[class=\"inputs\"] > input[type=\"email\"]");
        return driver.findElement(emailAddressTxtFld);
    }

    public String registerEmail() {
        return "fortestingpurpose@udacity.com";
    }

    public WebElement passwordTxtFld() {
        By passwordTxtFld = By.id("Password");
        return driver.findElement(passwordTxtFld);
    }

    public String registerPassword() {
        return "Ahmed@1";
    }

    public WebElement confirmPassTxtFld() {
        By confirmPassTxtFld = By.id("ConfirmPassword");
        return driver.findElement(confirmPassTxtFld);
    }

    public WebElement registerButton() {
        By registerButton = By.cssSelector("button[name=\"register-button\"]");
        return driver.findElement(registerButton);
    }

    public WebElement registrationCompletedMsg() {
        By registrationCompletedMsg = By.cssSelector("div[class=\"result\"]");
        return driver.findElement(registrationCompletedMsg);
    }

    public WebElement passwordErrorMsg() {
        By passwordErrorMsg = By.id("Password-error");
        return driver.findElement(passwordErrorMsg);
    }


}
