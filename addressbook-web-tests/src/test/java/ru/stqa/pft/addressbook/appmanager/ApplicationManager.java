package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager  {
    public WebDriver wd;

    private SessionHelper sessionHelper;
    private  NavigationHelper navigationHelper;
    private  GroupHelper groupHelper;

    public void init() {
        String pathToChromeDriver = System.getProperty("user.home") + "/Documents/webdrivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        sessionHelper =new SessionHelper(wd);
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper.login("admin", "secret");
    }



    public void fillGroupForm(GroupData groupData) {
       wd.findElement(By.name("group_name")).click();
       wd.findElement(By.name("group_name")).clear();
       wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
       wd.findElement(By.name("group_header")).click();
       wd.findElement(By.name("group_header")).clear();
       wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
       wd.findElement(By.name("group_footer")).click();
       wd.findElement(By.name("group_footer")).clear();
       wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void stop() {
        wd.quit();
    }

    public boolean isElementPresent(By by) {
        try {
           wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
           wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public void gotoGroupCreation() {
        navigationHelper.gotoGroupCreation();
    }
}
