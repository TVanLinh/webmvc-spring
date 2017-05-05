package model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.activation.DataSource;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by linhtran on 04/05/2017.
 */
public class Person
{
    @NotEmpty(message = "Name is not empty!")
    @Pattern(regexp= "^L\\D*",message = "Not pattern!")
    @Size(min = 2, max = 50 ,message = "Country must great than 2 and less than 50")
    private String name;

    @IsPersonValid(message = "Error pattern email ex: person@gmail.com",gmail = "demo@gmail.com")
    private  String email;
    private String phone;
    private Address address;

    private Date birthDay;
    public Person() {
    }

    public Person(String name, String email, String phone, Address address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                 ",birthDay="+birthDay+
                '}';
    }
}
