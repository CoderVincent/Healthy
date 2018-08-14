package com.bookcycle.healthy.daoImpl;

import com.bookcycle.healthy.dao.UserDao;
import com.bookcycle.healthy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    public MongoTemplate mongoTemplate;

    @Override
    public String saveUser(User user) {
        mongoTemplate.save(user);
        User user1 = queryUserByHospitalId(user.getHospitalId());
        if(user1!=null){
            return "success";
        }

        return "fail";
    }

    @Override
    public User queryUserByHospitalId(String hospitalId) {
        Query query = new Query(Criteria.where("hospitalId").is(hospitalId));
        User user = mongoTemplate.findOne(query,User.class,"user");
        if(user == null)
            return new User();
        return user;
    }
}
