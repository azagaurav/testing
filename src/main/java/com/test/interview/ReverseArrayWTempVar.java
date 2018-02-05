package com.test.interview;


public class ReverseArrayWTempVar {
	public static void main(String []arg){
		Integer [] s={1,2,3,4,5,6,7,8,9};
		System.out.println(reverseArrayWTempVar(s));
	}
	public static Integer[] reverseArrayWTempVar(Integer [] temp){
		Integer arrayLength = temp.length;
		arrayLength = arrayLength-1;
		for(int i=0; i<=arrayLength; i++){			
			if(i<arrayLength){
				temp[i] = temp[i] + temp[arrayLength];
				temp[arrayLength] =temp[i] - temp[arrayLength];
				temp[i] = temp[i] - temp[arrayLength];
				arrayLength--;
				System.out.println(temp[i] +" : "+temp[arrayLength+1]);
				
			}else{
				System.out.println(temp[i]);
				break;
			}
		}
		
		return temp;
		
	}

}
