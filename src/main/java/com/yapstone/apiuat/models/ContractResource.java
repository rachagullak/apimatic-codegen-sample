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
public class ContractResource 
        implements java.io.Serializable {
    private static final long serialVersionUID = 7293528528923689437L;
    private String externalId;
    private String id;
    private String applicantId;
    private Products1 products;
    /** GETTER
     * The partners externalId id for entity.
     */
    @JsonGetter("externalId")
    public String getExternalId ( ) { 
        return this.externalId;
    }
    
    /** SETTER
     * The partners externalId id for entity.
     */
    @JsonSetter("externalId")
    public void setExternalId (String value) { 
        this.externalId = value;
    }
 
    /** GETTER
     * The resource identifier for the Contract.
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The resource identifier for the Contract.
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * The unique id of the Applicant Resource.
     */
    @JsonGetter("applicantId")
    public String getApplicantId ( ) { 
        return this.applicantId;
    }
    
    /** SETTER
     * The unique id of the Applicant Resource.
     */
    @JsonSetter("applicantId")
    public void setApplicantId (String value) { 
        this.applicantId = value;
    }
 
    /** GETTER
     * Product catalog.
     */
    @JsonGetter("products")
    public Products1 getProducts ( ) { 
        return this.products;
    }
    
    /** SETTER
     * Product catalog.
     */
    @JsonSetter("products")
    public void setProducts (Products1 value) { 
        this.products = value;
    }
 
}
