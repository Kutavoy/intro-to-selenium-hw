package com.example.selenium.steps;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

public class UserSteps {
    private WebDriver driver;
    LoginPage loginPage;
    MainPage mainPage;

    public UserSteps(WebDriver driver) {
        this.driver = driver;

    }

    public UserSteps login(String username, String password) {
        // TODO initialize LoginPage, call setUsername, setPassword, and click login methods

        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);

        loginPage.setUsername(username)
            .setPassword(password)
            .clickLogin();
        assertEquals(loginPage.getElementText(), "Secure Area", "Login failed");
        return this;
    }

    public UserSteps logout() {
        // TODO call logout method
        mainPage.clickLogout();
        return this;
    }
}
