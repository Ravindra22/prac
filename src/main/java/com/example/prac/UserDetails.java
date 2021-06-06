package com.example.prac;


import javax.persistence.*;

@Entity
@Table(name="UserDetails")
public class UserDetails {
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Id()
    @GeneratedValue(strategy =GenerationType.AUTO)
    private long userId;
    private String userName;
    private String phoneNumber;
    private String address;



    public UserDetails(int userId, String userName, String phoneNumber,String address) {
        this.userId = userId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.address=address;
    }

    public UserDetails() {
        super();
    }


}
