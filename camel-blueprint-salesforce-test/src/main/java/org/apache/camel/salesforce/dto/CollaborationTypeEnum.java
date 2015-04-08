/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CollaborationType
 */
public enum CollaborationTypeEnum {

    // Public
    PUBLIC("Public"),
    // Private
    PRIVATE("Private");

    final String value;

    private CollaborationTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CollaborationTypeEnum fromValue(String value) {
        for (CollaborationTypeEnum e : CollaborationTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}