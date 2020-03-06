/*
 * YapstoneStagedOnBoardingServicesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.yapstone.apiuat.models;

import java.util.*;

public class CustomerStatusResourceBuilder {
    //the instance to build
    private CustomerStatusResource customerStatusResource;

    /**
     * Default constructor to initialize the instance
     */
    public CustomerStatusResourceBuilder() {
        customerStatusResource = new CustomerStatusResource();
    }

    /**
     * The verification status of the Customer.
     */
    public CustomerStatusResourceBuilder verificationStatus(VerificationStatus2Enum verificationStatus) {
        customerStatusResource.setVerificationStatus(verificationStatus);
        return this;
    }

    public CustomerStatusResourceBuilder requiredActions(List<CustomerActionResource> requiredActions) {
        customerStatusResource.setRequiredActions(requiredActions);
        return this;
    }

    public CustomerStatusResourceBuilder reasons(List<String> reasons) {
        customerStatusResource.setReasons(reasons);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CustomerStatusResource build() {
        return customerStatusResource;
    }
}