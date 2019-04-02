package com.z.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.z.entity.Record;

public interface RecordMapper {
	public Record queryRecord(@Param(value = "id") int id);

	public List<Record> queryRecordAll();

	public int deleteRecord(@Param(value = "id") int id);

	public int updateRecord(Record record);
	
	public int insertRecord(Record record);
}
