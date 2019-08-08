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

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * pod volume 规格
 */
public class VolumeSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * volume名字，符合DNS-1123 label规范，在一个Pod内唯一。
     * Required:true
     */
    @Required
    private String name;

    /**
     * 提供给Pod的cloud disk.
     * Required:true
     */
    @Required
    private JDCloudVolumeSourceSpec jdcloudDisk;


    /**
     * get volume名字，符合DNS-1123 label规范，在一个Pod内唯一。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set volume名字，符合DNS-1123 label规范，在一个Pod内唯一。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 提供给Pod的cloud disk.
     *
     * @return
     */
    public JDCloudVolumeSourceSpec getJdcloudDisk() {
        return jdcloudDisk;
    }

    /**
     * set 提供给Pod的cloud disk.
     *
     * @param jdcloudDisk
     */
    public void setJdcloudDisk(JDCloudVolumeSourceSpec jdcloudDisk) {
        this.jdcloudDisk = jdcloudDisk;
    }


    /**
     * set volume名字，符合DNS-1123 label规范，在一个Pod内唯一。
     *
     * @param name
     */
    public VolumeSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 提供给Pod的cloud disk.
     *
     * @param jdcloudDisk
     */
    public VolumeSpec jdcloudDisk(JDCloudVolumeSourceSpec jdcloudDisk) {
        this.jdcloudDisk = jdcloudDisk;
        return this;
    }


}