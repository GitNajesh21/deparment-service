package com.citi.deparment.service.controller;

import com.citi.deparment.service.entity.Department;
import com.citi.deparment.service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/departments")
@RestController
public class DepartmentController {

    @Autowired
    DepartmentService deptService;

    @PostMapping("/")
    public Department save(@RequestBody Department dept){
        return deptService.saveDept(dept);
    }

    @GetMapping("/{id}")
    public Department getDept(@PathVariable("id") Long deptId){
        return deptService.getDeptById(deptId);
    }

    @GetMapping("/check")
    public String testService(){
        return "Service test OK";
    }

}
