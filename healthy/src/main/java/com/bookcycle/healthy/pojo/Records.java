package com.bookcycle.healthy.pojo;

import java.util.Map;

public class Records {
    public String hospitalId;
    public String deseaseName;
    public Map<String,String> qa;
    public String timestamp;


    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDeseaseName() {
        return deseaseName;
    }

    public void setDeseaseName(String deseaseName) {
        this.deseaseName = deseaseName;
    }

    public Map<String, String> getQa() {
        return qa;
    }

    public void setQa(Map<String, String> qa) {
        this.qa = qa;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Records{" +
                "hospitalId='" + hospitalId + '\'' +
                ", deseaseName='" + deseaseName + '\'' +
                ", qa=" + qa +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
