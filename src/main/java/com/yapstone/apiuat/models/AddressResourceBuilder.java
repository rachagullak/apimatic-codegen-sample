/*
 * YapstoneStagedOnBoardingServicesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.yapstone.apiuat.models;

import java.util.*;

public class AddressResourceBuilder {
    //the instance to build
    private AddressResource addressResource;

    /**
     * Default constructor to initialize the instance
     */
    public AddressResourceBuilder() {
        addressResource = new AddressResource();
    }

    /**
     * The street address line 1.
     */
    public AddressResourceBuilder street1(String street1) {
        addressResource.setStreet1(street1);
        return this;
    }

    /**
     * The street address line 2.
     */
    public AddressResourceBuilder street2(String street2) {
        addressResource.setStreet2(street2);
        return this;
    }

    /**
     * The street address line 3.
     */
    public AddressResourceBuilder street3(String street3) {
        addressResource.setStreet3(street3);
        return this;
    }

    /**
     * The street address line 4.
     */
    public AddressResourceBuilder street4(String street4) {
        addressResource.setStreet4(street4);
        return this;
    }

    /**
     * The name of the city.
     */
    public AddressResourceBuilder city(String city) {
        addressResource.setCity(city);
        return this;
    }

    /**
     * The state or province where the address resides(required for USA and CAN).
     */
    public AddressResourceBuilder state(String state) {
        addressResource.setState(state);
        return this;
    }

    /**
     * The postal code of the address.
     */
    public AddressResourceBuilder postalCode(String postalCode) {
        addressResource.setPostalCode(postalCode);
        return this;
    }

    /**
     * The 3-letter countryCode of the address.
     */
    public AddressResourceBuilder countryCode(String countryCode) {
        addressResource.setCountryCode(countryCode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AddressResource build() {
        return addressResource;
    }
}