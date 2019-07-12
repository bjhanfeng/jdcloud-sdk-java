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
 * User Group Management
 * User Group Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加子用户到用户组中
 */
public class AddSubUserToGroupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子用户名
     * Required:true
     */
    @Required
    private String subUser;

    /**
     * 用户组名称
     * Required:true
     */
    @Required
    private String groupName;


    /**
     * get 子用户名
     *
     * @return
     */
    public String getSubUser() {
        return subUser;
    }

    /**
     * set 子用户名
     *
     * @param subUser
     */
    public void setSubUser(String subUser) {
        this.subUser = subUser;
    }

    /**
     * get 用户组名称
     *
     * @return
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * set 用户组名称
     *
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    /**
     * set 子用户名
     *
     * @param subUser
     */
    public AddSubUserToGroupRequest subUser(String subUser) {
        this.subUser = subUser;
        return this;
    }

    /**
     * set 用户组名称
     *
     * @param groupName
     */
    public AddSubUserToGroupRequest groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }


}