package com.ramonfernandes.pojo;

import java.util.ArrayList;
import java.util.List;

public class Sale implements ObjectFromFile{
    private int id;
    private List<Item> listOfItemsFromSale;
    private Salesman name;

    public Sale(int id, Salesman name) {
        this.id = id;
        this.listOfItemsFromSale = new ArrayList<Item>();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public List<Item> getListOfItemsFromSale() {
        return listOfItemsFromSale;
    }

    public Salesman getName() {
        return name;
    }

    public void addItemToList(Item item){
        listOfItemsFromSale.add(item);
    }
}
