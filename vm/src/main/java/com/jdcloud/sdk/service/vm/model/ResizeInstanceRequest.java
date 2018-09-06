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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 云主机变更实例规格&lt;br&gt;
云主机的状态必须为&lt;b&gt;stopped&lt;/b&gt;状态。&lt;br&gt;
16年创建的云硬盘做系统盘的主机，一代与二代实例规格不允许相互调整。&lt;br&gt;
本地盘(local类型)做系统盘的主机，一代与二代实例规格不允许相互调整。&lt;br&gt;
使用高可用组(Ag)创建的主机，一代与二代实例规格不允许相互调整。&lt;br&gt;
云硬盘(cloud类型)做系统盘的主机，一代与二代实例规格允许相互调整。&lt;br&gt;
如果当前主机中的弹性网卡数量，大于新实例规格允许的弹性网卡数量，会返回错误。可查询&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/2901/isCatalog/1&quot;&gt;DescribeInstanceTypes&lt;/a&gt;接口获得指定地域及可用区下的实例规格信息。&lt;br&gt;
当前主机所使用的镜像，需要支持要变更的目标实例规格，否则返回错误。可查询&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/2872/isCatalog/1&quot;&gt;DescribeImageConstraints&lt;/a&gt;接口获得指定镜像的实例规格限制信息。&lt;br&gt;
云主机欠费或到期时，无法更改实例规格。

 */
public class ResizeInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例规格，可查询&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/2901/isCatalog/1&quot;&gt;DescribeInstanceTypes&lt;/a&gt;接口获得指定地域或可用区的规格信息。
     * Required:true
     */
    @Required
    private String instanceType;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云主机ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 实例规格，可查询&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/2901/isCatalog/1&quot;&gt;DescribeInstanceTypes&lt;/a&gt;接口获得指定地域或可用区的规格信息。
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例规格，可查询&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/2901/isCatalog/1&quot;&gt;DescribeInstanceTypes&lt;/a&gt;接口获得指定地域或可用区的规格信息。
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
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
     * get 云主机ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 实例规格，可查询&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/2901/isCatalog/1&quot;&gt;DescribeInstanceTypes&lt;/a&gt;接口获得指定地域或可用区的规格信息。
     *
     * @param instanceType
     */
    public ResizeInstanceRequest instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public ResizeInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public ResizeInstanceRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}