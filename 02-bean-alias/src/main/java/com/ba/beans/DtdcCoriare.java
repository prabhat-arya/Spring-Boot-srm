package com.ba.beans;

public class DtdcCoriare implements Coriare{
	@Override
	public String order(String items, int itemNo) {
		return "DTDC"+itemNo;
	}

}
