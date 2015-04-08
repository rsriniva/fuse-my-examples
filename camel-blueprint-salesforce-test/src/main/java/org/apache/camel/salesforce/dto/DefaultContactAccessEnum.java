/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist DefaultContactAccess
 */
public enum DefaultContactAccessEnum {

    // None
    NONE("None"),
    // Read
    READ("Read"),
    // Edit
    EDIT("Edit"),
    // ControlledByParent
    CONTROLLEDBYPARENT("ControlledByParent");

    final String value;

    private DefaultContactAccessEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DefaultContactAccessEnum fromValue(String value) {
        for (DefaultContactAccessEnum e : DefaultContactAccessEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}