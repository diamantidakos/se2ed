package com.mgiandia.se2ed.ch11.p02valueobject;


/**
 * Η ταχυδρομική διεύθυνση.
 * @author Νίκος Διαμαντίδης
 *
 */
public class Address {
    private String street;
    private String number;
    private String city;
    private ZipCode zipcode;
    private String country = "Ελλάδα";

    /**
     * Προκαθορισμένος κατασκευαστής.
     */
    public Address() { }

    /**
     * Βοηθητικός κατασκευαστής που αντιγράφει κάποιας άλλη διεύθυνση.
     * @param address Η άλλη διεύθυνση
     */
    public Address(Address address) {
        this.street = address.getStreet();
        this.number = address.getNumber();
        this.city = address.getCity();
        this.zipcode = address.getZipCode();
        this.country = address.getCountry();
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getCity() {
        return city;
    }

    public void setZipCode(ZipCode zipcode) {
        this.zipcode = zipcode;
    }

    public ZipCode getZipCode() {
        return zipcode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    /**
     * Η ισότητα βασίζεται σε όλα τα πεδία της διεύθυνσης.
     * @param other Το άλλο αντικείμενο προς έλεγχο
     * @return  {@code true} αν τα αντικείμενα είναι ίσα
     */
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }

        Address theAddress = (Address) other;
        if (!(street == null ? theAddress.street 
                == null : street.equals(theAddress.street))) {
            return false;
        }
        if (!(number == null ? theAddress.number 
                == null : number.equals(theAddress.number))) {
            return false;
        }
        if (!(city == null ? theAddress.city 
                == null : city.equals(theAddress.city))) {
            return false;
        }
        if (!(zipcode == null ? theAddress.zipcode
                == null : zipcode.equals(theAddress.zipcode))) {
            return false;
        }
        if (!(country == null ? theAddress.country
                == null : country.equals(theAddress.country))) {
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
        if (street == null && number == null && city == null
                && zipcode == null && country == null) {
            return 0;
        }

        int result = 0;
        result = street == null ? result : 13 * result + street.hashCode(); 
        result = number == null ? result : 13 * result + number.hashCode();
        result = city == null ? result : 13 * result + city.hashCode();
        result = zipcode == null ? result : 13 * result + zipcode.hashCode();
        result = country == null ? result : 13 * result + country.hashCode();
        return result;
    }

}
