package com.example.redditapp.Comments;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckComments {

    @SerializedName("success")
    @Expose
    private String success;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
