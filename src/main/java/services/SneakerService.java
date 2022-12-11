package services;

import models.Sneaker;

import java.util.ArrayList;

public class SneakerService {

    private static int nextId = 1;  // (1)

    private static ArrayList<Sneaker> inventory = new ArrayList<>();  // (2)

    public static Sneaker create(int id, String name, String brand, String sport, float size, int qty, float price){
        Sneaker s = new Sneaker(id,name,brand,sport, size, qty, price);
        inventory.add(s);
        return s;
    }
    //read
    public Sneaker findSneaker(int id) {
        if(inventory.size()>=id){
            return inventory.get(id);
        }
        return null;
    }

    //read all
    public Sneaker[] findAll() {
        Sneaker[] newArr = new Sneaker[inventory.size()];
        for(int i =0; i< inventory.size(); i++){
            newArr[i]=inventory.get(i);
        }
        return newArr;
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        if(inventory.size()>=id){
            inventory.remove(id);
            return true;
        }
        return false;
    }
}