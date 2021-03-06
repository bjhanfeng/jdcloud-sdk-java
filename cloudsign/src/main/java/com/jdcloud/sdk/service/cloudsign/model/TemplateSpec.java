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

package com.jdcloud.sdk.service.cloudsign.model;


/**
 * templateSpec
 */
public class TemplateSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 合同模板文件（base64）
     */
    private String templateContent;

    /**
     * 合同模板名称
     */
    private String templateName;

    /**
     * 合同模板标题
     */
    private String templateTitle;


    /**
     * get 合同模板文件（base64）
     *
     * @return
     */
    public String getTemplateContent() {
        return templateContent;
    }

    /**
     * set 合同模板文件（base64）
     *
     * @param templateContent
     */
    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    /**
     * get 合同模板名称
     *
     * @return
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * set 合同模板名称
     *
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * get 合同模板标题
     *
     * @return
     */
    public String getTemplateTitle() {
        return templateTitle;
    }

    /**
     * set 合同模板标题
     *
     * @param templateTitle
     */
    public void setTemplateTitle(String templateTitle) {
        this.templateTitle = templateTitle;
    }


    /**
     * set 合同模板文件（base64）
     *
     * @param templateContent
     */
    public TemplateSpec templateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }

    /**
     * set 合同模板名称
     *
     * @param templateName
     */
    public TemplateSpec templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * set 合同模板标题
     *
     * @param templateTitle
     */
    public TemplateSpec templateTitle(String templateTitle) {
        this.templateTitle = templateTitle;
        return this;
    }


}