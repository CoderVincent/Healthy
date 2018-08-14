package com.bookcycle.healthy;

import com.bookcycle.healthy.dao.RecordDao;
import com.bookcycle.healthy.dao.UserDao;
import com.bookcycle.healthy.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HealthyApplicationTests {

    @Autowired
    public MongoTemplate mongoTemplate;

    @Autowired
    public UserDao userDao;

    @Autowired
    public RecordDao recordDao;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testSave() {
        User user = new User();
        user.setHospitalId("1002");
        user.setName("lisi");
        user.setPassword("123456");
        user.setTimestamp(String.valueOf(System.currentTimeMillis()));
        userDao.saveUser(user);
    }


    @Test
    public void testRecordQuery(){
        System.out.println(userDao.queryUserByHospitalId("1002"));
    }
}
