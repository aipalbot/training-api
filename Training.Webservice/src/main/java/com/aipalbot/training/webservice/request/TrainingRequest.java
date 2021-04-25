package com.aipalbot.training.webservice.request;



public class TrainingRequest {
	//getter and setter
	private int costPerTraining;
	private int durationPerMonth;
	
	
	public int getCostPerTraining() {
		return costPerTraining;
	}
	
	public void setCostPerTraining(int costPerTraining) {
		this.costPerTraining = costPerTraining;
	}
	
	public int getDurationPerMonth() {
		return durationPerMonth;
	}
	
	public void setDurationPerMonth(int durationPerMonth) {
		this.durationPerMonth = durationPerMonth;
	}
	
}
