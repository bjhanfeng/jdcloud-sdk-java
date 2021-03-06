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

package com.jdcloud.sdk.service.jmr.model;


/**
 * jmrTaskViewModel
 */
public class JmrTaskViewModel  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 作业Id
     */
    private String taskId;

    /**
     * 作业名称
     */
    private String taskName;

    /**
     * 作业类型
     */
    private String taskType;

    /**
     * 状态
     */
    private String status;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 持续时间
     */
    private String duration;

    /**
     * 用户名
     */
    private String userpin;

    /**
     * 数据中心，即regionId
     */
    private String dataCenter;

    /**
     * jobId
     */
    private String jobId;

    /**
     * planId
     */
    private String planId;

    /**
     * 工作流Id
     */
    private String workflowId;

    /**
     * 工作流实例Id
     */
    private String workflowInstanceId;


    /**
     * get id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 作业Id
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 作业Id
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * get 作业名称
     *
     * @return
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * set 作业名称
     *
     * @param taskName
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * get 作业类型
     *
     * @return
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * set 作业类型
     *
     * @param taskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * get 状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 持续时间
     *
     * @return
     */
    public String getDuration() {
        return duration;
    }

    /**
     * set 持续时间
     *
     * @param duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * get 用户名
     *
     * @return
     */
    public String getUserpin() {
        return userpin;
    }

    /**
     * set 用户名
     *
     * @param userpin
     */
    public void setUserpin(String userpin) {
        this.userpin = userpin;
    }

    /**
     * get 数据中心，即regionId
     *
     * @return
     */
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * set 数据中心，即regionId
     *
     * @param dataCenter
     */
    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    /**
     * get jobId
     *
     * @return
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * set jobId
     *
     * @param jobId
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * get planId
     *
     * @return
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * set planId
     *
     * @param planId
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * get 工作流Id
     *
     * @return
     */
    public String getWorkflowId() {
        return workflowId;
    }

    /**
     * set 工作流Id
     *
     * @param workflowId
     */
    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * get 工作流实例Id
     *
     * @return
     */
    public String getWorkflowInstanceId() {
        return workflowInstanceId;
    }

    /**
     * set 工作流实例Id
     *
     * @param workflowInstanceId
     */
    public void setWorkflowInstanceId(String workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
    }


    /**
     * set id
     *
     * @param id
     */
    public JmrTaskViewModel id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 作业Id
     *
     * @param taskId
     */
    public JmrTaskViewModel taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * set 作业名称
     *
     * @param taskName
     */
    public JmrTaskViewModel taskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * set 作业类型
     *
     * @param taskType
     */
    public JmrTaskViewModel taskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public JmrTaskViewModel status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public JmrTaskViewModel startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public JmrTaskViewModel endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 持续时间
     *
     * @param duration
     */
    public JmrTaskViewModel duration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * set 用户名
     *
     * @param userpin
     */
    public JmrTaskViewModel userpin(String userpin) {
        this.userpin = userpin;
        return this;
    }

    /**
     * set 数据中心，即regionId
     *
     * @param dataCenter
     */
    public JmrTaskViewModel dataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * set jobId
     *
     * @param jobId
     */
    public JmrTaskViewModel jobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * set planId
     *
     * @param planId
     */
    public JmrTaskViewModel planId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * set 工作流Id
     *
     * @param workflowId
     */
    public JmrTaskViewModel workflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * set 工作流实例Id
     *
     * @param workflowInstanceId
     */
    public JmrTaskViewModel workflowInstanceId(String workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }


}