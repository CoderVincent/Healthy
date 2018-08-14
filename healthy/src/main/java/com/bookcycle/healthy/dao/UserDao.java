package com.bookcycle.healthy.dao;


import com.bookcycle.healthy.pojo.User;

public interface UserDao {
    String saveUser(User user);

    User queryUserByHospitalId(String hospitalId);

}
