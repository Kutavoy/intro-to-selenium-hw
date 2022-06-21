package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    // TODO define username, password, and login WebElements using @FindBy
    @FindBy(how = How.ID, using = "username")
    private WebElement usernameTextField;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordTextField;

    @FindBy(how = How.CSS, using = ".fa")
    private WebElement loginButton;

    @FindBy(how = How.CSS , using = "h2")
    private WebElement element;

    public String getElementText() {
        return element.getText();
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsername(String text) {
        // TODO set username
        usernameTextField.sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        // TODO set password
        passwordTextField.sendKeys(text);
        return this;
    }

    public MainPage clickLogin() {
        // TODO click logout return instance of MainPage
        loginButton.click();
        return null;
    }
}
