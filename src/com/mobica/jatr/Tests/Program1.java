package com.mobica.jatr.Tests;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
		hash1.put(2, "AA");
		hash1.put(1, "BB");
		for (Map.Entry<Integer, String> entry : hash1.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key: " + key + " value: " + value);
		}
		System.out.println();

		// *********
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Tomek");
		list1.add("Adam");
		list1.add("Radek");
		list1.add("Tomek");
		Collections.sort(list1);
		Iterator<String> it = list1.iterator();
		while (it.hasNext()) {
			String elem = it.next();
			System.out.println(elem);
		}
		System.out.println();

		// ************
		String[] names = { "caaa", "aaab", "ed", "beorge" };
		sortStringBubble(names);
		for (int k = 0; k < 4; k++) {
			System.out.println(names[k]);
		}
		System.out.println();

	}
	

	private static void sortStringBubble(String[] x) {
		// TODO Auto-generated method stub

		int j;
		boolean flag = true; // will determine when the sort is finished
		String temp;

		while (flag) {
			flag = false;
			for (j = 0; j < x.length - 1; j++) {
				if (x[j].compareToIgnoreCase(x[j + 1]) > 0) { // ascending sort
					temp = x[j];
					x[j] = x[j + 1]; // swapping
					x[j + 1] = temp;
					flag = true;
				}
			}
		}

	}

}
