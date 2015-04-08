/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist NotifyForOperations
 */
public enum NotifyForOperationsEnum {

    // Create
    CREATE("Create"),
    // Update
    UPDATE("Update"),
    // All
    ALL("All"),
    // Extended
    EXTENDED("Extended");

    final String value;

    private NotifyForOperationsEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static NotifyForOperationsEnum fromValue(String value) {
        for (NotifyForOperationsEnum e : NotifyForOperationsEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}