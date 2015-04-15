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
 * Salesforce DTO for SObject ExternalDataSource
 */
@XStreamAlias("ExternalDataSource")
public class ExternalDataSource extends AbstractSObjectBase {

    // DeveloperName
    private String DeveloperName;

    @JsonProperty("DeveloperName")
    public String getDeveloperName() {
        return this.DeveloperName;
    }

    @JsonProperty("DeveloperName")
    public void setDeveloperName(String DeveloperName) {
        this.DeveloperName = DeveloperName;
    }

    // Language
    @XStreamConverter(PicklistEnumConverter.class)
    private LanguageEnum Language;

    @JsonProperty("Language")
    public LanguageEnum getLanguage() {
        return this.Language;
    }

    @JsonProperty("Language")
    public void setLanguage(LanguageEnum Language) {
        this.Language = Language;
    }

    // MasterLabel
    private String MasterLabel;

    @JsonProperty("MasterLabel")
    public String getMasterLabel() {
        return this.MasterLabel;
    }

    @JsonProperty("MasterLabel")
    public void setMasterLabel(String MasterLabel) {
        this.MasterLabel = MasterLabel;
    }

    // NamespacePrefix
    private String NamespacePrefix;

    @JsonProperty("NamespacePrefix")
    public String getNamespacePrefix() {
        return this.NamespacePrefix;
    }

    @JsonProperty("NamespacePrefix")
    public void setNamespacePrefix(String NamespacePrefix) {
        this.NamespacePrefix = NamespacePrefix;
    }

    // Type
    @XStreamConverter(PicklistEnumConverter.class)
    private TypeEnum Type;

    @JsonProperty("Type")
    public TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(TypeEnum Type) {
        this.Type = Type;
    }

    // Endpoint
    private String Endpoint;

    @JsonProperty("Endpoint")
    public String getEndpoint() {
        return this.Endpoint;
    }

    @JsonProperty("Endpoint")
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    // Repository
    private String Repository;

    @JsonProperty("Repository")
    public String getRepository() {
        return this.Repository;
    }

    @JsonProperty("Repository")
    public void setRepository(String Repository) {
        this.Repository = Repository;
    }

    // PrincipalType
    @XStreamConverter(PicklistEnumConverter.class)
    private PrincipalTypeEnum PrincipalType;

    @JsonProperty("PrincipalType")
    public PrincipalTypeEnum getPrincipalType() {
        return this.PrincipalType;
    }

    @JsonProperty("PrincipalType")
    public void setPrincipalType(PrincipalTypeEnum PrincipalType) {
        this.PrincipalType = PrincipalType;
    }

    // ApiKey
    private String ApiKey;

    @JsonProperty("ApiKey")
    public String getApiKey() {
        return this.ApiKey;
    }

    @JsonProperty("ApiKey")
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    // LargeIconId
    private String LargeIconId;

    @JsonProperty("LargeIconId")
    public String getLargeIconId() {
        return this.LargeIconId;
    }

    @JsonProperty("LargeIconId")
    public void setLargeIconId(String LargeIconId) {
        this.LargeIconId = LargeIconId;
    }

    // SmallIconId
    private String SmallIconId;

    @JsonProperty("SmallIconId")
    public String getSmallIconId() {
        return this.SmallIconId;
    }

    @JsonProperty("SmallIconId")
    public void setSmallIconId(String SmallIconId) {
        this.SmallIconId = SmallIconId;
    }

}