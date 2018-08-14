package com.bookcycle.healthy.pojo;

public class User {
    public String name;
    public String timestamp;
    public String hospitalId;
    public String password;
    public Integer sex;
    public Integer age;
    public String phone;

    public User() {
    }

    public User(String name, String timestamp, String hospitalId, String password, Integer sex, Integer age, String phone) {
        this.name = name;
        this.timestamp = timestamp;
        this.hospitalId = hospitalId;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", hospitalId='" + hospitalId + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
