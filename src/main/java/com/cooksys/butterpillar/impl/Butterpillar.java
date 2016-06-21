package com.cooksys.butterpillar.impl;

import com.cooksys.butterpillar.model.IButterpillar;

public class Butterpillar implements IButterpillar{
	private double length;
	private double leavesEaten;
	
	@Override
	public int compareTo(IButterpillar b) {
		if (this.length == b.getLength()) {
			if (this.leavesEaten == b.getLeavesEaten())
				return 0;
			return (this.leavesEaten > b.getLeavesEaten()) ? 1 : -1;
		}
		return (this.length > b.getLength()) ? 1 : -1;
	}

	@Override
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getLength() {
		return this.length;
	}

	@Override
	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;
	}

	@Override
	public double getLeavesEaten() {
		return this.leavesEaten;
	}

}
