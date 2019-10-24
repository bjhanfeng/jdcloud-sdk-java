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

package com.jdcloud.sdk.service.edcps.model;


/**
 * resourceStock
 */
public class ResourceStock  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例类型, 如 edcps.c.normal1
     */
    private String deviceType;

    /**
     * 区域代码, 如 cn-east-tz1
     */
    private String region;

    /**
     * 可用库存
     */
    private Integer available;


    /**
     * get 实例类型, 如 edcps.c.normal1
     *
     * @return
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * set 实例类型, 如 edcps.c.normal1
     *
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * get 区域代码, 如 cn-east-tz1
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 区域代码, 如 cn-east-tz1
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 可用库存
     *
     * @return
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * set 可用库存
     *
     * @param available
     */
    public void setAvailable(Integer available) {
        this.available = available;
    }


    /**
     * set 实例类型, 如 edcps.c.normal1
     *
     * @param deviceType
     */
    public ResourceStock deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * set 区域代码, 如 cn-east-tz1
     *
     * @param region
     */
    public ResourceStock region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 可用库存
     *
     * @param available
     */
    public ResourceStock available(Integer available) {
        this.available = available;
        return this;
    }


}