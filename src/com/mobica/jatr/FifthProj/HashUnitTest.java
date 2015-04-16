package com.mobica.jatr.FifthProj;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class HashUnitTest {

	private MainHashExercise exercise = new MainHashExercise();
	private ArrayList<MyHashMapKey> listofkey = new ArrayList<MyHashMapKey>();
	private Map<MyHashMapKey, String> hasshy = new HashMap<MyHashMapKey, String>();
	
	public ArrayList<MyHashMapKey>getListOfKeys(){
		exercise.setMapHash();
		hasshy = exercise.getMapHash();
		
		Set<Entry<MyHashMapKey, String>> set = hasshy.entrySet();
	    Iterator<Entry<MyHashMapKey, String>> i = set.iterator();
	    	while(i.hasNext()) {
	    		Entry<MyHashMapKey, String> me = i.next();
	    		///System.out.println(me.getKey());
	    		listofkey.add(me.getKey());
	    	}
	    return listofkey;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("The test starts");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("The test is finished");
	}

	@Test
	public void test() {
		this.getListOfKeys();
		boolean result = true;
		
		for (int i = 0; i < listofkey.size()-1; i++){
			 if(listofkey.get(i).equals(listofkey.get(i+1))){
				 result = false;
				 break;
			 }
			 else{
				 result = true;
			 }
		}
		
		Assert.assertTrue("Test failed. Some of the keys are equal" , result==true);
		
	}

}
