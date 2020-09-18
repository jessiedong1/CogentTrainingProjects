package com.example;

public enum Status {
	OFF("System is off"),ON("System is on"),SLEEP("Sytem is sleeping");
	
	private String desc;
	private Status(String desc) {
		this.desc =desc;
	}
	
	public String getDescription() {
		return desc;
	}

}
