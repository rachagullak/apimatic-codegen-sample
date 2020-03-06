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
public class CustomerStatusResource 
        implements java.io.Serializable {
    private static final long serialVersionUID = 7234897443730734789L;
    private VerificationStatus2Enum verificationStatus;
    private List<CustomerActionResource> requiredActions;
    private List<String> reasons;
    /** GETTER
     * The verification status of the Customer.
     */
    @JsonGetter("verificationStatus")
    public VerificationStatus2Enum getVerificationStatus ( ) { 
        return this.verificationStatus;
    }
    
    /** SETTER
     * The verification status of the Customer.
     */
    @JsonSetter("verificationStatus")
    public void setVerificationStatus (VerificationStatus2Enum value) { 
        this.verificationStatus = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("requiredActions")
    public List<CustomerActionResource> getRequiredActions ( ) { 
        return this.requiredActions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("requiredActions")
    public void setRequiredActions (List<CustomerActionResource> value) { 
        this.requiredActions = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("reasons")
    public List<String> getReasons ( ) { 
        return this.reasons;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("reasons")
    public void setReasons (List<String> value) { 
        this.reasons = value;
    }
 
}
