package com.example.CrudOP.Controller;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudOP.Entity.Student;
import com.example.CrudOP.Service.ServiceClass;

@RestController
public class ControllerClass {
	@Autowired
	ServiceClass serviceClass;
	@PostMapping("save")
	public Student saveData(@RequestBody Student student) {
		Student saveData = serviceClass.saveData(student);
		return saveData;
	}
	@GetMapping("getalldataAsc")
	public List<Student> getalldataAsc() {
		List<Student> getalldata = serviceClass.getalldataAscending();
		return getalldata;
	}
	@GetMapping("getalldata")
	public List<Student> getalldata() {
		List<Student> getalldata = serviceClass.getalldata();
		return getalldata;
	}
	@GetMapping("getalldata/{id}")
	public Student getsinglestd(@PathVariable int id) {
		Student getsinglestd = serviceClass.getsinglestd(id);
		return getsinglestd;
	}

	@PutMapping("update")
	public Student updateEmp(@RequestBody Student student) {
		Student saveData = serviceClass.saveData(student);
		return saveData;

	}

}