/*
 * Copyright 2018-2025 JDCLOUD.COM
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
 * 云硬盘API
 * 云硬盘API包含云硬盘相关接口和快照相关接口。可提供批量创建云硬盘，删除云硬盘，制作云硬盘快照等功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.disk.model.CreateSnapshotRequest;
import com.jdcloud.sdk.service.disk.model.CreateSnapshotResponse;
import com.jdcloud.sdk.service.disk.client.CreateSnapshotExecutor;
import com.jdcloud.sdk.service.disk.model.RestoreDiskRequest;
import com.jdcloud.sdk.service.disk.model.RestoreDiskResponse;
import com.jdcloud.sdk.service.disk.client.RestoreDiskExecutor;
import com.jdcloud.sdk.service.disk.model.DescribeDisksRequest;
import com.jdcloud.sdk.service.disk.model.DescribeDisksResponse;
import com.jdcloud.sdk.service.disk.client.DescribeDisksExecutor;
import com.jdcloud.sdk.service.disk.model.DescribeSnapshotsRequest;
import com.jdcloud.sdk.service.disk.model.DescribeSnapshotsResponse;
import com.jdcloud.sdk.service.disk.client.DescribeSnapshotsExecutor;
import com.jdcloud.sdk.service.disk.model.DescribeDiskRequest;
import com.jdcloud.sdk.service.disk.model.DescribeDiskResponse;
import com.jdcloud.sdk.service.disk.client.DescribeDiskExecutor;
import com.jdcloud.sdk.service.disk.model.DescribeSnapshotRequest;
import com.jdcloud.sdk.service.disk.model.DescribeSnapshotResponse;
import com.jdcloud.sdk.service.disk.client.DescribeSnapshotExecutor;

/**
 * diskClient
 */
public class DiskClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.0";
    public final static String DefaultEndpoint = "disk.jdcloud-api.com";
    public final static String ServiceName = "disk";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private DiskClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 为指定云硬盘创建快照调用成功返回后，新生成的快照的状态为 creating
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws JdcloudSdkException {
        return new CreateSnapshotExecutor().client(this).execute(request);
    }

    /**
     * 从已有快照恢复一块云硬盘
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RestoreDiskResponse restoreDisk(RestoreDiskRequest request) throws JdcloudSdkException {
        return new RestoreDiskExecutor().client(this).execute(request);
    }

    /**
     * 查询云硬盘列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDisksResponse describeDisks(DescribeDisksRequest request) throws JdcloudSdkException {
        return new DescribeDisksExecutor().client(this).execute(request);
    }

    /**
     * 查询云硬盘快照列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws JdcloudSdkException {
        return new DescribeSnapshotsExecutor().client(this).execute(request);
    }

    /**
     * 云硬盘信息详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDiskResponse describeDisk(DescribeDiskRequest request) throws JdcloudSdkException {
        return new DescribeDiskExecutor().client(this).execute(request);
    }

    /**
     * 云硬盘快照信息详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSnapshotResponse describeSnapshot(DescribeSnapshotRequest request) throws JdcloudSdkException {
        return new DescribeSnapshotExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public DiskClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private DiskClient diskClient;

        public DefaultBuilder() {
            diskClient = new DiskClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            diskClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            diskClient.httpRequestConfig = config;
            return this;
        }

        public DiskClient build() throws JdcloudSdkException {

            if (diskClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                diskClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (diskClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("DiskClient build error: jdcloud credentials provider not set");
                }
            }
            if (diskClient.httpRequestConfig == null) {
                diskClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (diskClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("DiskClient build error: http request config not set");
                }
            }
            return diskClient;
        }

        public Builder environment(Environment environment) {
            diskClient.environment = environment;
            return this;
        }
    }
}
