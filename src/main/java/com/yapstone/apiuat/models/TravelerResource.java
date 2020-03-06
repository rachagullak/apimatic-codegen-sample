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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.yapstone.apiuat.DateTimeHelper;
import org.joda.time.LocalDate;

@JsonInclude(Include.ALWAYS)
public class TravelerResource 
        implements java.io.Serializable {
    private static final long serialVersionUID = -1819115751546403458L;
    private LocalDate startedOn;
    private Integer inquiryCount;
    private Integer chargeCount;
    private Integer ratingCount;
    /** GETTER
     * The date the customer started as a traveler.
     */
    @JsonGetter("startedOn")
    @JsonSerialize(using=DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getStartedOn ( ) { 
        return this.startedOn;
    }
    
    /** SETTER
     * The date the customer started as a traveler.
     */
    @JsonSetter("startedOn")
    @JsonDeserialize(using=DateTimeHelper.SimpleDateDeserializer.class)
    public void setStartedOn (LocalDate value) { 
        this.startedOn = value;
    }
 
    /** GETTER
     * The number of inquries.
     */
    @JsonGetter("inquiryCount")
    public Integer getInquiryCount ( ) { 
        return this.inquiryCount;
    }
    
    /** SETTER
     * The number of inquries.
     */
    @JsonSetter("inquiryCount")
    public void setInquiryCount (Integer value) { 
        this.inquiryCount = value;
    }
 
    /** GETTER
     * The number of charges.
     */
    @JsonGetter("chargeCount")
    public Integer getChargeCount ( ) { 
        return this.chargeCount;
    }
    
    /** SETTER
     * The number of charges.
     */
    @JsonSetter("chargeCount")
    public void setChargeCount (Integer value) { 
        this.chargeCount = value;
    }
 
    /** GETTER
     * The number of ratings.
     */
    @JsonGetter("ratingCount")
    public Integer getRatingCount ( ) { 
        return this.ratingCount;
    }
    
    /** SETTER
     * The number of ratings.
     */
    @JsonSetter("ratingCount")
    public void setRatingCount (Integer value) { 
        this.ratingCount = value;
    }
 
}
