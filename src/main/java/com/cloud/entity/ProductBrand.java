package com.cloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(description = "品牌表")
public class ProductBrand implements Serializable {

    private static final long serialVersionUID = 946425820835773235L;

    @ApiModelProperty(value = "主键")
    private String uuid;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "图标")
    private String ico;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "是否删除 是否删除 是否删除 是否删除 1、是 2、否")
    private Integer isDelete;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

    @ApiModelProperty(value = "添加时间")
    private Date createTime;

    private Integer pageSize;

    private Integer pageNum;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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