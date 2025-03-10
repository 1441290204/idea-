package com.example.cjhfirstproject.controller;

import com.example.cjhfirstproject.entity.Department;
import com.example.cjhfirstproject.service.DepartmentServiceImpl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;




@RestController
@RequestMapping("/Departments")
public class DepartmentController {
    private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentServiceImpl departmentService;

    @GetMapping()
    public List<Department> GetAll(){
        log.info("日志文件");
        return departmentService.getAllDepartmentsByMapper();

    }
    @GetMapping("/{id}")
    public Department GetById(@PathVariable Integer  id ){
        log.info("日志文件");
        return departmentService.getDepartmentByMapper(id);
    }
    @PostMapping()
    public String Register(@RequestBody Department department){
        if(departmentService.RegisterByMapper(department)==1){
            return "注册成功";
        }
        else{
            return "注册失败";
        }
    }
    @PutMapping()
    public String ModifyDepartment(@RequestBody Department department){
        departmentService.ModifyDepartmentByMapper(department);
        return "更新成功";
    }
    @PutMapping("/s")
    public String ModifyDepartments(@RequestBody List<Department> departments){
        departmentService.ModifyDepartmentsByMapper(departments);
        return "更新成功";
    }
    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Integer id){
        departmentService.deleteDepartmentByMapper(id);
        return "删除成功!";
    }

    @DeleteMapping()
        public String deleteDepartments(@RequestBody Integer[] integers){
        departmentService.deleteDepartmentsByMapper(integers);
        return "删除成功!";
    }
}
