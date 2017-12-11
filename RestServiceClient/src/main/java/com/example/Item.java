
package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "alphaCode",
    "title",
    "description",
    "type",
    "itemConfig",
    "fields",
    "parentAlphaCode"
})
public class Item {

    @JsonProperty("id")
    private String id;
    @JsonProperty("alphaCode")
    private String alphaCode;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("type")
    private String type;
    @JsonProperty("itemConfig")
    private ItemConfig itemConfig;
    @JsonProperty("fields")
    private List<Field> fields = null;
    @JsonProperty("parentAlphaCode")
    private String parentAlphaCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("alphaCode")
    public String getAlphaCode() {
        return alphaCode;
    }

    @JsonProperty("alphaCode")
    public void setAlphaCode(String alphaCode) {
        this.alphaCode = alphaCode;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("itemConfig")
    public ItemConfig getItemConfig() {
        return itemConfig;
    }

    @JsonProperty("itemConfig")
    public void setItemConfig(ItemConfig itemConfig) {
        this.itemConfig = itemConfig;
    }

    @JsonProperty("fields")
    public List<Field> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    @JsonProperty("parentAlphaCode")
    public String getParentAlphaCode() {
        return parentAlphaCode;
    }

    @JsonProperty("parentAlphaCode")
    public void setParentAlphaCode(String parentAlphaCode) {
        this.parentAlphaCode = parentAlphaCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
