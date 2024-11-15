package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationScreen extends  BaseScreen{
    public AuthenticationScreen(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }


    @FindBy(xpath = "com.sheygam.contactapp:id/inputEmail")
    AndroidElement emailEditText;

    @FindBy(id = "com.sheygam.contactapp:id/inputPassword")
    AndroidElement passwordEditText;

    @FindBy(id = "//*[@text='LOGIN']")
    AndroidElement loginButton;

    public AuthenticationScreen feelEmail(String email){
        //pause(4000);
        should(emailEditText,10);
        type(emailEditText,email);
        return this;
    }

    public AuthenticationScreen feelPassword(String password){
        type(passwordEditText,password);
        return this;
    }

    public ContactListScreen submitLogin(){
        loginButton.click();
        return new ContactListScreen(driver);
    }

}
