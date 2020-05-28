package com.myybatis.controller;

import com.myybatis.pojo.Emp;
import com.myybatis.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/")
    public String getEmps(Model model){
        List<Emp> list = this.empService.getList();
        model.addAttribute("empList",list);
        return "index";
    }



}
