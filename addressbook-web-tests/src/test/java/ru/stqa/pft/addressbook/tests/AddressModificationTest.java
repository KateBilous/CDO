package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class AddressModificationTest extends TestBase {

    @Test
    public void testAddressModification(){
        app.getContactHelper().goHomePage();
        app.getContactHelper().selectCheckbox();
        app.getContactHelper().selectDetails();
        app.getContactHelper().selectModification();
        app.getContactHelper().fillContactDataForm(new ContactData("my Company",
                "forest", "Gamp", "0999999999", "SpaceX","00000000",
                "uruuru@uru.com", "wiki_wiki@wiki.com", "LA", "888888", null),
                false);
        app.getContactHelper().selectUpdate();
    }
}
