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
public class InstrumentOperationalStatus 
        implements java.io.Serializable {
    private static final long serialVersionUID = -1666229394682192552L;
    private ActionStatusResource payoutStatus;
    private ActionStatusResource debitStatus;
    /** GETTER
     * The status of the entity.
     */
    @JsonGetter("payoutStatus")
    public ActionStatusResource getPayoutStatus ( ) { 
        return this.payoutStatus;
    }
    
    /** SETTER
     * The status of the entity.
     */
    @JsonSetter("payoutStatus")
    public void setPayoutStatus (ActionStatusResource value) { 
        this.payoutStatus = value;
    }
 
    /** GETTER
     * The status of the entity.
     */
    @JsonGetter("debitStatus")
    public ActionStatusResource getDebitStatus ( ) { 
        return this.debitStatus;
    }
    
    /** SETTER
     * The status of the entity.
     */
    @JsonSetter("debitStatus")
    public void setDebitStatus (ActionStatusResource value) { 
        this.debitStatus = value;
    }
 
}
