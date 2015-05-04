package com.mobica.jatr.Tests;

interface Executable {
	void execute();
}

class Runner {
	public void run(Executable e) {
		System.out.println("This block starting....");
		e.execute();
	}
}

public class Lambda {

	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.run(new Executable() {

			@Override
			public void execute() {
				System.out.println("This is an old way...");

			}

		});

		System.out.println("**************************");
		runner.run(() -> {
			System.out.println("This is lambda....");
		});

	}

}
