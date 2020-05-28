package com.myybatis.service.impl;

import com.myybatis.dao.EmpDao;
import com.myybatis.pojo.Emp;
import com.myybatis.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Resource
    private EmpDao empDao;

    public List<Emp> getList() {
        return empDao.getList();
    }


    public int addEmp(Emp emp) {
        return empDao.addEmp(emp);
    }


    public int delEmp(int id) {
        return empDao.delEmp(id);
    }


    public int editEmp(Emp emp) {
        return empDao.editEmp(emp);
    }


    public Emp getEmpById(int id) {
        return empDao.getEmpById(id);
    }



}
