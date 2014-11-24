package com.mobica.jatr.SecondProj;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class OrbitSatelliteUnit {
	

	@Test
	public void testGetRadioSignalInt() {
		
		OrbitSatellite sputnikTestInt = new OrbitSatellite("SputnikTest");
		ArrayList<Float> test = new ArrayList<Float>();
		test.add(1.5f);
		test.add(4.8f);
		test.add(5.5f);
		test.add(78.5f);
		
		sputnikTestInt.setRadioSignals(test);
		assertEquals(sputnikTestInt.getRadioSignal(1), new Float(4.8));
		
	}
 
	@Test
	public void testGetRadioSignal() {
		
		OrbitSatellite sputnikTest = new OrbitSatellite("SputnikTest");
		ArrayList<Float> test = new ArrayList<Float>();
		test.add(1.5f);
		test.add(4.8f);
		test.add(5.5f);
		test.add(78.5f);
		
		sputnikTest.setRadioSignals(test);
		assertEquals(sputnikTest.getRadioSignal(), new Float(78.5));
		
	}

}
