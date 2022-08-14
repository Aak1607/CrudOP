package com.example.CrudOP.REpo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.CrudOP.Entity.Student;



@Repository
public interface Repo extends  JpaRepository<Student , Integer>
{

	
	List<Student> findAllByOrderByNameAsc();
}
