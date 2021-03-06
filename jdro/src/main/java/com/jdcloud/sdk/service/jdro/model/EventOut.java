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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdro.model;


/**
 * eventOut
 */
public class EventOut  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 资源ID
     */
    private String physicalId;

    /**
     * 资源运行操作
     */
    private String resourceAction;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源运行状态
     */
    private String resourceStatus;

    /**
     * 资源运行状态原因
     */
    private String resourceStatusReason;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 资源栈ID
     */
    private String stackId;

    /**
     * 唯一标识
     */
    private String uuid;


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 资源ID
     *
     * @return
     */
    public String getPhysicalId() {
        return physicalId;
    }

    /**
     * set 资源ID
     *
     * @param physicalId
     */
    public void setPhysicalId(String physicalId) {
        this.physicalId = physicalId;
    }

    /**
     * get 资源运行操作
     *
     * @return
     */
    public String getResourceAction() {
        return resourceAction;
    }

    /**
     * set 资源运行操作
     *
     * @param resourceAction
     */
    public void setResourceAction(String resourceAction) {
        this.resourceAction = resourceAction;
    }

    /**
     * get 资源名称
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * get 资源运行状态
     *
     * @return
     */
    public String getResourceStatus() {
        return resourceStatus;
    }

    /**
     * set 资源运行状态
     *
     * @param resourceStatus
     */
    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    /**
     * get 资源运行状态原因
     *
     * @return
     */
    public String getResourceStatusReason() {
        return resourceStatusReason;
    }

    /**
     * set 资源运行状态原因
     *
     * @param resourceStatusReason
     */
    public void setResourceStatusReason(String resourceStatusReason) {
        this.resourceStatusReason = resourceStatusReason;
    }

    /**
     * get 资源类型
     *
     * @return
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * set 资源类型
     *
     * @param resourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * get 资源栈ID
     *
     * @return
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * set 资源栈ID
     *
     * @param stackId
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * get 唯一标识
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set 唯一标识
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public EventOut createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 资源ID
     *
     * @param physicalId
     */
    public EventOut physicalId(String physicalId) {
        this.physicalId = physicalId;
        return this;
    }

    /**
     * set 资源运行操作
     *
     * @param resourceAction
     */
    public EventOut resourceAction(String resourceAction) {
        this.resourceAction = resourceAction;
        return this;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public EventOut resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * set 资源运行状态
     *
     * @param resourceStatus
     */
    public EventOut resourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
        return this;
    }

    /**
     * set 资源运行状态原因
     *
     * @param resourceStatusReason
     */
    public EventOut resourceStatusReason(String resourceStatusReason) {
        this.resourceStatusReason = resourceStatusReason;
        return this;
    }

    /**
     * set 资源类型
     *
     * @param resourceType
     */
    public EventOut resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set 资源栈ID
     *
     * @param stackId
     */
    public EventOut stackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * set 唯一标识
     *
     * @param uuid
     */
    public EventOut uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }


}