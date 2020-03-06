/*
 * YapstoneStagedOnBoardingServicesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.yapstone.apiuat.models;

import java.util.*;

public class ExpirationDateResourceBuilder {
    //the instance to build
    private ExpirationDateResource expirationDateResource;

    /**
     * Default constructor to initialize the instance
     */
    public ExpirationDateResourceBuilder() {
        expirationDateResource = new ExpirationDateResource();
    }

    /**
     * card expiration year
     */
    public ExpirationDateResourceBuilder year(String year) {
        expirationDateResource.setYear(year);
        return this;
    }

    /**
     * card expiration month
     */
    public ExpirationDateResourceBuilder month(String month) {
        expirationDateResource.setMonth(month);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ExpirationDateResource build() {
        return expirationDateResource;
    }
}