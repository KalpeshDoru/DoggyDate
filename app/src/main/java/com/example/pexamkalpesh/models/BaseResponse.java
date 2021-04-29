package com.example.pexamkalpesh.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseResponse {

    @SerializedName(value = "status", alternate = "Status")
    @Expose
    private Integer status;

    @SerializedName(value = "message", alternate = "Message")
    @Expose
    private String message;

    @SerializedName(value = "data", alternate = "Data")
    @Expose
    private DataModel dataModel;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataModel getDataModel() {
        return dataModel;
    }

    public void setDataModel(DataModel dataModel) {
        this.dataModel = dataModel;
    }
}
