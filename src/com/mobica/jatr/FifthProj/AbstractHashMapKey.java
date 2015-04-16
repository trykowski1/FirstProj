package com.mobica.jatr.FifthProj;

public abstract class AbstractHashMapKey {
	int key;
	
	public abstract int getKey();
	
	public int hashCode(){
		return key;
	}
}
