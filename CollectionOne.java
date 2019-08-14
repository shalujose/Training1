package com.revature.mymaven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;

public class CollectionOne {

	private static final String HashMap = null;

	public static void main(String[] args) {
		
		ArrayList bookList=new ArrayList();
		
		// TODO Auto-generated method stub
		bookList.add("Object");
		bookList.add("Oriented");
		bookList.add("Programming");
		bookList.add("In JAVA");
		bookList.add(1995);
		
		System.out.println(bookList);
		//for(Object ob:bookList)
		//{
			//String bookName=(String) ob;
			//System.out.println(bookName);
		//}
		
		
		//Using generic concept
		System.out.println("**************");
		System.out.println("Using Generic");
		ArrayList<String> oopscon=new ArrayList<String>();
		oopscon.add("Abstraction");	
		oopscon.add("Encapsulation");
		oopscon.add("Inheritance");
		oopscon.add("Polymorphism");
		oopscon.add("Polymorphism");
		
		for(Object obj:oopscon)
		{
			String concep=(String) obj;
			System.out.println(concep);
			
		}
		System.out.println("**************");
		
		//Avoid Duplication
		System.out.println("Without Duplicate values");
		
		HashSet<String> books=new HashSet<String>();
		books.add("Programming in C");
		books.add("Data Structure");
		books.add("Java2");
		books.add("Python Programming");
		System.out.println(books);
		
		//I want sorted dataS
		System.out.println("Sorted data");
		System.out.println("************");
		TreeSet<String> Tbooks=new TreeSet<String>();
		
		Tbooks.add("C");
		Tbooks.add("C++");
		Tbooks.add("Java");
		Tbooks.add("Python");
		Tbooks.add("C#");
		
		System.out.println(Tbooks);
		
		//Key Value pairs
		
		System.out.println("Store key value pairs");
		System.out.println("**********************");
		
		HashMap<String,Integer> bookData=new HashMap<String,Integer>();
		bookData.put("C",250);
		bookData.put("Java",500);
		bookData.put("ML",300);
		bookData.put("AI",350);
		
		System.out.println(bookData.containsKey("C"));
		for(String bookName:bookData.keySet())
		{
			Integer price=bookData.get(bookName);
			System.out.println("BookName:"+bookName+" Price:"+price);
		}
		
	System.out.println("********************");
		
		

	}

}
