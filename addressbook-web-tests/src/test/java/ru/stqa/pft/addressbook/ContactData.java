package ru.stqa.pft.addressbook;

public class ContactData {
    private final String compamy;
    private final String address;
    private final String home;
    private final String mobile;
    private final String work;
    private final String fax;
    private final String email;
    private final String email2;
    private final String address2;
    private final String phone2;

    public ContactData(String compamy, String address, String home, String mobile, String work, String fax, String email, String email2, String address2, String phone2) {
        this.compamy = compamy;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.fax = fax;
        this.email = email;
        this.email2 = email2;
        this.address2 = address2;
        this.phone2 = phone2;
    }

    public String getCompamy() {
        return compamy;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail2() {
        return email2;
    }

    public String getAddress2() {
        return address2;
    }

    public String getPhone2() {
        return phone2;
    }
}
