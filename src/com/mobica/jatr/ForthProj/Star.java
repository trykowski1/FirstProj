package com.mobica.jatr.ForthProj;

public abstract class Star {
	public abstract Float getShinningRange();
	
	public void shine() {
		System.out.println( "This star shines in range:"+getShinningRange());
	}
	

}
