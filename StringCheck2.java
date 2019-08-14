package com.revature.mymaven;

public class StringCheck2 {

	public static void main(String[] args) {
		
		String name="hello";
		String dept=null;
		// TODO Auto-generated method stub
		
		try {
			addStudDetails(name,dept);
			addnamedept(name,dept);
		}
		catch (Exception e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Error Catched");
		}
	}
		
		public static void addnamedept( String name,String dept) throws Exception
		{
			if(name==null)
			{
				throw new Exception("Invalid name");
			}
			if(dept==null) {
				throw new Exception("Invalid department");
			}
		}
		public static void addStudDetails(String name,String dept)
		{
			System.out.println("Name : "+name);
			System.out.println("Department : "+dept);
		}

	

}
