package com.cloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@ApiModel(description = "商品分类表")
public class ProductCategory implements Serializable {
    private static final long serialVersionUID = -70960669553753633L;

    @ApiModelProperty(value = "主键")
    private String uuid;

    @ApiModelProperty(value = "上级id")
    private String categoryId;

    @ApiModelProperty(value = "级别")
    private Integer level;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "分类CODE")
    private String categoryCode;

    @ApiModelProperty(value = "是否删除 1、是 2、否")
    private Integer isDelete;

    @ApiModelProperty(value = "类目属性code")
    private String clasAttribute;

    @ApiModelProperty(value = "销售信息code 多的已逗号隔开")
    private String salesInformation;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

    @ApiModelProperty(value = "添加时间")
    private Date createTime;

    @ApiModelProperty(value = "分类图片")
    private String icon;

    private Integer pageSize;

    private Integer pageNum;

    private List<ProductCategory> childs;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty
    public List<ProductCategory> getChilds() {
        return childs;
    }

    @JsonIgnore
    public void setChilds(List<ProductCategory> childs) {
        this.childs = childs;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getClasAttribute() {
        return clasAttribute;
    }

    public void setClasAttribute(String clasAttribute) {
        this.clasAttribute = clasAttribute;
    }

    public String getSalesInformation() {
        return salesInformation;
    }

    public void setSalesInformation(String salesInformation) {
        this.salesInformation = salesInformation;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @JsonIgnore
    public Integer getPageSize() {
        return pageSize;
    }

    @JsonIgnore
    public Integer getPageNum() {
        return pageNum;
    }

    @JsonProperty
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @JsonProperty
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}