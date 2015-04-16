package com.mobica.jatr.FirstProj;

public class SpaceCraft {

	Float x = new Float(0);
	Float y = new Float(0);
	String name;

	public SpaceCraft(String name) {
		this.name = name;
	}

	public String get_name() {
		return name;
	}

	public Float get_x() {
		return x;
	}

	public Float get_y() {
		return y;
	}
	

	private void move(Float x, Float y) {
		this.x = x;
		this.y = y;
		
	}

	public void moves(Float[] x, Float[] y) {
		float sumX = 0, sumY = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				sumX += x[i];
			} else {
				sumX = 0;
			}
		}

		for (int j = 0; j < x.length; j++) {
			if (y[j] != 0) {
				sumY += y[j];
			} else {
				sumY = 0;
			}

		}
		this.move(sumX, sumY);
		
	}

	public String to_String() {
		String position;
		position = "Name: " + this.name + " position x: " + this.x
				+ " position y: " + this.y;
		return position;
		
	}

}


