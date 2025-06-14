package com.roushan.SimpleWebApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roushan.SimpleWebApp.model.Emp;

@Repository
public interface EmpDao extends JpaRepository<Emp, Integer> {

}
