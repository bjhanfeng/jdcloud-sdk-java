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

package com.jdcloud.sdk.service.iotedge.model;


/**
 * appVersionList
 */
public class AppVersionList  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 显示名称
     */
    private String displayName;

    /**
     * 应用类型
     */
    private String appTpye;

    /**
     * 应用地址
     */
    private String appAddr;

    /**
     * 应用版本
     */
    private String appVersion;

    /**
     * 更新时间
     */
    private String updateTime;


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
     * get 显示名称
     *
     * @return
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * set 显示名称
     *
     * @param displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * get 应用类型
     *
     * @return
     */
    public String getAppTpye() {
        return appTpye;
    }

    /**
     * set 应用类型
     *
     * @param appTpye
     */
    public void setAppTpye(String appTpye) {
        this.appTpye = appTpye;
    }

    /**
     * get 应用地址
     *
     * @return
     */
    public String getAppAddr() {
        return appAddr;
    }

    /**
     * set 应用地址
     *
     * @param appAddr
     */
    public void setAppAddr(String appAddr) {
        this.appAddr = appAddr;
    }

    /**
     * get 应用版本
     *
     * @return
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * set 应用版本
     *
     * @param appVersion
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public AppVersionList appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 显示名称
     *
     * @param displayName
     */
    public AppVersionList displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set 应用类型
     *
     * @param appTpye
     */
    public AppVersionList appTpye(String appTpye) {
        this.appTpye = appTpye;
        return this;
    }

    /**
     * set 应用地址
     *
     * @param appAddr
     */
    public AppVersionList appAddr(String appAddr) {
        this.appAddr = appAddr;
        return this;
    }

    /**
     * set 应用版本
     *
     * @param appVersion
     */
    public AppVersionList appVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public AppVersionList updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}