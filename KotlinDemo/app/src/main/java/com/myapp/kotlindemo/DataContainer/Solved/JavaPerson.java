package com.myapp.kotlindemo.DataContainer.Solved;


public class JavaPerson {
    private int id;
    private String name;
    private String company;
    private String website;
    private String phoneNumber;
    private String emailAddress;

    public JavaPerson(int id, String name, String company, String website, String phoneNumber, String emailAddress) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.website = website;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCompany() {
        return company;
    }
}
