package com.mobica.jatr.FirstProj;

import java.util.Random;

public class Processing {
	String a;
	String b;

	private void start() {

		SpaceCraft sputnik = new SpaceCraft("Sputnik 1");
		SpaceCraft luna = new SpaceCraft("Luna 1");

		Float[][] field = new Float[4][4];
		Random randomGen = new Random();

		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = new Float(randomGen.nextInt(4));
				if (i == 0 && j == 0) {
					System.out.println("Sputnik coordinates:");
				}
				if (i == 2 && j == 0) {
					System.out.println();
					System.out.println("Luna coordinates:");
				}
				System.out.print(field[i][j] + "\t");
			}
			System.out.println();
		}
		sputnik.moves(field[0], field[1]);
		luna.moves(field[2], field[3]);

		a = sputnik.to_String();
		b = luna.to_String();

		/*
		 * Float[] x ={new Float(6), new Float(1), new Float(0), new Float(1)};
		 * Float[] y ={new Float(7), new Float(4), new Float(0), new Float(0)};
		 * sputnik.moves(x, y); luna.moves(x, y);
		 * 
		 * a = sputnik.to_String(); b = luna.to_String();
		 */
	}

	public static void main(String[] args) {
		Processing process = new Processing();
		process.start();
		

		System.out.println();
		System.out.println(process.a);
		System.out.println(process.b);

	}

}
