package com.cust;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("src/com/cust/cust.txt");
		CustomerDetails customerDetails = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			 String line = null;
			 List<CustomerDetails> al = new ArrayList<CustomerDetails>();
			    while ((line = br.readLine()) != null) 
			    {
			       // process the line
			    	String tokenLine[] = line.split(" ");
			    		customerDetails = new CustomerDetails();
						customerDetails.setCid(tokenLine[0]);
						customerDetails.setCustomerName(tokenLine[1]);
						customerDetails.setDate(tokenLine[2]);
						customerDetails.setAmt(Double.parseDouble(tokenLine[3]));
						al.add(customerDetails);
						
				
			    	
			     } 
			    
			    
			    for (CustomerDetails customerDetails2 : al) {
			    	System.out.println(customerDetails2);
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
