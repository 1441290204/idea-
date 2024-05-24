package com.example.cjhfirstproject.service;

import com.example.cjhfirstproject.entity.Department;
import com.example.cjhfirstproject.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> getAllDepartmentsByMapper() {
        return departmentMapper.selectAll();
    }

    @Override
    public Department getDepartmentByMapper(Integer id) {
        return departmentMapper.selectById(id);
    }

    @Override
    public Integer RegisterByMapper(Department department) {
        return departmentMapper.insertToDepartment(department);
    }

    @Override
    public Integer ModifyDepartmentByMapper(Department department) {
        return departmentMapper.update(department);
    }
    public Integer ModifyDepartmentsByMapper(List<Department> departments) {
        for(Department department : departments){
            departmentMapper.update(department);
        }
        return 1;
    }

    @Override
    public Integer deleteDepartmentByMapper(Integer id) {
        return  departmentMapper.delete(id);
    }

    @Override
    public Integer deleteDepartmentsByMapper(Integer[] ids) {
        for(Integer id : ids){
            departmentMapper.delete(id);
        }
        return  1;
    }
}
