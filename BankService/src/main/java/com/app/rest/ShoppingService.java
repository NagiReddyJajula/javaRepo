package com.app.rest;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.IAxisService;

@RestController
@RequestMapping("/shopping")
public class ShoppingService {

	@Autowired
	private IAxisService service;
	
	@GET
	@RequestMapping("/checkBalance/{accNo}")
	public String checkTheBalance(@PathParam("accNo")Long accNo){
		System.out.println(accNo);
		if(service.checkBalance((long)35))
			return "u r having balance";
		else
			return "no balance";
	}
}
