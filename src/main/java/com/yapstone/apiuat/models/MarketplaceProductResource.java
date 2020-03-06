/*
 * YapstoneStagedOnBoardingServicesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.yapstone.apiuat.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class MarketplaceProductResource 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4246156934435883462L;
    private String id;
    private List<ConsentResource> consents;
    private String assetId;
    private PayoutModeEnum payoutMode;
    private String settlementCurrency;
    private String subscriptionType;
    private String primaryInstrument;
    private StatusReasonResource status;
    private ActionStatusResource chargesStatus;
    private ActionStatusResource refundStatus;
    private String tokenForProcessing;
    private PaymentPlatformEnum paymentPlatform;
    private List<MarketplaceProductPayoutInstrumentResource> payoutInstruments;
    /** GETTER
     * The unique id of the resource
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The unique id of the resource
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * An array of consents.
     */
    @JsonGetter("consents")
    public List<ConsentResource> getConsents ( ) { 
        return this.consents;
    }
    
    /** SETTER
     * An array of consents.
     */
    @JsonSetter("consents")
    public void setConsents (List<ConsentResource> value) { 
        this.consents = value;
    }
 
    /** GETTER
     * The unique id of the Asset Resource.
     */
    @JsonGetter("assetId")
    public String getAssetId ( ) { 
        return this.assetId;
    }
    
    /** SETTER
     * The unique id of the Asset Resource.
     */
    @JsonSetter("assetId")
    public void setAssetId (String value) { 
        this.assetId = value;
    }
 
    /** GETTER
     * The type of Payout Mode
     */
    @JsonGetter("payoutMode")
    public PayoutModeEnum getPayoutMode ( ) { 
        return this.payoutMode;
    }
    
    /** SETTER
     * The type of Payout Mode
     */
    @JsonSetter("payoutMode")
    public void setPayoutMode (PayoutModeEnum value) { 
        this.payoutMode = value;
    }
 
    /** GETTER
     * The ISO currency code enum for settlements.
     */
    @JsonGetter("settlementCurrency")
    public String getSettlementCurrency ( ) { 
        return this.settlementCurrency;
    }
    
    /** SETTER
     * The ISO currency code enum for settlements.
     */
    @JsonSetter("settlementCurrency")
    public void setSettlementCurrency (String value) { 
        this.settlementCurrency = value;
    }
 
    /** GETTER
     * Subscription Type
     */
    @JsonGetter("subscriptionType")
    public String getSubscriptionType ( ) { 
        return this.subscriptionType;
    }
    
    /** SETTER
     * Subscription Type
     */
    @JsonSetter("subscriptionType")
    public void setSubscriptionType (String value) { 
        this.subscriptionType = value;
    }
 
    /** GETTER
     * Primary Instrument for a given Marketplace product.
     */
    @JsonGetter("primaryInstrument")
    public String getPrimaryInstrument ( ) { 
        return this.primaryInstrument;
    }
    
    /** SETTER
     * Primary Instrument for a given Marketplace product.
     */
    @JsonSetter("primaryInstrument")
    public void setPrimaryInstrument (String value) { 
        this.primaryInstrument = value;
    }
 
    /** GETTER
     * The status and reason for the status of the entity.
     */
    @JsonGetter("status")
    public StatusReasonResource getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The status and reason for the status of the entity.
     */
    @JsonSetter("status")
    public void setStatus (StatusReasonResource value) { 
        this.status = value;
    }
 
    /** GETTER
     * The status of the entity.
     */
    @JsonGetter("chargesStatus")
    public ActionStatusResource getChargesStatus ( ) { 
        return this.chargesStatus;
    }
    
    /** SETTER
     * The status of the entity.
     */
    @JsonSetter("chargesStatus")
    public void setChargesStatus (ActionStatusResource value) { 
        this.chargesStatus = value;
    }
 
    /** GETTER
     * The status of the entity.
     */
    @JsonGetter("refundStatus")
    public ActionStatusResource getRefundStatus ( ) { 
        return this.refundStatus;
    }
    
    /** SETTER
     * The status of the entity.
     */
    @JsonSetter("refundStatus")
    public void setRefundStatus (ActionStatusResource value) { 
        this.refundStatus = value;
    }
 
    /** GETTER
     * The token to use when making payments.
     */
    @JsonGetter("tokenForProcessing")
    public String getTokenForProcessing ( ) { 
        return this.tokenForProcessing;
    }
    
    /** SETTER
     * The token to use when making payments.
     */
    @JsonSetter("tokenForProcessing")
    public void setTokenForProcessing (String value) { 
        this.tokenForProcessing = value;
    }
 
    /** GETTER
     * The platform to initiate payments on.
     */
    @JsonGetter("paymentPlatform")
    public PaymentPlatformEnum getPaymentPlatform ( ) { 
        return this.paymentPlatform;
    }
    
    /** SETTER
     * The platform to initiate payments on.
     */
    @JsonSetter("paymentPlatform")
    public void setPaymentPlatform (PaymentPlatformEnum value) { 
        this.paymentPlatform = value;
    }
 
    /** GETTER
     * An array of payout instruments.
     */
    @JsonGetter("payoutInstruments")
    public List<MarketplaceProductPayoutInstrumentResource> getPayoutInstruments ( ) { 
        return this.payoutInstruments;
    }
    
    /** SETTER
     * An array of payout instruments.
     */
    @JsonSetter("payoutInstruments")
    public void setPayoutInstruments (List<MarketplaceProductPayoutInstrumentResource> value) { 
        this.payoutInstruments = value;
    }
 
}
