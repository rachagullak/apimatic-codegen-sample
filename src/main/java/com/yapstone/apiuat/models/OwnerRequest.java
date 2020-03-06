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
public class OwnerRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -5917113955048774212L;
    private String first;
    private String last;
    private AddressResource address;
    /** GETTER
     * The persons first name.
     */
    @JsonGetter("first")
    public String getFirst ( ) { 
        return this.first;
    }
    
    /** SETTER
     * The persons first name.
     */
    @JsonSetter("first")
    public void setFirst (String value) { 
        this.first = value;
    }
 
    /** GETTER
     * The persons last name.
     */
    @JsonGetter("last")
    public String getLast ( ) { 
        return this.last;
    }
    
    /** SETTER
     * The persons last name.
     */
    @JsonSetter("last")
    public void setLast (String value) { 
        this.last = value;
    }
 
    /** GETTER
     * The address of the application, asset, bank, etc.
     */
    @JsonGetter("address")
    public AddressResource getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * The address of the application, asset, bank, etc.
     */
    @JsonSetter("address")
    public void setAddress (AddressResource value) { 
        this.address = value;
    }
 
}
