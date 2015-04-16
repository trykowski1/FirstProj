package com.mobica.jatr.ForthProj;

public class StarsMain {

	public static void main(String[] args) {
		// a
		Sun sunny = new Sun();
		Sirus siriously = new Sirus();
		
		// b
		sunny.shine();
		siriously.shine();
		
		// c/e
		Sun supersunny = new SuperSun();
		System.out.println(((SuperSun)supersunny).getSuperSun());
	
		// d/e
		Sun ultrasunny = new UltraSun();
		System.out.println(((UltraSun)ultrasunny).getUltraSun());
		
		// f
		
		try {
			((SuperSun)supersunny).getSuperSun();
		} catch(ClassCastException castEx){
			System.out.println("Error occured in casting: "+castEx.toString());
		}
		
		try {
			((UltraSun)ultrasunny).getUltraSun();
		} catch(ClassCastException castEx){
			System.out.println("Error occured in casting: "+castEx.toString());
		}
	}

}
