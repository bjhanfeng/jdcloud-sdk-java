/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Resource
 * Interface of Resource
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdro.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询支持的资源列表
 */
public class DescribeResourceTypeListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前所在页，默认为1
     */
    private Long pageNumber;

    /**
     * 页面大小，默认为20；取值范围[1, 100]
     */
    private Long pageSize;

    /**
     * 产品线类型，比如 VM
     */
    private String product;

    /**
     * 搜索的内容
     */
    private String search;

    /**
     * 地域 ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 当前所在页，默认为1
     *
     * @return
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前所在页，默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 页面大小，默认为20；取值范围[1, 100]
     *
     * @return
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * set 页面大小，默认为20；取值范围[1, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 产品线类型，比如 VM
     *
     * @return
     */
    public String getProduct() {
        return product;
    }

    /**
     * set 产品线类型，比如 VM
     *
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * get 搜索的内容
     *
     * @return
     */
    public String getSearch() {
        return search;
    }

    /**
     * set 搜索的内容
     *
     * @param search
     */
    public void setSearch(String search) {
        this.search = search;
    }

    /**
     * get 地域 ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 当前所在页，默认为1
     *
     * @param pageNumber
     */
    public DescribeResourceTypeListRequest pageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 页面大小，默认为20；取值范围[1, 100]
     *
     * @param pageSize
     */
    public DescribeResourceTypeListRequest pageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 产品线类型，比如 VM
     *
     * @param product
     */
    public DescribeResourceTypeListRequest product(String product) {
        this.product = product;
        return this;
    }

    /**
     * set 搜索的内容
     *
     * @param search
     */
    public DescribeResourceTypeListRequest search(String search) {
        this.search = search;
        return this;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public DescribeResourceTypeListRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}