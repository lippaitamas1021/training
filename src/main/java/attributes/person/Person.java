package attributes.person;

public class Person {

    private String name;
    private String idCard;
    private Address address;

    public Person(String name, String idCard) {
        this.name = name;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public String getIdCard() {
        return idCard;
    }

    public Address getAddress() {
        return address;
    }

    public void moveTo(Address newAddress) {
        this.address = newAddress;
    }

    public String personToString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", idCard='" + idCard + '\'' +
                ", address=" + address +
                '}';
    }

    public void correctData(String name, String idCard) {
        this.name = name;
        this.idCard = idCard;
    }
}