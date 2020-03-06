/*
 * YapstoneStagedOnBoardingServicesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.yapstone.apiuat.models;

import java.util.*;

public class MarketplaceProductUpdateBuilder {
    //the instance to build
    private MarketplaceProductUpdate marketplaceProductUpdate;

    /**
     * Default constructor to initialize the instance
     */
    public MarketplaceProductUpdateBuilder() {
        marketplaceProductUpdate = new MarketplaceProductUpdate();
    }

    /**
     * An array of consents.
     */
    public MarketplaceProductUpdateBuilder consents(List<ConsentRequest> consents) {
        marketplaceProductUpdate.setConsents(consents);
        return this;
    }

    /**
     * The unique id of the Asset Resource.
     */
    public MarketplaceProductUpdateBuilder assetId(String assetId) {
        marketplaceProductUpdate.setAssetId(assetId);
        return this;
    }

    /**
     * The type of Payout Mode
     */
    public MarketplaceProductUpdateBuilder payoutMode(PayoutModeEnum payoutMode) {
        marketplaceProductUpdate.setPayoutMode(payoutMode);
        return this;
    }

    /**
     * The ISO currency code enum for settlements.
     */
    public MarketplaceProductUpdateBuilder settlementCurrency(String settlementCurrency) {
        marketplaceProductUpdate.setSettlementCurrency(settlementCurrency);
        return this;
    }

    /**
     * Subscription Type
     */
    public MarketplaceProductUpdateBuilder subscriptionType(String subscriptionType) {
        marketplaceProductUpdate.setSubscriptionType(subscriptionType);
        return this;
    }

    /**
     * Primary Instrument for a given Marketplace product.
     */
    public MarketplaceProductUpdateBuilder primaryInstrument(String primaryInstrument) {
        marketplaceProductUpdate.setPrimaryInstrument(primaryInstrument);
        return this;
    }

    /**
     * The status and reason for the status of the entity.
     */
    public MarketplaceProductUpdateBuilder status(StatusReasonResource status) {
        marketplaceProductUpdate.setStatus(status);
        return this;
    }

    /**
     * The status of the entity.
     */
    public MarketplaceProductUpdateBuilder chargesStatus(ActionStatusResource chargesStatus) {
        marketplaceProductUpdate.setChargesStatus(chargesStatus);
        return this;
    }

    /**
     * The status of the entity.
     */
    public MarketplaceProductUpdateBuilder refundStatus(ActionStatusResource refundStatus) {
        marketplaceProductUpdate.setRefundStatus(refundStatus);
        return this;
    }

    /**
     * The token to use when making payments.
     */
    public MarketplaceProductUpdateBuilder tokenForProcessing(String tokenForProcessing) {
        marketplaceProductUpdate.setTokenForProcessing(tokenForProcessing);
        return this;
    }

    /**
     * The platform to initiate payments on.
     */
    public MarketplaceProductUpdateBuilder paymentPlatform(PaymentPlatformEnum paymentPlatform) {
        marketplaceProductUpdate.setPaymentPlatform(paymentPlatform);
        return this;
    }

    public MarketplaceProductUpdateBuilder payoutInstruments(List<MarketplaceProductPayoutInstrumentUpdate> payoutInstruments) {
        marketplaceProductUpdate.setPayoutInstruments(payoutInstruments);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MarketplaceProductUpdate build() {
        return marketplaceProductUpdate;
    }
}