package com.example.pexamkalpesh.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DataModel {

    @SerializedName(value = "userID", alternate = "UserID")
    @Expose
    private String userID;

    @SerializedName(value = "fullName", alternate = "FullName")
    @Expose
    private String fullName;

    @SerializedName(value = "email", alternate = "Email")
    @Expose
    private String email;

    @SerializedName(value = "phoneNumber", alternate = "PhoneNumber")
    @Expose
    private Integer phoneNumber;

    @SerializedName(value = "birthDay", alternate = "BirthDay")
    @Expose
    private String birthDay;

    @SerializedName(value = "gender", alternate = "Gender")
    @Expose
    private String gender;

    @SerializedName(value = "showGenderIdentity", alternate = "ShowGenderIdentity")
    @Expose
    private String showGenderIdentity;

    @SerializedName(value = "datesFor", alternate = "DatesFor")
    @Expose
    private Integer datesFor;

    @SerializedName(value = "identifyAs", alternate = "IdentifyAs")
    @Expose
    private String identifyAs;

    @SerializedName(value = "lookingFor", alternate = "LookingFor")
    @Expose
    private Integer lookingFor;

    @SerializedName(value = "visibleTo", alternate = "VisibleTo")
    @Expose
    private Integer visibleTo;

    @SerializedName(value = "iamInto", alternate = "IamInto")
    @Expose
    private Integer iamInto;

    @SerializedName(value = "relationship", alternate = "Relationship")
    @Expose
    private String relationship;

    @SerializedName(value = "location", alternate = "Location")
    @Expose
    private Integer location;

    @SerializedName(value = "latitude", alternate = "Latitude")
    @Expose
    private String latitude;

    @SerializedName(value = "longitude", alternate = "Longitude")
    @Expose
    private String longitude;

    @SerializedName(value = "aboutUser", alternate = "AboutUser")
    @Expose
    private String aboutUser;

    @SerializedName(value = "socialID", alternate = "SocialID")
    @Expose
    private String socialID;

    @SerializedName(value = "loginType", alternate = "LoginType")
    @Expose
    private String loginType;

    @SerializedName(value = "stateID", alternate = "StateID")
    @Expose
    private String stateID;

    @SerializedName(value = "countryID", alternate = "CountryID")
    @Expose
    private String countryID;

    @SerializedName(value = "dogPlayStyle", alternate = "DogPlayStyle")
    @Expose
    private Integer dogPlayStyle;

    @SerializedName(value = "dogTemperament", alternate = "DogTemperament")
    @Expose
    private Integer dogTemperament;

    @SerializedName(value = "introduction", alternate = "Introduction")
    @Expose
    private Integer introduction;

    @SerializedName(value = "status", alternate = "Status")
    @Expose
    private String status;

    @SerializedName(value = "onlineStatus", alternate = "OnlineStatus")
    @Expose
    private String onlineStatus;

    @SerializedName(value = "isDeleted", alternate = "IsDeleted")
    @Expose
    private String isDeleted;

    @SerializedName(value = "createdAt", alternate = "CreatedAt")
    @Expose
    private String createdAt;

    @SerializedName(value = "updatedAt", alternate = "UpdatedAt")
    @Expose
    private String updatedAt;

    @SerializedName(value = "ipAddress", alternate = "IpAddress")
    @Expose
    private String ipAddress;

    @SerializedName(value = "age", alternate = "Age")
    @Expose
    private String age;

    @SerializedName(value = "accessToken", alternate = "AccessToken")
    @Expose
    private String accessToken;

    @SerializedName(value = "userAvatar",alternate = "UserAvatar")
    private ArrayList<UserAvatarModel> userAvatarModelArrayList;

    public ArrayList<UserAvatarModel> getUserAvatarModelArrayList() {
        return userAvatarModelArrayList;
    }

    public void setUserAvatarModelArrayList(ArrayList<UserAvatarModel> userAvatarModelArrayList) {
        this.userAvatarModelArrayList = userAvatarModelArrayList;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getShowGenderIdentity() {
        return showGenderIdentity;
    }

    public void setShowGenderIdentity(String showGenderIdentity) {
        this.showGenderIdentity = showGenderIdentity;
    }

    public Integer getDatesFor() {
        return datesFor;
    }

    public void setDatesFor(Integer datesFor) {
        this.datesFor = datesFor;
    }

    public String getIdentifyAs() {
        return identifyAs;
    }

    public void setIdentifyAs(String identifyAs) {
        this.identifyAs = identifyAs;
    }

    public Integer getLookingFor() {
        return lookingFor;
    }

    public void setLookingFor(Integer lookingFor) {
        this.lookingFor = lookingFor;
    }

    public Integer getVisibleTo() {
        return visibleTo;
    }

    public void setVisibleTo(Integer visibleTo) {
        this.visibleTo = visibleTo;
    }

    public Integer getIamInto() {
        return iamInto;
    }

    public void setIamInto(Integer iamInto) {
        this.iamInto = iamInto;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAboutUser() {
        return aboutUser;
    }

    public void setAboutUser(String aboutUser) {
        this.aboutUser = aboutUser;
    }

    public String getSocialID() {
        return socialID;
    }

    public void setSocialID(String socialID) {
        this.socialID = socialID;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getStateID() {
        return stateID;
    }

    public void setStateID(String stateID) {
        this.stateID = stateID;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public Integer getDogPlayStyle() {
        return dogPlayStyle;
    }

    public void setDogPlayStyle(Integer dogPlayStyle) {
        this.dogPlayStyle = dogPlayStyle;
    }

    public Integer getDogTemperament() {
        return dogTemperament;
    }

    public void setDogTemperament(Integer dogTemperament) {
        this.dogTemperament = dogTemperament;
    }

    public Integer getIntroduction() {
        return introduction;
    }

    public void setIntroduction(Integer introduction) {
        this.introduction = introduction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
