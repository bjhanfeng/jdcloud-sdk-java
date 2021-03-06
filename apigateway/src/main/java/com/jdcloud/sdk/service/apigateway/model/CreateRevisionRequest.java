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
 * 修订版本
 * 提供修订版本的创建、查询、删除、修改、查重功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建修订版本
 */
public class CreateRevisionRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 修订版本号，如果创建版本时传回修订版本，此为必填项
     */
    private String revision;

    /**
     * 基于此版本，如果创建版本时传回修订版本，此为必填项
     */
    private String baseRevision;

    /**
     * 修订备注
     */
    private String revisionNote;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 分组ID
     * Required:true
     */
    @Required
    private String apiGroupId;


    /**
     * get 修订版本号，如果创建版本时传回修订版本，此为必填项
     *
     * @return
     */
    public String getRevision() {
        return revision;
    }

    /**
     * set 修订版本号，如果创建版本时传回修订版本，此为必填项
     *
     * @param revision
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * get 基于此版本，如果创建版本时传回修订版本，此为必填项
     *
     * @return
     */
    public String getBaseRevision() {
        return baseRevision;
    }

    /**
     * set 基于此版本，如果创建版本时传回修订版本，此为必填项
     *
     * @param baseRevision
     */
    public void setBaseRevision(String baseRevision) {
        this.baseRevision = baseRevision;
    }

    /**
     * get 修订备注
     *
     * @return
     */
    public String getRevisionNote() {
        return revisionNote;
    }

    /**
     * set 修订备注
     *
     * @param revisionNote
     */
    public void setRevisionNote(String revisionNote) {
        this.revisionNote = revisionNote;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 分组ID
     *
     * @return
     */
    public String getApiGroupId() {
        return apiGroupId;
    }

    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public void setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
    }


    /**
     * set 修订版本号，如果创建版本时传回修订版本，此为必填项
     *
     * @param revision
     */
    public CreateRevisionRequest revision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
     * set 基于此版本，如果创建版本时传回修订版本，此为必填项
     *
     * @param baseRevision
     */
    public CreateRevisionRequest baseRevision(String baseRevision) {
        this.baseRevision = baseRevision;
        return this;
    }

    /**
     * set 修订备注
     *
     * @param revisionNote
     */
    public CreateRevisionRequest revisionNote(String revisionNote) {
        this.revisionNote = revisionNote;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateRevisionRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public CreateRevisionRequest apiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }


}