package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends com.example.selenium.pages.BasePage {

    // TODO define title and logout WebElements using @FindBy
    @FindBy(how = How.CSS, using = ".icon-2x")
    private WebElement logout;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        // TODO return title text
        driver.getTitle();
        return null;
    }

    public MainPage clickLogout() {
        // TODO click logout and return MainPage
        logout.click();
        return this;
    }
}
