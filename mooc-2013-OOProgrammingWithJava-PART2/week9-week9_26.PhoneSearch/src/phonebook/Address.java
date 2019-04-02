
package phonebook;


public class Address {
    private final String street;
    private final String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return street + " " + city;
    }

    // does address contain string
    public boolean searchString(String element) {
        boolean found = false;

        if (street.contains(element) || city.contains(element))
            found = true;

        return found;
    }

}
