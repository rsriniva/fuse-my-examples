/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type EventFeed
 */
public class QueryRecordsEventFeed extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<EventFeed> records;

    public List<EventFeed> getRecords() {
        return records;
    }

    public void setRecords(List<EventFeed> records) {
        this.records = records;
    }
}