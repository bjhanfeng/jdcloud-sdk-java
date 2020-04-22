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
 * 实例管理
 * API related to MONGODB instances
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mongodb.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.mongodb.model.ShardingDBInstanceSpec;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建分片集群
 */
public class CreateShardingInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例规格
     * Required:true
     */
    @Required
    private ShardingDBInstanceSpec shardingInstanceSpec;

    /**
     * 付费方式
     */
    private ChargeSpec chargeSpec;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 实例规格
     *
     * @return
     */
    public ShardingDBInstanceSpec getShardingInstanceSpec() {
        return shardingInstanceSpec;
    }

    /**
     * set 实例规格
     *
     * @param shardingInstanceSpec
     */
    public void setShardingInstanceSpec(ShardingDBInstanceSpec shardingInstanceSpec) {
        this.shardingInstanceSpec = shardingInstanceSpec;
    }

    /**
     * get 付费方式
     *
     * @return
     */
    public ChargeSpec getChargeSpec() {
        return chargeSpec;
    }

    /**
     * set 付费方式
     *
     * @param chargeSpec
     */
    public void setChargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 实例规格
     *
     * @param shardingInstanceSpec
     */
    public CreateShardingInstanceRequest shardingInstanceSpec(ShardingDBInstanceSpec shardingInstanceSpec) {
        this.shardingInstanceSpec = shardingInstanceSpec;
        return this;
    }

    /**
     * set 付费方式
     *
     * @param chargeSpec
     */
    public CreateShardingInstanceRequest chargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreateShardingInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}