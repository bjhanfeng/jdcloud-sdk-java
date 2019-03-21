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

package com.jdcloud.sdk.service.deploy.model;

import java.util.List;
import java.util.ArrayList;

/**
 * milestone
 */
public class Milestone  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 里程碑ID
     */
    private String milestoneId;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 地域
     */
    private String regionId;

    /**
     * 描述
     */
    private String desc;

    /**
     * 部署方式：1滚动部署，2蓝绿部署
     */
    private Integer deployMethod;

    /**
     * 部署来源：1url，2云编译，3云存储
     */
    private Integer deploySource;

    /**
     * 下载url
     */
    private String downloadUrl;

    /**
     * md5
     */
    private String md5;

    /**
     * 云编译项目名
     */
    private String compileProject;

    /**
     * 云编译构建序号
     */
    private String compileSeries;

    /**
     * 云存储空间
     */
    private String ossSpace;

    /**
     * 云存储目录
     */
    private String ossDir;

    /**
     * 文件类型：1.tar，2.zip,3.tar.gz
     */
    private Integer fileType;

    /**
     * 最新部署时间
     */
    private Integer lastDeployTime;

    /**
     * 部署组
     */
    private List<String> deployGroup;


    /**
     * get 里程碑ID
     *
     * @return
     */
    public String getMilestoneId() {
        return milestoneId;
    }

    /**
     * set 里程碑ID
     *
     * @param milestoneId
     */
    public void setMilestoneId(String milestoneId) {
        this.milestoneId = milestoneId;
    }

    /**
     * get 应用ID
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 描述
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * get 部署方式：1滚动部署，2蓝绿部署
     *
     * @return
     */
    public Integer getDeployMethod() {
        return deployMethod;
    }

    /**
     * set 部署方式：1滚动部署，2蓝绿部署
     *
     * @param deployMethod
     */
    public void setDeployMethod(Integer deployMethod) {
        this.deployMethod = deployMethod;
    }

    /**
     * get 部署来源：1url，2云编译，3云存储
     *
     * @return
     */
    public Integer getDeploySource() {
        return deploySource;
    }

    /**
     * set 部署来源：1url，2云编译，3云存储
     *
     * @param deploySource
     */
    public void setDeploySource(Integer deploySource) {
        this.deploySource = deploySource;
    }

    /**
     * get 下载url
     *
     * @return
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * set 下载url
     *
     * @param downloadUrl
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * get md5
     *
     * @return
     */
    public String getMd5() {
        return md5;
    }

    /**
     * set md5
     *
     * @param md5
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
     * get 云编译项目名
     *
     * @return
     */
    public String getCompileProject() {
        return compileProject;
    }

    /**
     * set 云编译项目名
     *
     * @param compileProject
     */
    public void setCompileProject(String compileProject) {
        this.compileProject = compileProject;
    }

    /**
     * get 云编译构建序号
     *
     * @return
     */
    public String getCompileSeries() {
        return compileSeries;
    }

    /**
     * set 云编译构建序号
     *
     * @param compileSeries
     */
    public void setCompileSeries(String compileSeries) {
        this.compileSeries = compileSeries;
    }

    /**
     * get 云存储空间
     *
     * @return
     */
    public String getOssSpace() {
        return ossSpace;
    }

    /**
     * set 云存储空间
     *
     * @param ossSpace
     */
    public void setOssSpace(String ossSpace) {
        this.ossSpace = ossSpace;
    }

    /**
     * get 云存储目录
     *
     * @return
     */
    public String getOssDir() {
        return ossDir;
    }

    /**
     * set 云存储目录
     *
     * @param ossDir
     */
    public void setOssDir(String ossDir) {
        this.ossDir = ossDir;
    }

    /**
     * get 文件类型：1.tar，2.zip,3.tar.gz
     *
     * @return
     */
    public Integer getFileType() {
        return fileType;
    }

    /**
     * set 文件类型：1.tar，2.zip,3.tar.gz
     *
     * @param fileType
     */
    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    /**
     * get 最新部署时间
     *
     * @return
     */
    public Integer getLastDeployTime() {
        return lastDeployTime;
    }

    /**
     * set 最新部署时间
     *
     * @param lastDeployTime
     */
    public void setLastDeployTime(Integer lastDeployTime) {
        this.lastDeployTime = lastDeployTime;
    }

    /**
     * get 部署组
     *
     * @return
     */
    public List<String> getDeployGroup() {
        return deployGroup;
    }

    /**
     * set 部署组
     *
     * @param deployGroup
     */
    public void setDeployGroup(List<String> deployGroup) {
        this.deployGroup = deployGroup;
    }


    /**
     * set 里程碑ID
     *
     * @param milestoneId
     */
    public Milestone milestoneId(String milestoneId) {
        this.milestoneId = milestoneId;
        return this;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public Milestone appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public Milestone appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 地域
     *
     * @param regionId
     */
    public Milestone regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 描述
     *
     * @param desc
     */
    public Milestone desc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * set 部署方式：1滚动部署，2蓝绿部署
     *
     * @param deployMethod
     */
    public Milestone deployMethod(Integer deployMethod) {
        this.deployMethod = deployMethod;
        return this;
    }

    /**
     * set 部署来源：1url，2云编译，3云存储
     *
     * @param deploySource
     */
    public Milestone deploySource(Integer deploySource) {
        this.deploySource = deploySource;
        return this;
    }

    /**
     * set 下载url
     *
     * @param downloadUrl
     */
    public Milestone downloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * set md5
     *
     * @param md5
     */
    public Milestone md5(String md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * set 云编译项目名
     *
     * @param compileProject
     */
    public Milestone compileProject(String compileProject) {
        this.compileProject = compileProject;
        return this;
    }

    /**
     * set 云编译构建序号
     *
     * @param compileSeries
     */
    public Milestone compileSeries(String compileSeries) {
        this.compileSeries = compileSeries;
        return this;
    }

    /**
     * set 云存储空间
     *
     * @param ossSpace
     */
    public Milestone ossSpace(String ossSpace) {
        this.ossSpace = ossSpace;
        return this;
    }

    /**
     * set 云存储目录
     *
     * @param ossDir
     */
    public Milestone ossDir(String ossDir) {
        this.ossDir = ossDir;
        return this;
    }

    /**
     * set 文件类型：1.tar，2.zip,3.tar.gz
     *
     * @param fileType
     */
    public Milestone fileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * set 最新部署时间
     *
     * @param lastDeployTime
     */
    public Milestone lastDeployTime(Integer lastDeployTime) {
        this.lastDeployTime = lastDeployTime;
        return this;
    }

    /**
     * set 部署组
     *
     * @param deployGroup
     */
    public Milestone deployGroup(List<String> deployGroup) {
        this.deployGroup = deployGroup;
        return this;
    }


    /**
     * add item to 部署组
     *
     * @param deployGroup
     */
    public void addDeployGroup(String deployGroup) {
        if (this.deployGroup == null) {
            this.deployGroup = new ArrayList<>();
        }
        this.deployGroup.add(deployGroup);
    }

}