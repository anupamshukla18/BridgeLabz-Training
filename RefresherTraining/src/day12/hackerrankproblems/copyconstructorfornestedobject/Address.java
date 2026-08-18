package day12.hackerrankproblems.copyconstructorfornestedobject;

public class Address {

    String street;
    String city;
    int zipCode;

    public Address(String street, String city, int zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Address(Address address) {
        this.street = address.street;
        this.city = address.city;
        this.zipCode = address.zipCode;
    }
}