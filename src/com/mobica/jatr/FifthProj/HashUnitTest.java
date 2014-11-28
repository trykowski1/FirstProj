package com.mobica.jatr.FifthProj;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HashUnitTest {

	MainHashExercise test = new MainHashExercise();
	Map<MyHashMapKey, String> hash = new HashMap<MyHashMapKey, String>();

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
		hash = test.hash();
		boolean col = true;
		ArrayList<MyHashMapKey> list = new ArrayList<MyHashMapKey>();
		hash.
		Set set = hash.entrySet();
	    Iterator i = set.iterator();
	    while(i.hasNext()) {
	    	Map.Entry me = (Map.Entry)i.next();
	    	list.add(me.getKey());
		
		

		for (int i = 0; i < hash.size() - 1; i++) {
			if (hash. == collection.get(i + 1)) {
				col = false;
				break;
			} else {
				col = true;
			}
		}
	}

}
