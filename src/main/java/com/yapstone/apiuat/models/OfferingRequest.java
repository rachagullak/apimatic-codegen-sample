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
public class OfferingRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 91277965023457762L;
    private OfferingResource items;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("items")
    public OfferingResource getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("items")
    public void setItems (OfferingResource value) { 
        this.items = value;
    }
 
}
