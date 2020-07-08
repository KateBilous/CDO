package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.FullNameForm;

public class AddressCreationTests extends TestBase {


    @Test
    public void testAddressCreation() {


        app.getContactHelper().initAddressCreation();
        app.getContactHelper().fillFullNameForm(new FullNameForm("Lola", "Middle", "Forest", "lolaforest"));

        app.getContactHelper().fillContactDataForm(
                new ContactData("none", "none", "0999999999", "0888888888", "none",
                        "none", "smth_smth@smth.com", "smth1-smth1@smth.com", "USA",
                        "smth street"));
        app.getContactHelper().fillBdayForm("4", "March", "1993");
        app.getContactHelper().submitAddressCreation();


    }


}