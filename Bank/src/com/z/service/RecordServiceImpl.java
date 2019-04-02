package com.z.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.z.dao.RecordMapper;
import com.z.entity.Record;
@Service
public class RecordServiceImpl implements RecordService {
	
	@Resource
	private RecordMapper dao;
	
	@Override
	public Record queryRecord(int id) {
		// TODO Auto-generated method stub
		return dao.queryRecord(id);
	}

	@Override
	public List<Record> queryRecordAll() {
		// TODO Auto-generated method stub
		return dao.queryRecordAll();
	}

	@Override
	public int deleteRecord(int id) {
		// TODO Auto-generated method stub
		return dao.deleteRecord(id);
	}

	@Override
	public int updateRecord(Record record) {
		// TODO Auto-generated method stub
		return dao.updateRecord(record);
	}

	@Override
	public int insertRecord(Record record) {
		// TODO Auto-generated method stub
		return dao.insertRecord(record);
	}

}
