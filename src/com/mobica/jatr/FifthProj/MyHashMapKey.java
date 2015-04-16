package com.mobica.jatr.FifthProj;

public class MyHashMapKey extends AbstractHashMapKey{
	private int key;

	public  MyHashMapKey(int key){
		this.setKey(key);
		
	}
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
	public String toString(int key){
		return String.valueOf(this.getKey());
	}
	
	public boolean equals(Object o) {
		return o instanceof MyHashMapKey
				&& (this.getKey() == ((MyHashMapKey) o).getKey());		
	}

}
