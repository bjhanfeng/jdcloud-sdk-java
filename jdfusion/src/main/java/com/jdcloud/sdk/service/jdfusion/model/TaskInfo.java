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

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;

/**
 * taskInfo
 */
public class TaskInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务执行开始时间
     */
    private String beginTime;

    /**
     * 任务执行结束时间
     */
    private String endTime;

    /**
     * 任务执行状态：running、finished
     */
    private String taskStatus;

    /**
     * 任务执行结果：done、error、nochange
     */
    private String taskResult;

    /**
     * 任务执行最后编码:
CREATEING_RESOURCE_INFO-&gt;未完成:正在构建目标资源信息
CREATE_RESOURCE_INFO_ERROR-&gt;失败完成:目标资源描述信息创建失败！
CREATE_RESOURCE_INFO_SUCCESS-&gt;未完成:目标资源描述信息创建成功！开始初始化构建程序
PROGRAM_INITING-&gt;未完成:正在初始化构建程序
PROGRAM_INIT_ERROR-&gt;失败完成:构建程序初始化失败！
PROGRAM_INIT_SUCCESS-&gt;未完成:构建程序初始化成功！开始分析本次构建任务
TASK_PLAN_ERROR-&gt;失败完成:构建分析发生错误！
TASK_PLAN_NOCHANGE-&gt;完成:本次构建无可执行操作
TASK_PLAN_SUCCESS-&gt;未完成:分析完成！开始执行资源构建
TASK_RUN_FAILED-&gt;失败完成:资源构建任务执行失败！
TASK_RUN_NOCHANGE-&gt;完成:本次构建未执行任何操作
TASK_RUN_SUCCESS-&gt;完成:资源构建任务执行完毕！
     */
    private String lastCode;

    /**
     * 任务执行之后编码描述
     */
    private String taskLastInfo;

    /**
     * 任务执行成功后返回的ID列表
     */
    private List<Object> resourceIDs;

    /**
     * 任务执行日志信息
     */
    private List<Object> msg;


    /**
     * get 任务执行开始时间
     *
     * @return
     */
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * set 任务执行开始时间
     *
     * @param beginTime
     */
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * get 任务执行结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 任务执行结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 任务执行状态：running、finished
     *
     * @return
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * set 任务执行状态：running、finished
     *
     * @param taskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * get 任务执行结果：done、error、nochange
     *
     * @return
     */
    public String getTaskResult() {
        return taskResult;
    }

    /**
     * set 任务执行结果：done、error、nochange
     *
     * @param taskResult
     */
    public void setTaskResult(String taskResult) {
        this.taskResult = taskResult;
    }

    /**
     * get 任务执行最后编码:
CREATEING_RESOURCE_INFO-&gt;未完成:正在构建目标资源信息
CREATE_RESOURCE_INFO_ERROR-&gt;失败完成:目标资源描述信息创建失败！
CREATE_RESOURCE_INFO_SUCCESS-&gt;未完成:目标资源描述信息创建成功！开始初始化构建程序
PROGRAM_INITING-&gt;未完成:正在初始化构建程序
PROGRAM_INIT_ERROR-&gt;失败完成:构建程序初始化失败！
PROGRAM_INIT_SUCCESS-&gt;未完成:构建程序初始化成功！开始分析本次构建任务
TASK_PLAN_ERROR-&gt;失败完成:构建分析发生错误！
TASK_PLAN_NOCHANGE-&gt;完成:本次构建无可执行操作
TASK_PLAN_SUCCESS-&gt;未完成:分析完成！开始执行资源构建
TASK_RUN_FAILED-&gt;失败完成:资源构建任务执行失败！
TASK_RUN_NOCHANGE-&gt;完成:本次构建未执行任何操作
TASK_RUN_SUCCESS-&gt;完成:资源构建任务执行完毕！
     *
     * @return
     */
    public String getLastCode() {
        return lastCode;
    }

    /**
     * set 任务执行最后编码:
CREATEING_RESOURCE_INFO-&gt;未完成:正在构建目标资源信息
CREATE_RESOURCE_INFO_ERROR-&gt;失败完成:目标资源描述信息创建失败！
CREATE_RESOURCE_INFO_SUCCESS-&gt;未完成:目标资源描述信息创建成功！开始初始化构建程序
PROGRAM_INITING-&gt;未完成:正在初始化构建程序
PROGRAM_INIT_ERROR-&gt;失败完成:构建程序初始化失败！
PROGRAM_INIT_SUCCESS-&gt;未完成:构建程序初始化成功！开始分析本次构建任务
TASK_PLAN_ERROR-&gt;失败完成:构建分析发生错误！
TASK_PLAN_NOCHANGE-&gt;完成:本次构建无可执行操作
TASK_PLAN_SUCCESS-&gt;未完成:分析完成！开始执行资源构建
TASK_RUN_FAILED-&gt;失败完成:资源构建任务执行失败！
TASK_RUN_NOCHANGE-&gt;完成:本次构建未执行任何操作
TASK_RUN_SUCCESS-&gt;完成:资源构建任务执行完毕！
     *
     * @param lastCode
     */
    public void setLastCode(String lastCode) {
        this.lastCode = lastCode;
    }

    /**
     * get 任务执行之后编码描述
     *
     * @return
     */
    public String getTaskLastInfo() {
        return taskLastInfo;
    }

    /**
     * set 任务执行之后编码描述
     *
     * @param taskLastInfo
     */
    public void setTaskLastInfo(String taskLastInfo) {
        this.taskLastInfo = taskLastInfo;
    }

    /**
     * get 任务执行成功后返回的ID列表
     *
     * @return
     */
    public List<Object> getResourceIDs() {
        return resourceIDs;
    }

    /**
     * set 任务执行成功后返回的ID列表
     *
     * @param resourceIDs
     */
    public void setResourceIDs(List<Object> resourceIDs) {
        this.resourceIDs = resourceIDs;
    }

    /**
     * get 任务执行日志信息
     *
     * @return
     */
    public List<Object> getMsg() {
        return msg;
    }

    /**
     * set 任务执行日志信息
     *
     * @param msg
     */
    public void setMsg(List<Object> msg) {
        this.msg = msg;
    }


    /**
     * set 任务执行开始时间
     *
     * @param beginTime
     */
    public TaskInfo beginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * set 任务执行结束时间
     *
     * @param endTime
     */
    public TaskInfo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 任务执行状态：running、finished
     *
     * @param taskStatus
     */
    public TaskInfo taskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * set 任务执行结果：done、error、nochange
     *
     * @param taskResult
     */
    public TaskInfo taskResult(String taskResult) {
        this.taskResult = taskResult;
        return this;
    }

    /**
     * set 任务执行最后编码:
CREATEING_RESOURCE_INFO-&gt;未完成:正在构建目标资源信息
CREATE_RESOURCE_INFO_ERROR-&gt;失败完成:目标资源描述信息创建失败！
CREATE_RESOURCE_INFO_SUCCESS-&gt;未完成:目标资源描述信息创建成功！开始初始化构建程序
PROGRAM_INITING-&gt;未完成:正在初始化构建程序
PROGRAM_INIT_ERROR-&gt;失败完成:构建程序初始化失败！
PROGRAM_INIT_SUCCESS-&gt;未完成:构建程序初始化成功！开始分析本次构建任务
TASK_PLAN_ERROR-&gt;失败完成:构建分析发生错误！
TASK_PLAN_NOCHANGE-&gt;完成:本次构建无可执行操作
TASK_PLAN_SUCCESS-&gt;未完成:分析完成！开始执行资源构建
TASK_RUN_FAILED-&gt;失败完成:资源构建任务执行失败！
TASK_RUN_NOCHANGE-&gt;完成:本次构建未执行任何操作
TASK_RUN_SUCCESS-&gt;完成:资源构建任务执行完毕！
     *
     * @param lastCode
     */
    public TaskInfo lastCode(String lastCode) {
        this.lastCode = lastCode;
        return this;
    }

    /**
     * set 任务执行之后编码描述
     *
     * @param taskLastInfo
     */
    public TaskInfo taskLastInfo(String taskLastInfo) {
        this.taskLastInfo = taskLastInfo;
        return this;
    }

    /**
     * set 任务执行成功后返回的ID列表
     *
     * @param resourceIDs
     */
    public TaskInfo resourceIDs(List<Object> resourceIDs) {
        this.resourceIDs = resourceIDs;
        return this;
    }

    /**
     * set 任务执行日志信息
     *
     * @param msg
     */
    public TaskInfo msg(List<Object> msg) {
        this.msg = msg;
        return this;
    }


    /**
     * add item to 任务执行成功后返回的ID列表
     *
     * @param resourceID
     */
    public void addResourceID(Object resourceID) {
        if (this.resourceIDs == null) {
            this.resourceIDs = new ArrayList<>();
        }
        this.resourceIDs.add(resourceID);
    }

    /**
     * add item to 任务执行日志信息
     *
     * @param msg
     */
    public void addMsg(Object msg) {
        if (this.msg == null) {
            this.msg = new ArrayList<>();
        }
        this.msg.add(msg);
    }

}