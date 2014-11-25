package com.mobica.jatr.ThirdProj;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlanetaryLunarProbeUnit {
	PlanetaryLunarProbe test = new PlanetaryLunarProbe();
	
	@Before
	public void setUp() throws Exception {
		
		System.out.println("Test started");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test completed");
	}

	@Test
	public void testDeepSpaceCommunicate() {
		try{
		Assert.assertEquals("Test failed, method deepSpaceCommunicate reurns wrong value.",test.deepSpaceCommunicate("Test"), new String("EcoTest"));
		}catch(Exception e){
			System.out.println("Test failed, method deepSpaceCommunicate reurns wrong value:"+e.getMessage());
		}
	}	

	@Test
	public void testLandOnMoon() {
		ArrayList<Boolean> collection = new ArrayList<Boolean>();
		boolean col = false;
		
		for (int i = 0; i < 20; i++){
			collection.add(test.landOnMoon());
		}
		
		for (int i = 0; i < collection.size()-1; i++){
			 if(collection.get(i) != collection.get(i+1)){
				 col = true;
				 break;
			 }
			 else{
				 col = false;
			 }
			 
		}
		try{
		Assert.assertTrue("Test failed, boolean values are not randomely generated.", col == true);
		}catch(Exception e){
			System.out.println("Test failed, boolean values are not randomely generated:"+e.getMessage());
		}
	}

}
