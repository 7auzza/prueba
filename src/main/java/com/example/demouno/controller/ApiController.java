package com.example.demouno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demouno.entities.EntityResponse;
import com.example.demouno.service.ApiService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ApiController {

	@Autowired
	private ApiService apiService;

	public ApiController(ApiService apiService) {
		this.apiService = apiService;
	}

	@GetMapping("/data")
	public EntityResponse getData() {
		return this.apiService.getDataFromApi();
	}

}
