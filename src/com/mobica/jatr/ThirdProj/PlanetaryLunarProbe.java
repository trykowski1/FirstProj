package com.mobica.jatr.ThirdProj;

import java.util.Random;

public class PlanetaryLunarProbe implements Probe {

	@Override
	public String deepSpaceCommunicate(String stringParam) {
		// TODO Auto-generated method stub
		return "Echo" + stringParam;
	}

	@Override
	public boolean landOnMoon() {
		// TODO Auto-generated method stub
		Random randomGen = new Random();
		return randomGen.nextBoolean();
		
	}

	public static void main(String[] args) {
		PlanetaryLunarProbe test = new PlanetaryLunarProbe();
		//test.deepSpaceCommunicate("oko");
		System.out.println(test.deepSpaceCommunicate("oko"));
		System.out.println(test.landOnMoon());
		//System.out.println(new String("EcoTes);

	}
	

}
