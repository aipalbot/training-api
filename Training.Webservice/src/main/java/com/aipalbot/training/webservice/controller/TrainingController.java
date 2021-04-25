package com.aipalbot.training.webservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aipalbot.training.webservice.request.TrainingRequest;

//end point - api

@RequestMapping("training/") //base path
@RestController
public class TrainingController {
	
	@PostMapping("calculate")
	public String calculateCost(@RequestBody TrainingRequest request ) {
		
		int totalTrainingCost = request.getCostPerTraining();
		int durationMonth = request.getDurationPerMonth();
		int durationInHours = durationMonth * 16;
		
		double costPerHour = totalTrainingCost/durationInHours;
		
		String response = "Cost of training per hour is "+ costPerHour;
		
		
		return response;
	}

}
