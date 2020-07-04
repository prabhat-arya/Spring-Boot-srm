package com.ba.beans;

public class Flipcart {
	Coriare dtCoriare;
	Coriare blCoriare;
	String awbNo=null;
	public void placeOrder(String items,int itemNo,int pinCode) {
		if (pinCode<=1000) {
			awbNo=dtCoriare.order(items, itemNo);
		}
		else if (pinCode>=1001) {
	      awbNo=blCoriare.order(items, itemNo);
		}
		
		System.out.println(awbNo);
	}
	
	
	
	public void setDtCoriare(Coriare dtCoriare) {
		this.dtCoriare = dtCoriare;
	}
	public void setBlCoriare(Coriare blCoriare) {
		this.blCoriare = blCoriare;
	}
	

}
