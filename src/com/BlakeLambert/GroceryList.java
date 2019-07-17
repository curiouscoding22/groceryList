package com.BlakeLambert;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String> (); //creates an Array List with data type string, Array list is a class, empty constructor made

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items on your list.");
        for(int i=0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ", " + groceryList.get(i));
        }
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position - 1) + "has been changed to " + newItem + ".");
    }

    public String findItem(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if(position > 0){
            return groceryList.get(position);
        }
        return null;
    }

}


