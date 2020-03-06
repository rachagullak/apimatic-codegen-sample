/*
 * YapstoneStagedOnBoardingServicesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.yapstone.apiuat.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum GenderEnum {
    M, //TODO: Write general description for this element
    F, //TODO: Write general description for this element
    O; //TODO: Write general description for this element

    private static TreeMap<String, GenderEnum> valueMap = new TreeMap<String, GenderEnum>();
    private String value;

    static {
        M.value = "M";
        F.value = "F";
        O.value = "O";

        valueMap.put("M", M);
        valueMap.put("F", F);
        valueMap.put("O", O);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static GenderEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of GenderEnum values to list of string values
     * @param toConvert The list of GenderEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<GenderEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (GenderEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 