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
 * protocolProp
 */
public class ProtocolProp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 属性名称
     */
    private String propName;

    /**
     * 属性描述
     */
    private String propDesc;

    /**
     * 属性值长度限制
     */
    private String inputLength;

    /**
     * 属性默认值
     */
    private String inputDefault;

    /**
     * 是否必填,0-非唯一，1-唯一
     */
    private Integer unique;

    /**
     * 是否必填,0-非必填，1-必填
     */
    private Integer required;


    /**
     * get 属性名称
     *
     * @return
     */
    public String getPropName() {
        return propName;
    }

    /**
     * set 属性名称
     *
     * @param propName
     */
    public void setPropName(String propName) {
        this.propName = propName;
    }

    /**
     * get 属性描述
     *
     * @return
     */
    public String getPropDesc() {
        return propDesc;
    }

    /**
     * set 属性描述
     *
     * @param propDesc
     */
    public void setPropDesc(String propDesc) {
        this.propDesc = propDesc;
    }

    /**
     * get 属性值长度限制
     *
     * @return
     */
    public String getInputLength() {
        return inputLength;
    }

    /**
     * set 属性值长度限制
     *
     * @param inputLength
     */
    public void setInputLength(String inputLength) {
        this.inputLength = inputLength;
    }

    /**
     * get 属性默认值
     *
     * @return
     */
    public String getInputDefault() {
        return inputDefault;
    }

    /**
     * set 属性默认值
     *
     * @param inputDefault
     */
    public void setInputDefault(String inputDefault) {
        this.inputDefault = inputDefault;
    }

    /**
     * get 是否必填,0-非唯一，1-唯一
     *
     * @return
     */
    public Integer getUnique() {
        return unique;
    }

    /**
     * set 是否必填,0-非唯一，1-唯一
     *
     * @param unique
     */
    public void setUnique(Integer unique) {
        this.unique = unique;
    }

    /**
     * get 是否必填,0-非必填，1-必填
     *
     * @return
     */
    public Integer getRequired() {
        return required;
    }

    /**
     * set 是否必填,0-非必填，1-必填
     *
     * @param required
     */
    public void setRequired(Integer required) {
        this.required = required;
    }


    /**
     * set 属性名称
     *
     * @param propName
     */
    public ProtocolProp propName(String propName) {
        this.propName = propName;
        return this;
    }

    /**
     * set 属性描述
     *
     * @param propDesc
     */
    public ProtocolProp propDesc(String propDesc) {
        this.propDesc = propDesc;
        return this;
    }

    /**
     * set 属性值长度限制
     *
     * @param inputLength
     */
    public ProtocolProp inputLength(String inputLength) {
        this.inputLength = inputLength;
        return this;
    }

    /**
     * set 属性默认值
     *
     * @param inputDefault
     */
    public ProtocolProp inputDefault(String inputDefault) {
        this.inputDefault = inputDefault;
        return this;
    }

    /**
     * set 是否必填,0-非唯一，1-唯一
     *
     * @param unique
     */
    public ProtocolProp unique(Integer unique) {
        this.unique = unique;
        return this;
    }

    /**
     * set 是否必填,0-非必填，1-必填
     *
     * @param required
     */
    public ProtocolProp required(Integer required) {
        this.required = required;
        return this;
    }


}