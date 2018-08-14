package com.bookcycle.healthy.daoImpl;

import com.bookcycle.healthy.dao.RecordDao;
import com.bookcycle.healthy.pojo.Records;
import com.sun.prism.impl.Disposer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RecordDaoImpl implements RecordDao {

    @Autowired
    public MongoTemplate mongoTemplate;

    @Override
    public void saveRecord(Records records) {
        mongoTemplate.save(records);
    }

    @Override
    public List<Records> queryAll() {
        Query query = new Query();
        List<Records> records = mongoTemplate.find(query,Records.class,"records");
        if(records == null){
            return new ArrayList<Records>();
        }

        return records;
    }

    @Override
    public Records queryHistory(String history, String future) {
        return null;
    }

    @Override
    public Records queryByHospitalId(String hospitalId) {
        Query query = new Query(Criteria.where("hospitalId").is(hospitalId));
        Records records = mongoTemplate.findOne(query,Records.class,"records");
        if(records == null){
            return new Records();
        }
        return records;
    }
}
