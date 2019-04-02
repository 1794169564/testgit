package com.z.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.z.entity.Dictionary;

public interface DictionaryMapper {
	public Dictionary queryDictionary(@Param(value="id")int id);

	public List<Dictionary> queryDictionaryAll();

	public int deleteDictionary(@Param(value="id")int id);

	public int updateDictionary(Dictionary dictionary);
	
	public int insertDictionary(Dictionary dictionary);
}
