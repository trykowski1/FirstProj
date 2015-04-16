package com.mobica.jatr.FifthProj;

import java.util.HashMap;
import java.util.Map;

public class MainHashExercise  {
	private Map<MyHashMapKey, String> hasshy = new HashMap<MyHashMapKey, String>();
	
	public  Map<MyHashMapKey, String> getMapHash(){
		return this.hasshy;
	}
	
	public void setMapHash(){
		hasshy.put(new MyHashMapKey(1), "8th floor");
		hasshy.put(new MyHashMapKey(2), "9th floor");
		hasshy.put(new MyHashMapKey(2), "10th floor");
		hasshy.put(new MyHashMapKey(3), "10th floor");
	}
}
