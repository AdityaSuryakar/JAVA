package com.aditya;

public class Chair {
	//fields
	private int weight;
	private int height;
	private  static int price;	//static field
	//constructor-param...
	public Chair(int weight,int height){
		this.weight = weight;
		this.height = height;
		//this.price = price;
	}
	//static block
	static {
		price = 500;
		System.out.println("Block 1-------------");
	}
	static {
		price = 1000;
		System.out.println("Block 2------------");
	}
	
	
	public static int getPrice() {
		return price;
	}
	public static void setPrice(int price) {
		Chair.price = price;
	}
	public void display() {
		System.out.println("Weight:"+weight);
		System.out.println("Height:"+height);
		System.out.println("Price:"+price);
	}
	
}


---------------------------------------------------------------------

package com.aditya;
	
public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chair c1 = new Chair(10,20);
		c1.display();

	}

}
