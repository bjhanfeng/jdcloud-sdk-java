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
 * DeployApp
 * DeployApp 部署详情
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotedge.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询APP部署列表
 */
public class DescribeDeployDetailsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Edge名称
     * Required:true
     */
    @Required
    private String appName;

    /**
     * 当前的规则位置
     */
    private Integer nowPage;

    /**
     * 显示多少个数据
     */
    private Integer pageSize;

    /**
     * 排序方式
     */
    private Integer order;

    /**
     * 排序依据的关键词
     */
    private Integer property;

    /**
     * 模糊搜索关键字
     */
    private String searchText;

    /**
     * 设备归属的实例ID
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 设备归属的实例所在区域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 硬件版本
     * Required:true
     */
    @Required
    private String hardwareId;

    /**
     * OSID
     * Required:true
     */
    @Required
    private String osId;


    /**
     * get Edge名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set Edge名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 当前的规则位置
     *
     * @return
     */
    public Integer getNowPage() {
        return nowPage;
    }

    /**
     * set 当前的规则位置
     *
     * @param nowPage
     */
    public void setNowPage(Integer nowPage) {
        this.nowPage = nowPage;
    }

    /**
     * get 显示多少个数据
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 显示多少个数据
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 排序方式
     *
     * @return
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * set 排序方式
     *
     * @param order
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * get 排序依据的关键词
     *
     * @return
     */
    public Integer getProperty() {
        return property;
    }

    /**
     * set 排序依据的关键词
     *
     * @param property
     */
    public void setProperty(Integer property) {
        this.property = property;
    }

    /**
     * get 模糊搜索关键字
     *
     * @return
     */
    public String getSearchText() {
        return searchText;
    }

    /**
     * set 模糊搜索关键字
     *
     * @param searchText
     */
    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    /**
     * get 设备归属的实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 设备归属的实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 设备归属的实例所在区域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 设备归属的实例所在区域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 硬件版本
     *
     * @return
     */
    public String getHardwareId() {
        return hardwareId;
    }

    /**
     * set 硬件版本
     *
     * @param hardwareId
     */
    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }

    /**
     * get OSID
     *
     * @return
     */
    public String getOsId() {
        return osId;
    }

    /**
     * set OSID
     *
     * @param osId
     */
    public void setOsId(String osId) {
        this.osId = osId;
    }


    /**
     * set Edge名称
     *
     * @param appName
     */
    public DescribeDeployDetailsRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 当前的规则位置
     *
     * @param nowPage
     */
    public DescribeDeployDetailsRequest nowPage(Integer nowPage) {
        this.nowPage = nowPage;
        return this;
    }

    /**
     * set 显示多少个数据
     *
     * @param pageSize
     */
    public DescribeDeployDetailsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 排序方式
     *
     * @param order
     */
    public DescribeDeployDetailsRequest order(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * set 排序依据的关键词
     *
     * @param property
     */
    public DescribeDeployDetailsRequest property(Integer property) {
        this.property = property;
        return this;
    }

    /**
     * set 模糊搜索关键字
     *
     * @param searchText
     */
    public DescribeDeployDetailsRequest searchText(String searchText) {
        this.searchText = searchText;
        return this;
    }

    /**
     * set 设备归属的实例ID
     *
     * @param instanceId
     */
    public DescribeDeployDetailsRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 设备归属的实例所在区域
     *
     * @param regionId
     */
    public DescribeDeployDetailsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 硬件版本
     *
     * @param hardwareId
     */
    public DescribeDeployDetailsRequest hardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
        return this;
    }

    /**
     * set OSID
     *
     * @param osId
     */
    public DescribeDeployDetailsRequest osId(String osId) {
        this.osId = osId;
        return this;
    }


}