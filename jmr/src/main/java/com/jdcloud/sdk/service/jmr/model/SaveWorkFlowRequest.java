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
 * 工作流管理
 * JMR工作流相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jmr.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.jmr.model.EmrWorkflow;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 保存工作流
 */
public class SaveWorkFlowRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * workflow
     * Required:true
     */
    @Required
    private EmrWorkflow workflow;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get workflow
     *
     * @return
     */
    public EmrWorkflow getWorkflow() {
        return workflow;
    }

    /**
     * set workflow
     *
     * @param workflow
     */
    public void setWorkflow(EmrWorkflow workflow) {
        this.workflow = workflow;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set workflow
     *
     * @param workflow
     */
    public SaveWorkFlowRequest workflow(EmrWorkflow workflow) {
        this.workflow = workflow;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public SaveWorkFlowRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}