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
public class ProCategoryResource 
        implements java.io.Serializable {
    private static final long serialVersionUID = -3196311152886453596L;
    private int code;
    private String description;
    /** GETTER
     * merchant category code of applicant.
     */
    @JsonGetter("code")
    public int getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * merchant category code of applicant.
     */
    @JsonSetter("code")
    public void setCode (int value) { 
        this.code = value;
    }
 
    /** GETTER
     * merchant category code description of applicant.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * merchant category code description of applicant.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
}
