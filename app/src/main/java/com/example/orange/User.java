package com.example.orange;

import com.google.gson.annotations.SerializedName;

public class User
{
    @SerializedName("Id")
    private int id;
    @SerializedName("Email")
    private String email;
    @SerializedName("FName")
    private String FName;
    @SerializedName("LName")
    private String LName;
    @SerializedName("PhoneNumber")
    private String PhoneNumber;
    @SerializedName("Age")
    private String age;
    @SerializedName("Country")
    private String country;

    public User()
    {
        //Empty constructor
    }

    public User(int id, String email, String FName, String LName, String phoneNumber, String age, String country) {
        this.id = id;
        this.email = email;
        this.FName = FName;
        this.LName = LName;
        this.PhoneNumber = phoneNumber;
        this.age = age;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", FName='" + FName + '\'' +
                ", LName='" + LName + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", age='" + age + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
