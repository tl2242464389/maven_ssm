package com.test.dubbo.service.impl;

import java.util.List;

import com.test.dubbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mapper.StudentMapper;
import com.test.pojo.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	public List<Student> selAll() {
		return studentMapper.selAll();
	}

}
