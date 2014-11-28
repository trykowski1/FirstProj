package com.mobica.jatr.FifthProj;

import java.util.HashMap;
import java.util.Map;

public class MainHashExercise  {
	Map<MyHashMapKey, String> hasshy = new HashMap<MyHashMapKey, String>();
	
	public static void main(String[] args) {
	MainHashExercise test = new MainHashExercise();
	System.out.println(test.hash());
	}
	
	public Map<MyHashMapKey, String> hash(){
		hasshy.put(new MyHashMapKey(1), "8th floor");
		hasshy.put(new MyHashMapKey(2), "9th floor");
		hasshy.put(new MyHashMapKey(2), "10th floor");
		return hasshy;
	}
}
