package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class AddressDeletionTest extends TestBase {

    @Test
    public void testAddressDeletion(){
        app.getContactHelper().goHomePage();
        app.getContactHelper().selectCheckbox();
        app.getContactHelper().addressDeletion();
        app.getContactHelper().closeConfirmDialog();
    };

}
