package com.mgiandia.se2ed.ch11.p05onetomanybidirectional;



/**
 * Το αντίτυπο ενός βιβλίου.
 * @author Νίκος Διαμαντίδης
 *
 */
public class Item {

    private int itemNumber = 0;
    private Book book;

    /**
     * Θέτει τον αριθμό εισαγωγής του αντιτύπου.
     * Ο αριθμός εισαγωγής προσδιορίζει μοναδικά κάθε αντίτυπο.
     * @param itemNumber Ο αριθμός εισαγωγής.
     */
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    /**
     * Επιστρέφει τον αριθμό εισαγωγής του αντιτύπου.
     * Ο αριθμός εισαγωγής προσδιορίζει μοναδικά κάθε αντίτυπο.
     * @return Ο αριθμός εισαγωγής
     */
    public int getItemNumber() {
        return itemNumber;
    }


    /**
     * Θέτει το βιβλίο του αντιτύπου.
     * @param book  Το βιβλίο του αντιτύπου
     * @see Book#addItem(Item)
     */
    public void setBook(Book book) {
        if (this.book != null) {
            this.book.friendItems().remove(this);
        }
        this.book = book;
        if (this.book != null) {
            this.book.friendItems().add(this);
        }
    }

    /**
     * Επιστρέφει το βιβλίο του αντιτύπου.
     * @return Το βιβλίο του αντιτύπου
     */
    public Book getBook() {
        return book;
    }



}
