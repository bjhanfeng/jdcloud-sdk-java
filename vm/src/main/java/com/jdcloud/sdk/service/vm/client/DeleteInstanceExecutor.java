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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.vm.model.DeleteInstanceResponse;

/**
 * 删除按配置计费、或包年包月已到期的单个云主机。不能删除没有计费信息的云主机。&lt;br&gt;
云主机状态必须为运行&lt;b&gt;running&lt;/b&gt;、停止&lt;b&gt;stopped&lt;/b&gt;、错误&lt;b&gt;error&lt;/b&gt;，同时云主机没有正在进行中的任务才可删除。&lt;br&gt;
包年包月未到期的云主机不能删除。&lt;br&gt;
如果主机中挂载的数据盘为按配置计费的云硬盘，并且不是共享型云硬盘，并且AutoDelete属性为true，那么数据盘会随主机一起删除。
 [MFA enabled]
 */
class DeleteInstanceExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "DELETE";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/instances/{instanceId}";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DeleteInstanceResponse.class;
    }
}
