package com.acadglid.java.core.session4.assignment1;

public class ArrayReverse {
	

	static String[] reverseArray(String[] str){
		//String[] str1= new String[str.length];
		//int index=0;
		for(int i=0; i<str.length/2;i++){
			String temp=str[i];
			str[i]=str[str.length-1-i];
			str[str.length-1-i]=temp;
			
		}
		return str;
	}
	static void printArray(String[] str){
		for(int i=0; i<str.length;i++){
			System.out.print(str[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"sourabh", "arun", "manoj","vivek"};
		System.out.println("Array before reverse:");
		printArray(str);
		String[] str1=reverseArray(str);
		System.out.println("Array after reverse: ");
		printArray(str1);

	}

}
