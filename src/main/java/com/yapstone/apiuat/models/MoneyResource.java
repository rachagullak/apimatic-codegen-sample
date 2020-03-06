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
public class MoneyResource 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4668702660640727345L;
    private String currencyCode;
    private long value;
    /** GETTER
     * The ISO currency code for the moneyResource.
     */
    @JsonGetter("currencyCode")
    public String getCurrencyCode ( ) { 
        return this.currencyCode;
    }
    
    /** SETTER
     * The ISO currency code for the moneyResource.
     */
    @JsonSetter("currencyCode")
    public void setCurrencyCode (String value) { 
        this.currencyCode = value;
    }
 
    /** GETTER
     * The amount of the in cents.
     */
    @JsonGetter("value")
    public long getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * The amount of the in cents.
     */
    @JsonSetter("value")
    public void setValue (long value) { 
        this.value = value;
    }
 
}
