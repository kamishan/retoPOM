package com.demoqa.automation.models;

import com.github.javafaker.Faker;
import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String firstName, lastName, email, mobileNumber,  subjects, currentAddress, state, city, submitRegister, uploadPicture;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getUploadPicture() {
        return uploadPicture;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }
    public String getSubmitRegister() {
        return submitRegister;
    }

    public DataInjection() {
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.mobileNumber = Integer.toString(faker.number().numberBetween(1000000000,1144000000));
        this.currentAddress = faker.address().fullAddress();
        this.subjects = "Computer Science";
        this.state = "Uttar Pradesh";
        this.city = "Merrut";
        this.submitRegister = "Thanks for submitting the form";
        this.uploadPicture = "C:\\Users\\kamis\\OneDrive\\Pictures\\carita_enojada_(2).png";





    }
}
