package com.nicolasodano.code.jsonexample;

import com.google.gson.*;
public class Main {
	
	/**
	 * Define a customer with its data.
	 * @author Nicola Sodano
	 * 
	 */
	private class Customer {
		private String name;
		private String lastname;
		
		/**
		 * Getter method for customer name
		 * @return	the name of the customer
		 */
		public String getName() {
			return this.name;
		}
		
		/**
		 * Getter method for customer last name
		 * @return	the customer last name
		 */
		public String getLastname() {
			return this.lastname;
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// The Json google library
		Gson gson = new Gson();
		// Json string from some other resources. It contains an array of customers.
		String json = "[{\"name\" : \"Pippo\", \"lastname\" : \"Inzaghi\"}," +
				"{\"name\" : \"Pluto\", \"lastname\" : \"Paperino\"}]";
		
		
		try {
			// Deserializes the json string into an array of Customers.
			Customer customers[] = gson.fromJson(json, Customer[].class);
			
			// Prints the results
			for(Customer customer: customers) {
				System.out.println("Name: " + customer.getName() + ", " +
						"Last name: " + customer.getLastname());
			}
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
