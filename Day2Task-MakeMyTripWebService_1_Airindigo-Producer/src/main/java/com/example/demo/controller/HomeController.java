package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Airindia;


@RestController
public class HomeController {

	@RequestMapping("/getproduce")
	public List Prelogin()
	{
		Airindia s=new Airindia();
		s.setId(1);
		s.setFromm("pune");
		s.setToo("kolhapur");
        s.setPrice("100");
        s.setDate(1-1-2023);
     
        Airindia s1=new Airindia();
		s1.setId(1);
		s1.setFromm("pune");
		s1.setToo("sangli");
        s1.setPrice("200");
        s1.setDate(1-1-2023);
        
	List al=new ArrayList();
	al.add(s);
	al.add(s1);
	return al;
	}
}