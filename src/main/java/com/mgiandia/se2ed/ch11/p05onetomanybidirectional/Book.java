package com.mgiandia.se2ed.ch11.p05onetomanybidirectional;

import java.util.HashSet;
import java.util.Set;







/**
 * Το βιβλίο.
 * @author Νίκος Διαμαντίδης
 */
public class Book {

    private Set<Item> items = new HashSet<Item>();

 
    public Set<Item> getItems() {
        return new HashSet<Item>(items);
    }


    /**
     * Προσθήκη ενός αντιτύπου ({@link Item}) στη συλλογή αντιτύπων του βιβλίου.
     * @param item Το αντίτυπο
     */
    public void addItem(Item item) {
        if (item != null) {
            item.setBook(this);
        }
    }

    /**
     * Απομάκρυνση ενός αντιτύπου ({@link Item}) από
     * τη συλλογή αντιτύπων του βιβλίου.
     * @param item Το αντίτυπο
     */
    public void removeItem(Item item) {
        if (item != null) {
            item.setBook(null);
        }
    }

    /**
     * Μη ενθυλακωμένη συλλογή των αντιτύπων του βιβλίου.
     * @return Τα αντίτυπα του βιβλίου
     */
    Set<Item> friendItems() {
        return items;
    }

   
 }