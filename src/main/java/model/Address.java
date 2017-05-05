package model;

import javax.validation.constraints.Size;

/**
 * Created by linhtran on 03/05/2017.
 */
public class Address {
    private  String country;
    private  String street;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
