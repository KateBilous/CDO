package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper {

    private WebDriver wd;

    public SessionHelper(WebDriver wd) {
        this.wd = wd;
    }
    public void login(String username, String password) {

        By loginInput = By.name("user");
        By passwordInput = By.name("pass");

        wd.findElement(loginInput).click();
        wd.findElement(passwordInput).clear();
        wd.findElement(loginInput).sendKeys(username);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//input[@value='Login']")).click();
    }
}
