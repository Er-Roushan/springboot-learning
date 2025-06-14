package com.roushan.SimpleWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roushan.SimpleWebApp.dao.EmpDao;
import com.roushan.SimpleWebApp.model.Emp;

@Service
public class EmpService {

		@Autowired
		private EmpDao emprepo;
		
		public List<Emp> getAllEmployees(){
			return emprepo.findAll();
		}

		public String addEmp(Emp obj) {
			// TODO Auto-generated method stub
			emprepo.save(obj);
			return "Added Successfully";
		}
}
