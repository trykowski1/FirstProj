package com.mobica.jatr.SecondProj;

import java.util.ArrayList;

import com.mobica.jatr.FirstProj.SpaceCraft;

public class Main {

	public static void main(String[] args) {
		
		OrbitSatellite sputnik = new OrbitSatellite("Sputnik_overriden");
	
		System.out.println();
		ArrayList<Float> test = new ArrayList<Float>();
		test.add(1.5f);
		test.add(4.8f);
		test.add(5.5f);
		test.add(78.5f);
		
		sputnik.setRadioSignals(test);
		System.out.println(sputnik.getRadioSignal());
		
		Float[] x ={new Float(6), new Float(1), new Float(0), new Float(1)};
		Float[] y ={new Float(7), new Float(4), new Float(0), new Float(0)};
		Float[] z ={new Float(7), new Float(4), new Float(0), new Float(9)};
		sputnik.moves(x, y, z); 
		System.out.println(sputnik.getZ());
		
		
		//***********The above equals the below. Below, we have casting to OrbitSatellite object.************
		/*
		SpaceCraft sputnik = new OrbitSatellite("Sputnik_overriden");
		
		System.out.println();
		ArrayList<Float> test = new ArrayList<Float>();
		test.add(1.5f);
		test.add(4.8f);
		test.add(5.5f);
		test.add(78.5f);
		
		((OrbitSatellite)sputnik).setRadioSignals(test);
		System.out.println(((OrbitSatellite)sputnik).getRadioSignal());
		
		Float[] x ={new Float(6), new Float(1), new Float(0), new Float(1)};
		Float[] y ={new Float(7), new Float(4), new Float(0), new Float(0)};
		Float[] z ={new Float(7), new Float(4), new Float(0), new Float(9)};
		
		((OrbitSatellite)sputnik).moves(x, y, z); 
		System.out.println(((OrbitSatellite)sputnik).getZ());
		*/

	}

}
