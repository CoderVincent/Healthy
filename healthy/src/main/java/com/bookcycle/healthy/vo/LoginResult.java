package com.bookcycle.healthy.vo;

public class LoginResult {
    public String responseCode;
    public String description;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "LoginResult{" +
                "responseCode='" + responseCode + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
