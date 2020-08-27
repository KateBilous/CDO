package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.FullNameForm;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void initAddressCreation() {

        click(By.linkText("add new"));

    }

    public void fillContactDataForm(ContactData contactData, boolean creation) {

        fillCompanyForm(contactData, By.name("company"));
        fillAddressForm(contactData, By.name("address"));
        fillHomeForm(contactData, By.name("home"));
        fillMobileForm(contactData, By.name("mobile"));
        fillWorkForm(contactData, By.name("work"));
        fillFaxForm(contactData, By.name("fax"));
        fillEmailForm(contactData, By.name("email"));
        fillHomeAddressform(contactData, By.name("homepage"));

        if (creation){
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    private void fillHomeAddressform(ContactData contactData, By homepage) {
        type(homepage, contactData.getAddress2());
        type(homepage, contactData.getPhone2());
    }


    private void fillEmailForm(ContactData contactData, By email) {
        type(email, contactData.getEmail());
        type(email, contactData.getEmail2());
    }

    private void fillFaxForm(ContactData contactData, By fax) {
        type(fax, contactData.getFax());
    }

    private void fillWorkForm(ContactData contactData, By work) {
        type(work, contactData.getWork());
    }

    private void fillMobileForm(ContactData contactData, By mobile) {
        type(mobile, contactData.getMobile());
    }

    private void fillHomeForm(ContactData contactData, By home) {
        type(home, contactData.getHome());
    }

    private void fillAddressForm(ContactData contactData, By address) {
        type(address, contactData.getAddress());
    }

    public void fillBdayForm(String bday, String bmonth, String byear) {
        click(By.name("bday"));
        click(By.name("bmonth"));
        new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(bmonth);
        type(By.name("byear"), byear);
    }

    private void fillCompanyForm(ContactData contactData, By company) {
        type(company, contactData.getCompamy());
    }

    public void submitAddressCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));

    }

    public void fillFullNameForm(FullNameForm fullNameForm) {
        fillFirstNameForm(fullNameForm, By.name("firstname"));
        fillMiddleNameForm("middlename", fullNameForm.getMidlename());
        fillLastNameForm("lastname", fullNameForm.getLastname());
        fillNicknameForm("nickname", By.name("nickname"), fullNameForm.getNickname());
    }

    private void fillNicknameForm(String nickname, By nickname2, String nickname3) {
        type(nickname2, nickname3);
    }

    private void fillLastNameForm(String lastname, String lastname2) {
        type(By.name(lastname), lastname2);
    }

    private void fillMiddleNameForm(String middlename, String midlename) {
        type(By.name(middlename), middlename);
    }

    private void fillFirstNameForm(FullNameForm fullNameForm, By firstname) {
        type(firstname, fullNameForm.getFirstname());
    }

    public void goHomePage() {
        click(By.linkText("home"));
    }

    public void selectCheckbox() {
        click(By.name("selected[]"));
    }

    public void addressDeletion() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void closeConfirmDialog() {
        wd.switchTo().alert().accept();
    }

    public void selectDetails() {
        click(By.xpath("//img[@alt='Details']"));
    }

    public void selectModification() {
        click(By.name("modifiy"));
    }

    public void selectUpdate() {
        click(By.name("update"));
    }
}
