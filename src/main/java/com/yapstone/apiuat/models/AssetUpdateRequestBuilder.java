/*
 * YapstoneStagedOnBoardingServicesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.yapstone.apiuat.models;

import java.util.*;

public class AssetUpdateRequestBuilder {
    //the instance to build
    private AssetUpdateRequest assetUpdateRequest;

    /**
     * Default constructor to initialize the instance
     */
    public AssetUpdateRequestBuilder() {
        assetUpdateRequest = new AssetUpdateRequest();
    }

    /**
     * The name of the owner of the asset. It will consist of first and last name.
     */
    public AssetUpdateRequestBuilder owner(IndividualOwnerResource owner) {
        assetUpdateRequest.setOwner(owner);
        return this;
    }

    /**
     * The type of asset [PROPERTY]
     */
    public AssetUpdateRequestBuilder type(String type) {
        assetUpdateRequest.setType(type);
        return this;
    }

    /**
     * The partners externalId id for the Asset.
     */
    public AssetUpdateRequestBuilder externalId(String externalId) {
        assetUpdateRequest.setExternalId(externalId);
        return this;
    }

    /**
     * The primary instrument id for the Asset. By default, all the asset level offerings will be linked to this instrument.
     */
    public AssetUpdateRequestBuilder primaryInstrument(String primaryInstrument) {
        assetUpdateRequest.setPrimaryInstrument(primaryInstrument);
        return this;
    }

    /**
     * contains data about the property.
     */
    public AssetUpdateRequestBuilder property(PropertyResource property) {
        assetUpdateRequest.setProperty(property);
        return this;
    }

    /**
     * The merchant id
     */
    public AssetUpdateRequestBuilder managedBy(List<String> managedBy) {
        assetUpdateRequest.setManagedBy(managedBy);
        return this;
    }

    /**
     * The status of the entity.
     */
    public AssetUpdateRequestBuilder status(EntityProductStatusResource status) {
        assetUpdateRequest.setStatus(status);
        return this;
    }

    public AssetUpdateRequestBuilder operationalStatus(AssetOperationalStatus operationalStatus) {
        assetUpdateRequest.setOperationalStatus(operationalStatus);
        return this;
    }

    /**
     * Products requested by marketplace.
     */
    public AssetUpdateRequestBuilder products(List<ProductEnum> products) {
        assetUpdateRequest.setProducts(products);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AssetUpdateRequest build() {
        return assetUpdateRequest;
    }
}