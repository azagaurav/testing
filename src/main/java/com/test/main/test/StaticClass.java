package com.test;

public class StaticClass {
	public static class ASD implements ASDImpl {
		int i = 0;

		//@Override
		public int addd(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println("munesh");
			return 0;
		}

	}

	public static void main(String[] arg) {
		ASD asd = new ASD();
		asd.addd(0, 0);
	}

}
