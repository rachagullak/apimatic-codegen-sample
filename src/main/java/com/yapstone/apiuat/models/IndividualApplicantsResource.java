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
public class IndividualApplicantsResource 
        implements java.io.Serializable {
    private static final long serialVersionUID = -3059121716884368991L;
    private Pagination meta;
    private List<IndividualApplicantResource> results;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("meta")
    public Pagination getMeta ( ) { 
        return this.meta;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("meta")
    public void setMeta (Pagination value) { 
        this.meta = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("results")
    public List<IndividualApplicantResource> getResults ( ) { 
        return this.results;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("results")
    public void setResults (List<IndividualApplicantResource> value) { 
        this.results = value;
    }
 
}
