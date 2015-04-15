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
 * Salesforce DTO for SObject ProcessInstanceHistory
 */
@XStreamAlias("ProcessInstanceHistory")
public class ProcessInstanceHistory extends AbstractSObjectBase {

    // IsPending
    private Boolean IsPending;

    @JsonProperty("IsPending")
    public Boolean getIsPending() {
        return this.IsPending;
    }

    @JsonProperty("IsPending")
    public void setIsPending(Boolean IsPending) {
        this.IsPending = IsPending;
    }

    // ProcessInstanceId
    private String ProcessInstanceId;

    @JsonProperty("ProcessInstanceId")
    public String getProcessInstanceId() {
        return this.ProcessInstanceId;
    }

    @JsonProperty("ProcessInstanceId")
    public void setProcessInstanceId(String ProcessInstanceId) {
        this.ProcessInstanceId = ProcessInstanceId;
    }

    // TargetObjectId
    private String TargetObjectId;

    @JsonProperty("TargetObjectId")
    public String getTargetObjectId() {
        return this.TargetObjectId;
    }

    @JsonProperty("TargetObjectId")
    public void setTargetObjectId(String TargetObjectId) {
        this.TargetObjectId = TargetObjectId;
    }

    // StepStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private StepStatusEnum StepStatus;

    @JsonProperty("StepStatus")
    public StepStatusEnum getStepStatus() {
        return this.StepStatus;
    }

    @JsonProperty("StepStatus")
    public void setStepStatus(StepStatusEnum StepStatus) {
        this.StepStatus = StepStatus;
    }

    // OriginalActorId
    private String OriginalActorId;

    @JsonProperty("OriginalActorId")
    public String getOriginalActorId() {
        return this.OriginalActorId;
    }

    @JsonProperty("OriginalActorId")
    public void setOriginalActorId(String OriginalActorId) {
        this.OriginalActorId = OriginalActorId;
    }

    // ActorId
    private String ActorId;

    @JsonProperty("ActorId")
    public String getActorId() {
        return this.ActorId;
    }

    @JsonProperty("ActorId")
    public void setActorId(String ActorId) {
        this.ActorId = ActorId;
    }

    // RemindersSent
    private Integer RemindersSent;

    @JsonProperty("RemindersSent")
    public Integer getRemindersSent() {
        return this.RemindersSent;
    }

    @JsonProperty("RemindersSent")
    public void setRemindersSent(Integer RemindersSent) {
        this.RemindersSent = RemindersSent;
    }

    // Comments
    private String Comments;

    @JsonProperty("Comments")
    public String getComments() {
        return this.Comments;
    }

    @JsonProperty("Comments")
    public void setComments(String Comments) {
        this.Comments = Comments;
    }

}