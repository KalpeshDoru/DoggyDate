package com.example.pexamkalpesh.models;

import com.google.gson.annotations.SerializedName;

public class CommanRequestModel {
    @SerializedName(value = "email", alternate = "Email")
    private String email;

    @SerializedName(value = "password", alternate = "Password")
    private String password;

    @SerializedName(value = "deviceToken", alternate = "DeviceToken")
    private Integer deviceToken;

    @SerializedName(value = "deviceType", alternate = "DeviceType")
    private String deviceType;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(Integer deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
}

