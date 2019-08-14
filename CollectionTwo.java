package com.revature.mymaven;

import java.util.ArrayList;

public class CollectionTwo {

	public static void main(String[] args) {
		
		CollectionTwoData book1=new CollectionTwoData();
		book1.bookName="Java";
		book1.price=250;
		book1.authorName="goosling";
		
		CollectionTwoData book2=new CollectionTwoData();
		book2.bookName="Artificial Intelligence";
		book2.price=500;
		book2.authorName="Riyan";
		
		CollectionTwoData book3=new CollectionTwoData();
		book3.bookName="Programming in C";
		book3.price=450;
		book3.authorName="Balaguruswami";
		
		ArrayList<CollectionTwoData> list=new ArrayList<CollectionTwoData>();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		
		for(CollectionTwoData ob:list)
		{
			System.out.println(ob.bookName+"   "+ob.price+"   "+ob.authorName);
		}
		
		

	}

}
