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
public class CustomerEntityProductcustomerStatusResource 
        implements java.io.Serializable {
    private static final long serialVersionUID = 47917437896611914L;
    private CustomerStatusResource payout;
    /** GETTER
     * The status of the Customer.
     */
    @JsonGetter("payout")
    public CustomerStatusResource getPayout ( ) { 
        return this.payout;
    }
    
    /** SETTER
     * The status of the Customer.
     */
    @JsonSetter("payout")
    public void setPayout (CustomerStatusResource value) { 
        this.payout = value;
    }
 
}
