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
public class AssetUpdateRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4610821592027946005L;
    private IndividualOwnerResource owner;
    private String type = "PROPERTY";
    private String externalId;
    private String primaryInstrument;
    private PropertyResource property;
    private List<String> managedBy;
    private EntityProductStatusResource status;
    private AssetOperationalStatus operationalStatus;
    private List<ProductEnum> products;
    /** GETTER
     * The name of the owner of the asset. It will consist of first and last name.
     */
    @JsonGetter("owner")
    public IndividualOwnerResource getOwner ( ) { 
        return this.owner;
    }
    
    /** SETTER
     * The name of the owner of the asset. It will consist of first and last name.
     */
    @JsonSetter("owner")
    public void setOwner (IndividualOwnerResource value) { 
        this.owner = value;
    }
 
    /** GETTER
     * The type of asset [PROPERTY]
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The type of asset [PROPERTY]
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * The partners externalId id for the Asset.
     */
    @JsonGetter("externalId")
    public String getExternalId ( ) { 
        return this.externalId;
    }
    
    /** SETTER
     * The partners externalId id for the Asset.
     */
    @JsonSetter("externalId")
    public void setExternalId (String value) { 
        this.externalId = value;
    }
 
    /** GETTER
     * The primary instrument id for the Asset. By default, all the asset level offerings will be linked to this instrument.
     */
    @JsonGetter("primaryInstrument")
    public String getPrimaryInstrument ( ) { 
        return this.primaryInstrument;
    }
    
    /** SETTER
     * The primary instrument id for the Asset. By default, all the asset level offerings will be linked to this instrument.
     */
    @JsonSetter("primaryInstrument")
    public void setPrimaryInstrument (String value) { 
        this.primaryInstrument = value;
    }
 
    /** GETTER
     * contains data about the property.
     */
    @JsonGetter("property")
    public PropertyResource getProperty ( ) { 
        return this.property;
    }
    
    /** SETTER
     * contains data about the property.
     */
    @JsonSetter("property")
    public void setProperty (PropertyResource value) { 
        this.property = value;
    }
 
    /** GETTER
     * The merchant id
     */
    @JsonGetter("managedBy")
    public List<String> getManagedBy ( ) { 
        return this.managedBy;
    }
    
    /** SETTER
     * The merchant id
     */
    @JsonSetter("managedBy")
    public void setManagedBy (List<String> value) { 
        this.managedBy = value;
    }
 
    /** GETTER
     * The status of the entity.
     */
    @JsonGetter("status")
    public EntityProductStatusResource getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The status of the entity.
     */
    @JsonSetter("status")
    public void setStatus (EntityProductStatusResource value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("operationalStatus")
    public AssetOperationalStatus getOperationalStatus ( ) { 
        return this.operationalStatus;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("operationalStatus")
    public void setOperationalStatus (AssetOperationalStatus value) { 
        this.operationalStatus = value;
    }
 
    /** GETTER
     * Products requested by marketplace.
     */
    @JsonGetter("products")
    public List<ProductEnum> getProducts ( ) { 
        return this.products;
    }
    
    /** SETTER
     * Products requested by marketplace.
     */
    @JsonSetter("products")
    public void setProducts (List<ProductEnum> value) { 
        this.products = value;
    }
 
}
