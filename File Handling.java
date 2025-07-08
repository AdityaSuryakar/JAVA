//Assignment 06 
//Q1. Write a Java program to store and view vehicle records 
//using binary file handling. 
//o 
//1. Create a class Vehicle with: 
//int vehicleId 
//o 
//o 
//String model 
//String type 
//double price 
//o 
//2. Use writeVehicles() Create a list of 4–5 hardcoded vehicle 
//objects. 
//Validate that price > 0. Skip invalid entries. 
//Write the valid vehicle records to a binary file named 
//Vehicles.db using DataOutputStream 
//3. Use readVehicles() Sort the list by price in descending 
//order using Comparator and Collections.sort() or 
//list.sort(...). 
//4. Use DataOutputStream to write and DataInputStream 
//to read. Use a loop to read until end of file. 


package com.dkte;

class Vehicle {
	private int vehicleid;
	private String model;
	private String type;
	private double price;
	
	public Vehicle() {
		
	}

	public Vehicle(int vehicleid, String model, String type, double price) {
		this.vehicleid = vehicleid;
		this.model = model;
		this.type = type;
		this.price = price;
	}

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleid=" + vehicleid + ", model=" + model + ", type=" + type + ", price=" + price + "]";
	}
}




-------------------------------------------------------------------------------------------------------------------------


package com.dkte;

import java.io.*;
import java.util.*;

public class Program {
	static final String FILE_NAME = "Vehicles.db";

	public static void writeVehicles() {
		List<Vehicle> vehicles = Arrays.asList(
			new Vehicle(101, "Honda City", "Sedan", 1200000),
			new Vehicle(102, "Maruti Alto", "Hatchback", 350000),
			new Vehicle(103, "Tata Nexon", "SUV", 1050000),
			new Vehicle(104, "Hyundai i20", "Hatchback", -450000), // Invalid
			new Vehicle(105, "Toyota Innova", "MPV", 1500000)
		);

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
			for (Vehicle v : vehicles) {
				if (v.getPrice() <= 0) {
					System.out.println("Skipping invalid vehicle with ID " + v.getVehicleid());
					continue;
				}
				dos.writeInt(v.getVehicleid());
				dos.writeUTF(v.getModel());
				dos.writeUTF(v.getType());
				dos.writeDouble(v.getPrice());
			}
			System.out.println("Vehicle records written successfully to " + FILE_NAME);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readVehicles() {
		List<Vehicle> vehicleList = new ArrayList<>();

		try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
			while (true) {
				int id = dis.readInt();
				String model = dis.readUTF();
				String type = dis.readUTF();
				double price = dis.readDouble();

				Vehicle v = new Vehicle(id, model, type, price);
				vehicleList.add(v);
			}
		} catch (EOFException eof) {
			// End of file reached – ignore
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Sort by price descending
		vehicleList.sort((v1, v2) -> Double.compare(v2.getPrice(), v1.getPrice()));

		System.out.println("\nSorted Vehicle List (by Price Descending):");
		for (Vehicle v : vehicleList) {
			System.out.println(v);
		}
	}

	public static void main(String[] args) {
		writeVehicles();
		readVehicles();
	}
}



