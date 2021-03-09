package attributes;

public class Address {

    private String country;
    private String city;
    private String streetAndNumber;
    private String zipCode;

    public Address(String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }
}
