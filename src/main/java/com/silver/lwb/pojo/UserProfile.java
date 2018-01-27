package com.silver.lwb.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component(value = "user")
public class UserProfile {

    private int uID;
    private String uName;
    private String uSex;
    private Date uAge;
    private Date uSignUpTime;

    public void setuID(int uID) {
        this.uID = uID;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public void setuAge(Date uAge) {
        this.uAge = uAge;
    }

    public void setuSignUpTime(Date uSignUpTime) {
        this.uSignUpTime = uSignUpTime;
    }

    public int getuID() {
        return uID;
    }

    public String getuName() {
        return uName;
    }

    public String getuSex() {
        return uSex;
    }

    public Date getuAge() {
        return uAge;
    }

    public Date getuSignUpTime() {
        return uSignUpTime;
    }
}
