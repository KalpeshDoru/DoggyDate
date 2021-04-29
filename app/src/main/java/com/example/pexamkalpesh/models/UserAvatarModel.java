package com.example.pexamkalpesh.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserAvatarModel {

    @SerializedName(value = "userAvatar", alternate = "UserAvatar")
    @Expose
    private String userAvatar;

    @SerializedName(value = "userAvatarID", alternate = "UserAvatarID")
    @Expose
    private String userAvatarID;


}
