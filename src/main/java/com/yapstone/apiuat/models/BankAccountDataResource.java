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
public class BankAccountDataResource 
        implements java.io.Serializable {
    private static final long serialVersionUID = -7925884122772044988L;
    private String bankAccountDataToken;
    private String routingCode;
    private String accountNumber;
    private String displayText;
    /** GETTER
     * The key to the vault that contains the sensitive bank data.
     */
    @JsonGetter("bankAccountDataToken")
    public String getBankAccountDataToken ( ) { 
        return this.bankAccountDataToken;
    }
    
    /** SETTER
     * The key to the vault that contains the sensitive bank data.
     */
    @JsonSetter("bankAccountDataToken")
    public void setBankAccountDataToken (String value) { 
        this.bankAccountDataToken = value;
    }
 
    /** GETTER
     * routing code for USA, bank/branch identification for rest of the world
     */
    @JsonGetter("routingCode")
    public String getRoutingCode ( ) { 
        return this.routingCode;
    }
    
    /** SETTER
     * routing code for USA, bank/branch identification for rest of the world
     */
    @JsonSetter("routingCode")
    public void setRoutingCode (String value) { 
        this.routingCode = value;
    }
 
    /** GETTER
     * Bank account number. If this is iban, routing code (bank/branch identification code) can be empty
     */
    @JsonGetter("accountNumber")
    public String getAccountNumber ( ) { 
        return this.accountNumber;
    }
    
    /** SETTER
     * Bank account number. If this is iban, routing code (bank/branch identification code) can be empty
     */
    @JsonSetter("accountNumber")
    public void setAccountNumber (String value) { 
        this.accountNumber = value;
    }
 
    /** GETTER
     * The textual description of the account.
     */
    @JsonGetter("displayText")
    public String getDisplayText ( ) { 
        return this.displayText;
    }
    
    /** SETTER
     * The textual description of the account.
     */
    @JsonSetter("displayText")
    public void setDisplayText (String value) { 
        this.displayText = value;
    }
 
}
