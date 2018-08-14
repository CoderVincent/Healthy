package com.bookcycle.healthy.dao;


import com.bookcycle.healthy.pojo.Records;

import java.util.List;

public interface RecordDao {
    void saveRecord(Records records);

    List<Records> queryAll();

    Records queryHistory(String history,String future);

    Records queryByHospitalId(String hospitalId);
}
