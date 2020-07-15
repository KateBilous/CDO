package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase{

    @Test
    public void testGroupModification() {
        app.gotoGroupCreation();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("Luna", "Spanish", "corazón"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();



    }
}
