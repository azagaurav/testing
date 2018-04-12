package com.test.java.exception;

public class GeneralEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			System.out.println("try");
			System.exit(1);
			return;
			//System.out.println("2");
		}catch(Exception e){
			System.out.println("catch");
			return;
		}finally{
			System.out.println("finally");
			throw Exception;
		}
	}

}
