package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.jobvacancy;
import com.example.entity.register;
import com.example.repository.jobvacancyRepository;
import com.example.repository.registerRepositiry;

@RestController
public class homecontroller {
	
	@Autowired
	private registerRepositiry regisrepo;
	@Autowired
	private jobvacancyRepository job;
	
	@GetMapping("/")
	public String Index() {
		return "welcome";
	}
	
	@PostMapping("/registerdata")
	public register savedata(@RequestBody register regi) {
		regisrepo.save(regi);
		return regi;
	}
	
	@PostMapping("/addjob")
	public jobvacancy savedatajob(@RequestBody jobvacancy jobs) {
		job.save(jobs);
		return jobs;
	}
	
	@GetMapping("/getalldata")
	public List<register> getAll(){
		List<register> alldata = regisrepo.findAll();
		return alldata;
		
	}
	
	@GetMapping("/getdata/{username}")
	public register getdata(@PathVariable String username) {
		Optional<register> onedata = regisrepo.findById(username);
		register reg = onedata.get();
		return reg;
	}
	

}
