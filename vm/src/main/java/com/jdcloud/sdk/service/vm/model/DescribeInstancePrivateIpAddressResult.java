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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vm.model.InstancePrivateIpAddress;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 批量查询云主机内网IP地址，查询的是主网卡内网主IP地址。
 */
public class DescribeInstancePrivateIpAddressResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * instancePrivateIpAddress
     */
    private List<InstancePrivateIpAddress> instancePrivateIpAddress;

    /**
     * totalCount
     */
    private Number totalCount;


    /**
     * get instancePrivateIpAddress
     *
     * @return
     */
    public List<InstancePrivateIpAddress> getInstancePrivateIpAddress() {
        return instancePrivateIpAddress;
    }

    /**
     * set instancePrivateIpAddress
     *
     * @param instancePrivateIpAddress
     */
    public void setInstancePrivateIpAddress(List<InstancePrivateIpAddress> instancePrivateIpAddress) {
        this.instancePrivateIpAddress = instancePrivateIpAddress;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set instancePrivateIpAddress
     *
     * @param instancePrivateIpAddress
     */
    public DescribeInstancePrivateIpAddressResult instancePrivateIpAddress(List<InstancePrivateIpAddress> instancePrivateIpAddress) {
        this.instancePrivateIpAddress = instancePrivateIpAddress;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeInstancePrivateIpAddressResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to instancePrivateIpAddress
     *
     * @param instancePrivateIpAddres
     */
    public void addInstancePrivateIpAddres(InstancePrivateIpAddress instancePrivateIpAddres) {
        if (this.instancePrivateIpAddress == null) {
            this.instancePrivateIpAddress = new ArrayList<>();
        }
        this.instancePrivateIpAddress.add(instancePrivateIpAddres);
    }

}