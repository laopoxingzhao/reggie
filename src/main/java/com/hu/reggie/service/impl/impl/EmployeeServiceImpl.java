package com.hu.reggie.service.impl.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hu.reggie.entity.Employee;
import com.hu.reggie.mapper.EmployeeMapper;
import com.hu.reggie.service.impl.EmployeeService;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
