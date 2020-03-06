/*
 * YapstoneStagedOnBoardingServicesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.yapstone.apiuat.models;

import java.util.*;

public class ContractCreateRequestBuilder {
    //the instance to build
    private ContractCreateRequest contractCreateRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ContractCreateRequestBuilder() {
        contractCreateRequest = new ContractCreateRequest();
    }

    /**
     * The partners externalId id for entity.
     */
    public ContractCreateRequestBuilder externalId(String externalId) {
        contractCreateRequest.setExternalId(externalId);
        return this;
    }

    /**
     * The unique id of the Applicant Resource.
     */
    public ContractCreateRequestBuilder applicantId(String applicantId) {
        contractCreateRequest.setApplicantId(applicantId);
        return this;
    }

    /**
     * Product catalog.
     */
    public ContractCreateRequestBuilder products(Products products) {
        contractCreateRequest.setProducts(products);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ContractCreateRequest build() {
        return contractCreateRequest;
    }
}