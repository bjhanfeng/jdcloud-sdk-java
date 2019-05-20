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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除录制文件

 */
public class DeleteLiveRecordFilesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 需要删除的录制文件ID，多个时以逗号（,）分隔

     * Required:true
     */
    @Required
    private String fileIds;


    /**
     * get 需要删除的录制文件ID，多个时以逗号（,）分隔

     *
     * @return
     */
    public String getFileIds() {
        return fileIds;
    }

    /**
     * set 需要删除的录制文件ID，多个时以逗号（,）分隔

     *
     * @param fileIds
     */
    public void setFileIds(String fileIds) {
        this.fileIds = fileIds;
    }


    /**
     * set 需要删除的录制文件ID，多个时以逗号（,）分隔

     *
     * @param fileIds
     */
    public DeleteLiveRecordFilesRequest fileIds(String fileIds) {
        this.fileIds = fileIds;
        return this;
    }


}