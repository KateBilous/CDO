package ru.stqa.pft.addressbook;

public class CompanyAddressForm {
    private final String company;
    private final String address;

    public CompanyAddressForm(String company, String address) {
        this.company = company;
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }
}
