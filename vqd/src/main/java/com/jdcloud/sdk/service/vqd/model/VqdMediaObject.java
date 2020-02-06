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

package com.jdcloud.sdk.service.vqd.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 质量检测媒体信息
 */
public class VqdMediaObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 媒体URL
     * Required:true
     */
    @Required
    private String mediaUrl;

    /**
     * 媒体名称
     */
    private String mediaName;


    /**
     * get 媒体URL
     *
     * @return
     */
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * set 媒体URL
     *
     * @param mediaUrl
     */
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * get 媒体名称
     *
     * @return
     */
    public String getMediaName() {
        return mediaName;
    }

    /**
     * set 媒体名称
     *
     * @param mediaName
     */
    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }


    /**
     * set 媒体URL
     *
     * @param mediaUrl
     */
    public VqdMediaObject mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * set 媒体名称
     *
     * @param mediaName
     */
    public VqdMediaObject mediaName(String mediaName) {
        this.mediaName = mediaName;
        return this;
    }


}