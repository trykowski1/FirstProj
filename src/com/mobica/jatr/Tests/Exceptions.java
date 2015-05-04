package com.mobica.jatr.Tests;

import java.io.*;

public class Exceptions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			String c;
			file = new File(
					"C:\\Projects\\FirstProj\\src\\com\\mobica\\jatr\\Tests\\text.txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			while ((c = br.readLine()) != null) {
				System.out.println(c);
			}

		} catch (FileNotFoundException f) {
			System.out.println("Exceptions: " + f);
		} finally {
			if (fr != null) {
				fr.close();
			}
		}

	}

}
