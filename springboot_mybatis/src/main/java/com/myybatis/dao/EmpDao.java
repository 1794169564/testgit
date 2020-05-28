package com.myybatis.dao;

import com.myybatis.pojo.Emp;

import java.util.List;

public interface EmpDao {
    public List<Emp> getList();

    public int addEmp(Emp emp);

    public int delEmp(int id);

    public int editEmp(Emp emp);

    public Emp getEmpById(int id);


}
