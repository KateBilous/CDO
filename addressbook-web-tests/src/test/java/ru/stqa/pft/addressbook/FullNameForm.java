package ru.stqa.pft.addressbook;

public class FullNameForm {
    private final String firstname;
    private final String midlename;
    private final String lastname;
    private final String nickname;

    public FullNameForm(String firstname, String midlename, String lastname, String nickname) {
        this.firstname = firstname;
        this.midlename = midlename;
        this.lastname = lastname;
        this.nickname = nickname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMidlename() {
        return midlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }
}
