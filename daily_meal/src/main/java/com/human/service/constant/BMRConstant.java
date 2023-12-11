package com.human.service.constant;

public enum BMRConstant {
	
	WEIGHT(10),
	HEIGHT(6.25),
	AGE(5),
	MAN(5),
	WOMAN(161);
	
	private double number;
	
	BMRConstant(final double number) {
		this.number = number;
	}
	
	public double getNumber() {
		return number;
	}

}
