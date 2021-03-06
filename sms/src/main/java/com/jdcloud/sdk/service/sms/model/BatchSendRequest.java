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
 * Send-Message-Related-APIs
 * 短信发送相关API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.sms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 指定模板群发短信接口。接口调用需要使用京东云统一鉴权的SDK方式接入，以下文档仅是接口出参、入参描述，并不是最终程序实现逻辑的范例，具体接口实现请查看SDK参考：https://docs.jdcloud.com/cn/text-message/java
 */
public class BatchSendRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板Id
     * Required:true
     */
    @Required
    private String templateId;

    /**
     * 签名Id
     * Required:true
     */
    @Required
    private String signId;

    /**
     * 群发的国内电话号码,群发时一次最多不要超过100个手机号
     * Required:true
     */
    @Required
    private List<String> phoneList;

    /**
     * 短信模板变量对应的数据值,Array格式
     */
    private List<String> params;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 模板Id
     *
     * @return
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * set 模板Id
     *
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * get 签名Id
     *
     * @return
     */
    public String getSignId() {
        return signId;
    }

    /**
     * set 签名Id
     *
     * @param signId
     */
    public void setSignId(String signId) {
        this.signId = signId;
    }

    /**
     * get 群发的国内电话号码,群发时一次最多不要超过100个手机号
     *
     * @return
     */
    public List<String> getPhoneList() {
        return phoneList;
    }

    /**
     * set 群发的国内电话号码,群发时一次最多不要超过100个手机号
     *
     * @param phoneList
     */
    public void setPhoneList(List<String> phoneList) {
        this.phoneList = phoneList;
    }

    /**
     * get 短信模板变量对应的数据值,Array格式
     *
     * @return
     */
    public List<String> getParams() {
        return params;
    }

    /**
     * set 短信模板变量对应的数据值,Array格式
     *
     * @param params
     */
    public void setParams(List<String> params) {
        this.params = params;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 模板Id
     *
     * @param templateId
     */
    public BatchSendRequest templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * set 签名Id
     *
     * @param signId
     */
    public BatchSendRequest signId(String signId) {
        this.signId = signId;
        return this;
    }

    /**
     * set 群发的国内电话号码,群发时一次最多不要超过100个手机号
     *
     * @param phoneList
     */
    public BatchSendRequest phoneList(List<String> phoneList) {
        this.phoneList = phoneList;
        return this;
    }

    /**
     * set 短信模板变量对应的数据值,Array格式
     *
     * @param params
     */
    public BatchSendRequest params(List<String> params) {
        this.params = params;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public BatchSendRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 群发的国内电话号码,群发时一次最多不要超过100个手机号
     *
     * @param phoneList
     */
    public void addPhoneList(String phoneList) {
        if (this.phoneList == null) {
            this.phoneList = new ArrayList<>();
        }
        this.phoneList.add(phoneList);
    }

    /**
     * add item to 短信模板变量对应的数据值,Array格式
     *
     * @param param
     */
    public void addParam(String param) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(param);
    }

}