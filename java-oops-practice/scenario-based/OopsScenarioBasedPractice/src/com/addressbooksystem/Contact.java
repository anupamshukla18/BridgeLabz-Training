package com.addressbooksystem;
public class Contact implements Comparable<Contact> {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;

    public Contact(String firstName, String lastName,
                   String phone, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getCity() {
        return address != null ? address.getCity() : "";
    }

    public String getState() {
        return address != null ? address.getState() : "";
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Contact c) {
        return this.getFullName().compareToIgnoreCase(c.getFullName());
    }

    @Override
    public String toString() {
        return getFullName() + " | " + phone + " | " + email +
               " | " + (address != null ? address : "No Address");
    }
}
