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


/**
 * deployType
 */
public class DeployType  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部署类型ID
     */
    private Integer value;

    /**
     * 部署类型名称
     */
    private String label;


    /**
     * get 部署类型ID
     *
     * @return
     */
    public Integer getValue() {
        return value;
    }

    /**
     * set 部署类型ID
     *
     * @param value
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * get 部署类型名称
     *
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * set 部署类型名称
     *
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }


    /**
     * set 部署类型ID
     *
     * @param value
     */
    public DeployType value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * set 部署类型名称
     *
     * @param label
     */
    public DeployType label(String label) {
        this.label = label;
        return this;
    }


}