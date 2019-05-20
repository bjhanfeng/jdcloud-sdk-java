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

package com.jdcloud.sdk.service.zfs.model;


/**
 * 描述一个文件系统
 */
public class MountTarget  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件系统ID
     */
    private String fileSystemId;

    /**
     * ipv4地址
     */
    private String ipAddress;

    /**
     * 挂载目标状态
     */
    private String status;

    /**
     * 挂载目标ID
     */
    private String mountTargetId;

    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * vpcID
     */
    private String vpcId;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * dns名称
     */
    private String dnsName;


    /**
     * get 文件系统ID
     *
     * @return
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * set 文件系统ID
     *
     * @param fileSystemId
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * get ipv4地址
     *
     * @return
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * set ipv4地址
     *
     * @param ipAddress
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * get 挂载目标状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 挂载目标状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 挂载目标ID
     *
     * @return
     */
    public String getMountTargetId() {
        return mountTargetId;
    }

    /**
     * set 挂载目标ID
     *
     * @param mountTargetId
     */
    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }

    /**
     * get 子网ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get vpcID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set vpcID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

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
     * get dns名称
     *
     * @return
     */
    public String getDnsName() {
        return dnsName;
    }

    /**
     * set dns名称
     *
     * @param dnsName
     */
    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }


    /**
     * set 文件系统ID
     *
     * @param fileSystemId
     */
    public MountTarget fileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * set ipv4地址
     *
     * @param ipAddress
     */
    public MountTarget ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * set 挂载目标状态
     *
     * @param status
     */
    public MountTarget status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 挂载目标ID
     *
     * @param mountTargetId
     */
    public MountTarget mountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public MountTarget subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set vpcID
     *
     * @param vpcId
     */
    public MountTarget vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public MountTarget createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set dns名称
     *
     * @param dnsName
     */
    public MountTarget dnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }


}