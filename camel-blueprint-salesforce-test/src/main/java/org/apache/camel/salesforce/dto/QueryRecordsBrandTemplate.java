/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type BrandTemplate
 */
public class QueryRecordsBrandTemplate extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<BrandTemplate> records;

    public List<BrandTemplate> getRecords() {
        return records;
    }

    public void setRecords(List<BrandTemplate> records) {
        this.records = records;
    }
}
