package edu.javacourse.studentorder.domain;

public class Address {
    private String postCode;
    private Street street;
    private String building;
    private String extension;
    private String appartment;

    public Address() {
    }

    public Address(String postCode, Street street, String building, String extension, String apartment) {
        this.postCode = postCode;
        this.street = street;
        this.building = building;
        this.extension = extension;
        this.appartment = apartment;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getAppartment() {
        return appartment;
    }

    public void setAppartment(String appartment) {
        this.appartment = appartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postCode='" + postCode + '\'' +
                ", street=" + street +
                ", building='" + building + '\'' +
                ", extension='" + extension + '\'' +
                ", appartment='" + appartment + '\'' +
                '}';
    }
}
