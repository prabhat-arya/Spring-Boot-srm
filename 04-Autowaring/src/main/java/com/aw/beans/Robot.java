package com.aw.beans;

public class Robot {
	Chip chip;
	
	// 0-param constructor
	public Robot() {
	}
	
	//constructor injection
	public Robot(Chip chip) {
		super();
		this.chip = chip;
	}

	public void louanch() {
		System.out.println("chip name"+chip.name+" version " +chip.version+" is added in to Robote");
	}

	//setter injection
	public void setChip(Chip chip) {
		this.chip = chip;
	}

	
}
