package com.example.CrudOP.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.CrudOP.Entity.Student;
import com.example.CrudOP.REpo.Repo;

@Service
public class ServiceClass {
	 @Autowired 
	 Repo repo;
	 public Student saveData(Student student)
	 {
		 Student save = repo.save(student);
		return save;
    }
	public List<Student> getalldataAscending() {
		  List<Student> findAll = repo.findAllByOrderByNameAsc();
		return findAll;
	}
	public Student getsinglestd(int id)
	{
	    Student student = repo.findById(id).get();
	    return student;
	}
	public List<Student> getalldata() {
		return repo.findAll();
	}
}
