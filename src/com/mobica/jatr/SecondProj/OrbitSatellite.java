package com.mobica.jatr.SecondProj;

import java.util.*;
import com.mobica.jatr.FirstProj.SpaceCraft;

public class OrbitSatellite extends SpaceCraft {

	private ArrayList<Float> radioSignals = new ArrayList<Float>();
	private Float z = new Float(0);

	public OrbitSatellite(String name) {
		super(name);
	}

	public void setRadioSignals(ArrayList<Float> radioSignal) {

		/*
		 * for (int i = 0; i < radioSignal.size(); i++){
		 * this.radioSignals.add(radioSignal.get(i)); }
		 */

		Iterator<Float> itr = radioSignal.iterator();
		while (itr.hasNext()) {
			Float element = itr.next();
			this.radioSignals.add(element);
		}

	}

	public Float getRadioSignal(int i) {
		Float ind;
		ind = this.radioSignals.get(i);
		return ind;
	}

	public Float getRadioSignal() {
		int size;
		size = this.radioSignals.size();
		return this.radioSignals.get(size - 1);

	}

	public void moves(Float[] x, Float[] y, Float[] z) {

		super.moves(x, y);
		float sumZ = 0;

		for (int j = 0; j < z.length; j++) {
			if (z[j] != 0) {
				sumZ += z[j];
			} else {
				sumZ = 0;
			}
		}
		this.z = sumZ;

	}

	public Float getZ() {
		return z;
	}

}
