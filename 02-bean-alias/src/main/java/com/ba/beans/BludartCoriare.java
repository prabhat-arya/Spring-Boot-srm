package com.ba.beans;

public class BludartCoriare implements Coriare{
	@Override
	public String order(String items, int itemNo) {
		return "BLUDART"+itemNo;
	}

}
