package com.mgiandia.se2ed.ch11.p07composition.var1;

/**
 * Ο Ταχυδρομικός κώδικας.
 * @author Νίκος Διαμαντίδης
 *
 */
public class ZipCode {
    private String zipcode;

    public ZipCode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCode() {
        return zipcode;
    }

    public boolean isValid() {
        return true;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (this == other) {
            return true;
        }

        if (!(other instanceof ZipCode)) {
            return false;
        }

        ZipCode theZipCode = (ZipCode) other;
        return zipcode == null
            ? theZipCode.zipcode == null
            : zipcode.equals(theZipCode.zipcode);
    }


    @Override
    public int hashCode() {
        return zipcode == null ? 0 : zipcode.hashCode();
    }

}
