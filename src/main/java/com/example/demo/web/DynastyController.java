package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Dynasty;
import com.example.demo.repository.DynastyRepository;

@RestController
@RequestMapping("/dynasty")
public class DynastyController {

	@Autowired
	private DynastyRepository dynastyRepository;

	@RequestMapping("/findAll")
	public List<Dynasty> findAll() { 
		List<Dynasty> dynastys = dynastyRepository.findAll(); 
		return dynastys;


	}

	@RequestMapping("/hello")
	public String hello() { 
		return "success"; 
	} 
}
