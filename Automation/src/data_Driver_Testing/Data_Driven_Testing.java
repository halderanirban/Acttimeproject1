package data_Driver_Testing;

import java.util.ArrayList;
import java.util.HashMap;

public class Data_Driven_Testing {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("http://localhost/login.do");
		a1.add("admin");
		a1.add("halderanirbna@gmail.com");
		a1.add("manager");
// when you add any Element (then same indexing is not working)again we have to calculate new Index
		System.out.println(a1.get(2));

// To overcome all the Drawback	we go for (HashMap)	
		
		HashMap<String, String> hm= new HashMap<String, String>();
		hm.put("url", "http://localhost/login.do");
		hm.put("username", "admin");
		hm.put("email", "halderanirbna@gmail.com");
		hm.put("pwd", "manager");
		
		System.out.println(hm.get("pwd"));
	}

}
