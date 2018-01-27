package com.silver.lwb.pojo;

import org.springframework.stereotype.Component;

@Component(value = "channel")
public class ChannelProfile {

    private int cID;
    private String cName;
    private String cCategory;
    private String cImage;
    private String cPushRTMP;
    private String cPullRTMP;
    private String cSecretKey;
    private boolean cPermission;

    public void setcID(int cID) {
        this.cID = cID;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcCategory(String cCategory) {
        this.cCategory = cCategory;
    }

    public void setcImage(String cImage) {
        this.cImage = cImage;
    }

    public void setcPushRTMP(String cPushRTMP) {
        this.cPushRTMP = cPushRTMP;
    }

    public void setcPullRTMP(String cPullRTMP) {
        this.cPullRTMP = cPullRTMP;
    }

    public void setcSecretKey(String cSecretKey) {
        this.cSecretKey = cSecretKey;
    }

    public void setcPermission(boolean cPermission) {
        this.cPermission = cPermission;
    }

    public int getcID() {
        return cID;
    }

    public String getcName() {
        return cName;
    }

    public String getcCategory() {
        return cCategory;
    }

    public String getcImage() {
        return cImage;
    }

    public String getcPushRTMP() {
        return cPushRTMP;
    }

    public String getcPullRTMP() {
        return cPullRTMP;
    }

    public String getcSecretKey() {
        return cSecretKey;
    }

    public boolean iscPermission() {
        return cPermission;
    }
}
