/*
 * YapstoneStagedOnBoardingServicesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.yapstone.apiuat.models;

import java.util.*;

public class AssetResourceBuilder {
    //the instance to build
    private AssetResource assetResource;

    /**
     * Default constructor to initialize the instance
     */
    public AssetResourceBuilder() {
        assetResource = new AssetResource();
    }

    /**
     * The name of the owner of the asset. It will consist of first and last name.
     */
    public AssetResourceBuilder owner(IndividualOwnerResource owner) {
        assetResource.setOwner(owner);
        return this;
    }

    /**
     * The type of asset [PROPERTY]
     */
    public AssetResourceBuilder type(String type) {
        assetResource.setType(type);
        return this;
    }

    /**
     * The partners externalId id for the Asset.
     */
    public AssetResourceBuilder externalId(String externalId) {
        assetResource.setExternalId(externalId);
        return this;
    }

    /**
     * The primary instrument id for the Asset. By default, all the asset level offerings will be linked to this instrument.
     */
    public AssetResourceBuilder primaryInstrument(String primaryInstrument) {
        assetResource.setPrimaryInstrument(primaryInstrument);
        return this;
    }

    /**
     * contains data about the property.
     */
    public AssetResourceBuilder property(PropertyResource property) {
        assetResource.setProperty(property);
        return this;
    }

    /**
     * The merchant id
     */
    public AssetResourceBuilder managedBy(List<String> managedBy) {
        assetResource.setManagedBy(managedBy);
        return this;
    }

    /**
     * Products requested by marketplace.
     */
    public AssetResourceBuilder products(List<ProductEnum> products) {
        assetResource.setProducts(products);
        return this;
    }

    /**
     * The resource identifier for the Asset.
     */
    public AssetResourceBuilder id(String id) {
        assetResource.setId(id);
        return this;
    }

    /**
     * The status of the entity.
     */
    public AssetResourceBuilder status(EntityProductStatusResource status) {
        assetResource.setStatus(status);
        return this;
    }

    public AssetResourceBuilder operationalStatus(AssetOperationalStatus operationalStatus) {
        assetResource.setOperationalStatus(operationalStatus);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AssetResource build() {
        return assetResource;
    }
}