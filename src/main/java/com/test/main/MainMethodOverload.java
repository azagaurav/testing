package com.test.main;

public class MainMethodOverload {
	public static void main(String[] args) {
		System.out.println("main(String[] args)");
	}

	public static void main(String arg1, int i) {
		System.out.println("main(String arg1)");
	}

	public static void main(String arg1, String arg2) {
		System.out.println("main(String arg1, String arg2)");
	}

	public static void main(int i) {
		MainMethodOverload mmo = new MainMethodOverload();
		try {
			mmo.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
