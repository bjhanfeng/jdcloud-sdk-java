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
 * JDCLOUD IAS Services API
 * 京东云联合登陆Api
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ias.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取应用
 */
public class GetAppRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域编码，参考OpenAPI公共说明
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 应用ID，应用创建时由京东云分配的16位数字ID
     * Required:true
     */
    @Required
    private String clientId;


    /**
     * get 地域编码，参考OpenAPI公共说明
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域编码，参考OpenAPI公共说明
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 应用ID，应用创建时由京东云分配的16位数字ID
     *
     * @return
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * set 应用ID，应用创建时由京东云分配的16位数字ID
     *
     * @param clientId
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }


    /**
     * set 地域编码，参考OpenAPI公共说明
     *
     * @param regionId
     */
    public GetAppRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 应用ID，应用创建时由京东云分配的16位数字ID
     *
     * @param clientId
     */
    public GetAppRequest clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }


}