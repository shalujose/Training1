package com.revature.mymaven;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingOp {

	public static void main(String[] args) throws IOException {
		
		String file="books.txt";
		FileWriter Writer=null;
		try
		{
			Writer=new FileWriter(file);
			Writer.append("c,200");
			Writer.append("\n");
			Writer.append("Java,500");
			Writer.append("\n");
			Writer.append("C++,300");
			System.out.println("File write Completed");
			
			
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		
		finally
		{
			Writer.close();
		}
	}

}
