/*
 * YapstoneStagedOnBoardingServicesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.yapstone.apiuat.models;

import java.util.*;

public class BusinessProfileResourceBuilder {
    //the instance to build
    private BusinessProfileResource businessProfileResource;

    /**
     * Default constructor to initialize the instance
     */
    public BusinessProfileResourceBuilder() {
        businessProfileResource = new BusinessProfileResource();
    }

    /**
     * The name of the business.
     */
    public BusinessProfileResourceBuilder name(String name) {
        businessProfileResource.setName(name);
        return this;
    }

    /**
     * The type of business unit (sole_prop, corp, llc)
     */
    public BusinessProfileResourceBuilder type(TypeEnum type) {
        businessProfileResource.setType(type);
        return this;
    }

    /**
     * Doing business as name list.
     */
    public BusinessProfileResourceBuilder dba(List<String> dba) {
        businessProfileResource.setDba(dba);
        return this;
    }

    /**
     * The email address.
     */
    public BusinessProfileResourceBuilder email(String email) {
        businessProfileResource.setEmail(email);
        return this;
    }

    /**
     * The address of the application, asset, bank, etc.
     */
    public BusinessProfileResourceBuilder address(AddressResource address) {
        businessProfileResource.setAddress(address);
        return this;
    }

    /**
     * The phone number.
     */
    public BusinessProfileResourceBuilder phone(PhoneResource phone) {
        businessProfileResource.setPhone(phone);
        return this;
    }

    /**
     * The business identification information.
     */
    public BusinessProfileResourceBuilder businessIdentification(BusinessIdentificationResource businessIdentification) {
        businessProfileResource.setBusinessIdentification(businessIdentification);
        return this;
    }

    /**
     * Business registration information contains data about the businesses formation.
     */
    public BusinessProfileResourceBuilder registration(RegistrationResource registration) {
        businessProfileResource.setRegistration(registration);
        return this;
    }

    /**
     * The website hostname.
     */
    public BusinessProfileResourceBuilder websiteURL(String websiteURL) {
        businessProfileResource.setWebsiteURL(websiteURL);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BusinessProfileResource build() {
        return businessProfileResource;
    }
}