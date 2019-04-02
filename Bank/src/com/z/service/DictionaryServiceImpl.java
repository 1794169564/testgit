package com.z.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.z.dao.DictionaryMapper;
import com.z.entity.Dictionary;
@Service
public class DictionaryServiceImpl implements DictionaryService {
	
	@Resource
	private DictionaryMapper dao;
	
	@Override
	public Dictionary queryDictionary(int id) {
		// TODO Auto-generated method stub
		return dao.queryDictionary(id);
	}

	@Override
	public List<Dictionary> queryDictionaryAll() {
		// TODO Auto-generated method stub
		return dao.queryDictionaryAll();
	}

	@Override
	public int deleteDictionary(int id) {
		// TODO Auto-generated method stub
		return dao.deleteDictionary(id);
	}

	@Override
	public int updateDictionary(Dictionary dictionary) {
		// TODO Auto-generated method stub
		return dao.updateDictionary(dictionary);
	}

	@Override
	public int insertDictionary(Dictionary dictionary) {
		// TODO Auto-generated method stub
		return dao.insertDictionary(dictionary);
	}

}
