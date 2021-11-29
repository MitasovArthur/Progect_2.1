package DZ_1;

public class Address {
    private int index;
    private String country;
    private String sity;
    private String street;
    private String house;
    private String apartament;

    public Address(int index, String country, String sity, String street, String house, String apartament) {
        this.index = index;
        this.country = country;
        this.sity = sity;
        this.street = street;
        this.house = house;
        this.apartament = apartament;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartament() {
        return apartament;
    }

    public void setApartament(String apartament) {
        this.apartament = apartament;
    }


}
