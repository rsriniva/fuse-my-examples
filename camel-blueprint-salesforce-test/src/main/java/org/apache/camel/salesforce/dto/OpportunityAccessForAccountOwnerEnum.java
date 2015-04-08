/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OpportunityAccessForAccountOwner
 */
public enum OpportunityAccessForAccountOwnerEnum {

    // None
    NONE("None"),
    // Read
    READ("Read"),
    // Edit
    EDIT("Edit");

    final String value;

    private OpportunityAccessForAccountOwnerEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OpportunityAccessForAccountOwnerEnum fromValue(String value) {
        for (OpportunityAccessForAccountOwnerEnum e : OpportunityAccessForAccountOwnerEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}