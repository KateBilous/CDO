package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {


        initGroupCreation();
        fillGroupForm(new GroupData("tets1", "test2", "test3"));
        submitGroupCreation();
        returnToGroupPage();

    }


}
