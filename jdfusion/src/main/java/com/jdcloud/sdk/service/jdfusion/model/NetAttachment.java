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

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * 网卡配置信息
 */
public class NetAttachment  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指明删除实例时是否删除网卡,默认true；（当前只能是true）
     */
    private Boolean autoDelete;

    /**
     * 设备Index
     */
    private Integer deviceIndex;

    /**
     * networkInterface
     */
    private NetworkInterface networkInterface;


    /**
     * get 指明删除实例时是否删除网卡,默认true；（当前只能是true）
     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 指明删除实例时是否删除网卡,默认true；（当前只能是true）
     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * get 设备Index
     *
     * @return
     */
    public Integer getDeviceIndex() {
        return deviceIndex;
    }

    /**
     * set 设备Index
     *
     * @param deviceIndex
     */
    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }

    /**
     * get networkInterface
     *
     * @return
     */
    public NetworkInterface getNetworkInterface() {
        return networkInterface;
    }

    /**
     * set networkInterface
     *
     * @param networkInterface
     */
    public void setNetworkInterface(NetworkInterface networkInterface) {
        this.networkInterface = networkInterface;
    }


    /**
     * set 指明删除实例时是否删除网卡,默认true；（当前只能是true）
     *
     * @param autoDelete
     */
    public NetAttachment autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * set 设备Index
     *
     * @param deviceIndex
     */
    public NetAttachment deviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * set networkInterface
     *
     * @param networkInterface
     */
    public NetAttachment networkInterface(NetworkInterface networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }


}