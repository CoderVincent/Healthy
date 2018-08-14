package com.bookcycle.healthy.controller;

import com.bookcycle.healthy.dao.RecordDao;
import com.bookcycle.healthy.pojo.Records;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecordController {

    @Autowired
    public RecordDao recordDao;

    @RequestMapping(value = "/saveRecord" , method = RequestMethod.POST)
    public String saveRecord(@RequestBody Records records){
        recordDao.saveRecord(records);
        if(recordDao.queryByHospitalId(records.getHospitalId()).getHospitalId()!=null){
            return "success";
        }
        return "fail";
    }

    @RequestMapping(value = "/queryAllRecords" , method = RequestMethod.GET)
    public ResponseEntity<List<Records>> queryAll(){
        List<Records> records = recordDao.queryAll();
        return new ResponseEntity<List<Records>>(records,HttpStatus.OK);
    }
}
