package com.test.file;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.test.inheritance.A;
import com.test.inheritance.B;

abstract class InstantiationObject{
	public void rename(){
		
	}
}

public class RenameFiles {
	public static void printArgLengths(String[] names){
		System.out.println(names.length);
	}
	public static void printArgLengths(String names){
		System.out.println(names.length());
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		A a =new B();
		a.run();
		String str="GAURAV";
		RenameFiles [] names = new RenameFiles[2147483647];//{"A","B","C"};
		
		String str1=new String("GAURAV");
		String str2= new String();
		printArgLengths(str);
		printArgLengths(str1);
		printArgLengths(new String());
		printArgLengths(new String[2147483647]);
		System.out.println(names.getClass().getName());
		File folder = new File("D:\\Entertain\\Songs\\Mix\\");
		File[] files = folder.listFiles();
//		try{
//		for (int i = 0; i < files.length; i++) {
//			File file = new File(folder+"\\"+files[i].getName());
//			System.out.println(file);
//			System.out.println(new File(folder+"\\"+(files[i].getName().replace("Mix", ""))));
//			System.out.println(file.renameTo(new File(folder+"\\"+(files[i].getName().replace("songs.PK", " ")))));
//		
//		}
//		}catch(Exception e){
//			e.printStackTrace();
//		}
	}

}
