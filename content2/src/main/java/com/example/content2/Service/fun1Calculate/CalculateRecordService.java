package com.example.content2.Service.fun1Calculate;

import com.example.content2.POJO.fun1Calculate.CalculateRecord;

public interface CalculateRecordService {

    int createTable(String tableName);

    void calculateOffsetMagnificationForData(double offset,
                                             int magnification,
                                             long loopTimes);

    boolean isExistTable(String tableName);

    int insertNewRecordIfAbsentCreate(String tableName,
                                      CalculateRecord cr);
}
