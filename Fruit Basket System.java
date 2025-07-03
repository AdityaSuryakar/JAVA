//Assignment 03  
//Q1 Apply inheritance n polymorphism 
//a) Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy 
//b) Properties (instance variables)  : color : String , weight : double , name:String, isFresh : boolean 
//c) Add suitable constructors. 
//d) Override  toString correctly to return state of all fruits (including : name ,color , weight ) 
//e) Add a taste() method : public String taste() 
//For Fruit : it should return "no specific taste" 
//Apple : should return  "sweet n sour" 
//Mango : should return  "sweet" 
//Orange : should return  "sour" 
//f)  Add all of above classes under the package "com.app.fruits" 
//g) Create a Class  FruitBasket , with main method inside it. Use it for testing 
//h) Prompt user for the basket size n create suitable data structure and give options 
//0. Exit 
//1. Add Mango 
//case 1 : boundary checking 
//basket[counter++]=new Mango(nm,weight,color); 
//break; 
//2. Add Orange 
//3. Add Apple 
//NOTE : You will be adding a fresh fruit in the basket , in all of above options. 
//4. Display names of all fruits in the basket. 
//eg :  for-each --- null checking --getName() 
//5. Display name,color,weight , taste of all fresh fruits , in the basket. 
//eg : for-each , null checking --toString , taste, isFresh : getter 
//6. Mark a fruit as stale 
//i/p : index 
//eg : setter : isFresh : false 
//o/p : error message (in case of invalid index) or mark it stale 
//7. Display tastes of all stale(not fresh) fruits in the basket. 

---------------------------------------
package com.app.fruits;

// Base class
public class Fruit {
    private String name;
    private String color;
    private double weight;
    private boolean isFresh;

    public Fruit(String name, String color, double weight, boolean isFresh) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = isFresh;
    }

    public String getName() {
        return name;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public String taste() {
        return "no specific taste";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight;
    }
}

----------------------------------------

package com.app.fruits;

public class Apple extends Fruit {
    public Apple(String name, String color, double weight) {
        super(name, color, weight, true);
    }

    @Override
    public String taste() {
        return "sweet n sour";
    }
}

--------------------------------------

package com.app.fruits;

public class Mango extends Fruit {
    public Mango(String name, String color, double weight) {
        super(name, color, weight, true);
    }

    @Override
    public String taste() {
        return "sweet";
    }
}

------------------------------------

package com.app.fruits;

public class Orange extends Fruit {
    public Orange(String name, String color, double weight) {
        super(name, color, weight, true);
    }

    @Override
    public String taste() {
        return "sour";
    }
}

--------------------------------

package com.app.fruits;
import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the fruit basket: ");
        Fruit[] basket = new Fruit[sc.nextInt()];
        int counter = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("0. Exit");  
            System.out.println("1. Add (Mango)");
            System.out.println("2. Add (Orange)");
            System.out.println("3. Add (Apple)");
            System.out.println("4. Display names of all fruits");
            System.out.println("5. Display all fresh fruits with taste");
            System.out.println("6. Mark a fruit as stale");
            System.out.println("7. Display tastes of all stale fruits");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    exit = true;
                    break;
               case 1:
                case 2:
                case 3:
                    if (counter < basket.length) {
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        System.out.print("Enter color: ");
                        String color = sc.next();
                        System.out.print("Enter weight(gram): ");
                        double weight = sc.nextDouble();

                        switch (choice) {
                            case 1:
                                basket[counter++] = new Mango(name, color, weight);
                                break;
                            case 2:
                                basket[counter++] = new Orange(name, color, weight);
                                break;
                            case 3:
                                basket[counter++] = new Apple(name, color, weight);
                                break;
                        }
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;
                case 4:
                    for (Fruit f : basket) {
                        if (f != null)
                            System.out.println(f.getName());
                    }
                    break;
                case 5:
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh())
                            System.out.println(f + ", Taste: " + f.taste());
                    }
                    break;
                case 6:
                    System.out.print("Enter index to mark as stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < counter) {
                        basket[index].setFresh(false);
                        System.out.println("Marked as stale.");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 7:
                    for (Fruit f : basket) {
                        if (f != null && !f.isFresh())
                            System.out.println(f.getName() + " taste: " + f.taste());
                    }
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
} 
