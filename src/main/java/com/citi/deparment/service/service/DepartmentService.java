package com.citi.deparment.service.service;

import com.citi.deparment.service.entity.Department;
import com.citi.deparment.service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDept(Department dept) {
        return departmentRepository.save(dept);
    }

    public Department getDeptById(Long deptId) {
        return departmentRepository.findByDepartmentId(deptId);
    }
}
