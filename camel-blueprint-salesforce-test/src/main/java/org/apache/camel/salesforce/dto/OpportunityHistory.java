/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject OpportunityHistory
 */
@XStreamAlias("OpportunityHistory")
public class OpportunityHistory extends AbstractSObjectBase {

    // OpportunityId
    private String OpportunityId;

    @JsonProperty("OpportunityId")
    public String getOpportunityId() {
        return this.OpportunityId;
    }

    @JsonProperty("OpportunityId")
    public void setOpportunityId(String OpportunityId) {
        this.OpportunityId = OpportunityId;
    }

    // StageName
    @XStreamConverter(PicklistEnumConverter.class)
    private StageNameEnum StageName;

    @JsonProperty("StageName")
    public StageNameEnum getStageName() {
        return this.StageName;
    }

    @JsonProperty("StageName")
    public void setStageName(StageNameEnum StageName) {
        this.StageName = StageName;
    }

    // Amount
    private Double Amount;

    @JsonProperty("Amount")
    public Double getAmount() {
        return this.Amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    // ExpectedRevenue
    private Double ExpectedRevenue;

    @JsonProperty("ExpectedRevenue")
    public Double getExpectedRevenue() {
        return this.ExpectedRevenue;
    }

    @JsonProperty("ExpectedRevenue")
    public void setExpectedRevenue(Double ExpectedRevenue) {
        this.ExpectedRevenue = ExpectedRevenue;
    }

    // CloseDate
    private org.joda.time.DateTime CloseDate;

    @JsonProperty("CloseDate")
    public org.joda.time.DateTime getCloseDate() {
        return this.CloseDate;
    }

    @JsonProperty("CloseDate")
    public void setCloseDate(org.joda.time.DateTime CloseDate) {
        this.CloseDate = CloseDate;
    }

    // Probability
    private Double Probability;

    @JsonProperty("Probability")
    public Double getProbability() {
        return this.Probability;
    }

    @JsonProperty("Probability")
    public void setProbability(Double Probability) {
        this.Probability = Probability;
    }

    // ForecastCategory
    @XStreamConverter(PicklistEnumConverter.class)
    private ForecastCategoryEnum ForecastCategory;

    @JsonProperty("ForecastCategory")
    public ForecastCategoryEnum getForecastCategory() {
        return this.ForecastCategory;
    }

    @JsonProperty("ForecastCategory")
    public void setForecastCategory(ForecastCategoryEnum ForecastCategory) {
        this.ForecastCategory = ForecastCategory;
    }

}