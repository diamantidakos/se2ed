package com.mgiandia.se2ed.ch11.p04onetomany;

import java.util.HashSet;
import java.util.Set;


public class Book {

    private Set<Item> items = new HashSet<Item>();

    public Set<Item> getItems() {
        return new HashSet<Item>(items);
    }


    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
        }
    }

  
    public void removeItem(Item item) {
        if (item != null) {
            items.remove(item);
        }
    }

   
 }