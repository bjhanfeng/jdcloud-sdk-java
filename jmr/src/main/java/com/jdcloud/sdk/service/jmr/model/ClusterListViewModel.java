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

package com.jdcloud.sdk.service.jmr.model;


/**
 * clusterListViewModel
 */
public class ClusterListViewModel  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 主节点信息
     */
    private String masterNodeInfo;

    /**
     * 主节点磁盘类型
     */
    private String masterNodeDiskType;

    /**
     * 主节点磁盘容量
     */
    private Integer masterNodeDiskVolume;

    /**
     * 主节点数量
     */
    private Integer masterNodeNumber;

    /**
     * 主节点实例类型
     */
    private String masterInstanceType;

    /**
     * 从节点信息
     */
    private String slaveNodeInfo;

    /**
     * 从节点磁盘类型
     */
    private String slaveNodeDiskType;

    /**
     * 从节点磁盘容量
     */
    private Integer slaveNodeDiskVolume;

    /**
     * 从节点数量
     */
    private Integer slaveNodeNumber;

    /**
     * 核心实例类型
     */
    private String coreInstanceType;

    /**
     * 网络带宽
     */
    private Integer bandwidthOut;

    /**
     * 数据中心位置
     */
    private String dataCenter;


    /**
     * get 用户名
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set 用户名
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * get 主节点信息
     *
     * @return
     */
    public String getMasterNodeInfo() {
        return masterNodeInfo;
    }

    /**
     * set 主节点信息
     *
     * @param masterNodeInfo
     */
    public void setMasterNodeInfo(String masterNodeInfo) {
        this.masterNodeInfo = masterNodeInfo;
    }

    /**
     * get 主节点磁盘类型
     *
     * @return
     */
    public String getMasterNodeDiskType() {
        return masterNodeDiskType;
    }

    /**
     * set 主节点磁盘类型
     *
     * @param masterNodeDiskType
     */
    public void setMasterNodeDiskType(String masterNodeDiskType) {
        this.masterNodeDiskType = masterNodeDiskType;
    }

    /**
     * get 主节点磁盘容量
     *
     * @return
     */
    public Integer getMasterNodeDiskVolume() {
        return masterNodeDiskVolume;
    }

    /**
     * set 主节点磁盘容量
     *
     * @param masterNodeDiskVolume
     */
    public void setMasterNodeDiskVolume(Integer masterNodeDiskVolume) {
        this.masterNodeDiskVolume = masterNodeDiskVolume;
    }

    /**
     * get 主节点数量
     *
     * @return
     */
    public Integer getMasterNodeNumber() {
        return masterNodeNumber;
    }

    /**
     * set 主节点数量
     *
     * @param masterNodeNumber
     */
    public void setMasterNodeNumber(Integer masterNodeNumber) {
        this.masterNodeNumber = masterNodeNumber;
    }

    /**
     * get 主节点实例类型
     *
     * @return
     */
    public String getMasterInstanceType() {
        return masterInstanceType;
    }

    /**
     * set 主节点实例类型
     *
     * @param masterInstanceType
     */
    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }

    /**
     * get 从节点信息
     *
     * @return
     */
    public String getSlaveNodeInfo() {
        return slaveNodeInfo;
    }

    /**
     * set 从节点信息
     *
     * @param slaveNodeInfo
     */
    public void setSlaveNodeInfo(String slaveNodeInfo) {
        this.slaveNodeInfo = slaveNodeInfo;
    }

    /**
     * get 从节点磁盘类型
     *
     * @return
     */
    public String getSlaveNodeDiskType() {
        return slaveNodeDiskType;
    }

    /**
     * set 从节点磁盘类型
     *
     * @param slaveNodeDiskType
     */
    public void setSlaveNodeDiskType(String slaveNodeDiskType) {
        this.slaveNodeDiskType = slaveNodeDiskType;
    }

    /**
     * get 从节点磁盘容量
     *
     * @return
     */
    public Integer getSlaveNodeDiskVolume() {
        return slaveNodeDiskVolume;
    }

    /**
     * set 从节点磁盘容量
     *
     * @param slaveNodeDiskVolume
     */
    public void setSlaveNodeDiskVolume(Integer slaveNodeDiskVolume) {
        this.slaveNodeDiskVolume = slaveNodeDiskVolume;
    }

    /**
     * get 从节点数量
     *
     * @return
     */
    public Integer getSlaveNodeNumber() {
        return slaveNodeNumber;
    }

    /**
     * set 从节点数量
     *
     * @param slaveNodeNumber
     */
    public void setSlaveNodeNumber(Integer slaveNodeNumber) {
        this.slaveNodeNumber = slaveNodeNumber;
    }

    /**
     * get 核心实例类型
     *
     * @return
     */
    public String getCoreInstanceType() {
        return coreInstanceType;
    }

    /**
     * set 核心实例类型
     *
     * @param coreInstanceType
     */
    public void setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
    }

    /**
     * get 网络带宽
     *
     * @return
     */
    public Integer getBandwidthOut() {
        return bandwidthOut;
    }

    /**
     * set 网络带宽
     *
     * @param bandwidthOut
     */
    public void setBandwidthOut(Integer bandwidthOut) {
        this.bandwidthOut = bandwidthOut;
    }

    /**
     * get 数据中心位置
     *
     * @return
     */
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * set 数据中心位置
     *
     * @param dataCenter
     */
    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }


    /**
     * set 用户名
     *
     * @param userName
     */
    public ClusterListViewModel userName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * set 主节点信息
     *
     * @param masterNodeInfo
     */
    public ClusterListViewModel masterNodeInfo(String masterNodeInfo) {
        this.masterNodeInfo = masterNodeInfo;
        return this;
    }

    /**
     * set 主节点磁盘类型
     *
     * @param masterNodeDiskType
     */
    public ClusterListViewModel masterNodeDiskType(String masterNodeDiskType) {
        this.masterNodeDiskType = masterNodeDiskType;
        return this;
    }

    /**
     * set 主节点磁盘容量
     *
     * @param masterNodeDiskVolume
     */
    public ClusterListViewModel masterNodeDiskVolume(Integer masterNodeDiskVolume) {
        this.masterNodeDiskVolume = masterNodeDiskVolume;
        return this;
    }

    /**
     * set 主节点数量
     *
     * @param masterNodeNumber
     */
    public ClusterListViewModel masterNodeNumber(Integer masterNodeNumber) {
        this.masterNodeNumber = masterNodeNumber;
        return this;
    }

    /**
     * set 主节点实例类型
     *
     * @param masterInstanceType
     */
    public ClusterListViewModel masterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }

    /**
     * set 从节点信息
     *
     * @param slaveNodeInfo
     */
    public ClusterListViewModel slaveNodeInfo(String slaveNodeInfo) {
        this.slaveNodeInfo = slaveNodeInfo;
        return this;
    }

    /**
     * set 从节点磁盘类型
     *
     * @param slaveNodeDiskType
     */
    public ClusterListViewModel slaveNodeDiskType(String slaveNodeDiskType) {
        this.slaveNodeDiskType = slaveNodeDiskType;
        return this;
    }

    /**
     * set 从节点磁盘容量
     *
     * @param slaveNodeDiskVolume
     */
    public ClusterListViewModel slaveNodeDiskVolume(Integer slaveNodeDiskVolume) {
        this.slaveNodeDiskVolume = slaveNodeDiskVolume;
        return this;
    }

    /**
     * set 从节点数量
     *
     * @param slaveNodeNumber
     */
    public ClusterListViewModel slaveNodeNumber(Integer slaveNodeNumber) {
        this.slaveNodeNumber = slaveNodeNumber;
        return this;
    }

    /**
     * set 核心实例类型
     *
     * @param coreInstanceType
     */
    public ClusterListViewModel coreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }

    /**
     * set 网络带宽
     *
     * @param bandwidthOut
     */
    public ClusterListViewModel bandwidthOut(Integer bandwidthOut) {
        this.bandwidthOut = bandwidthOut;
        return this;
    }

    /**
     * set 数据中心位置
     *
     * @param dataCenter
     */
    public ClusterListViewModel dataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }


}