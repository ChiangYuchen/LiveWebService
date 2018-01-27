package com.silver.lwb.pojo;

import org.springframework.stereotype.Component;

@Component(value = "roler")
public class RolerProfile {

    private int rID;
    private String rName;

    public void setrID(int rID) {
        this.rID = rID;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public int getrID() {
        return rID;
    }

    public String getrName() {
        return rName;
    }
}
