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
 * 云部署
 * 云部署应用、部署组、部署任务相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.deploy.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.deploy.model.DescribeAppRequest;
import com.jdcloud.sdk.service.deploy.model.DescribeAppResponse;
import com.jdcloud.sdk.service.deploy.client.DescribeAppExecutor;
import com.jdcloud.sdk.service.deploy.model.CreateDeployRequest;
import com.jdcloud.sdk.service.deploy.model.CreateDeployResponse;
import com.jdcloud.sdk.service.deploy.client.CreateDeployExecutor;
import com.jdcloud.sdk.service.deploy.model.DescribeDeployRequest;
import com.jdcloud.sdk.service.deploy.model.DescribeDeployResponse;
import com.jdcloud.sdk.service.deploy.client.DescribeDeployExecutor;
import com.jdcloud.sdk.service.deploy.model.DescribeAppsRequest;
import com.jdcloud.sdk.service.deploy.model.DescribeAppsResponse;
import com.jdcloud.sdk.service.deploy.client.DescribeAppsExecutor;
import com.jdcloud.sdk.service.deploy.model.DescribeGroupsRequest;
import com.jdcloud.sdk.service.deploy.model.DescribeGroupsResponse;
import com.jdcloud.sdk.service.deploy.client.DescribeGroupsExecutor;
import com.jdcloud.sdk.service.deploy.model.DescribeGroupRequest;
import com.jdcloud.sdk.service.deploy.model.DescribeGroupResponse;
import com.jdcloud.sdk.service.deploy.client.DescribeGroupExecutor;

/**
 * deployClient
 */
public class DeployClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.10";
    public final static String DefaultEndpoint = "deploy.jdcloud-api.com";
    public final static String ServiceName = "deploy";
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

    private DeployClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询一个应用的信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAppResponse describeApp(DescribeAppRequest request) throws JdcloudSdkException {
        return new DescribeAppExecutor().client(this).execute(request);
    }

    /**
     * 创建部署任务
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateDeployResponse createDeploy(CreateDeployRequest request) throws JdcloudSdkException {
        return new CreateDeployExecutor().client(this).execute(request);
    }

    /**
     * 查询一个部署任务详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDeployResponse describeDeploy(DescribeDeployRequest request) throws JdcloudSdkException {
        return new DescribeDeployExecutor().client(this).execute(request);
    }

    /**
     * 批量查询应用的信息，此接口支持分页查询，默认每页20条
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAppsResponse describeApps(DescribeAppsRequest request) throws JdcloudSdkException {
        return new DescribeAppsExecutor().client(this).execute(request);
    }

    /**
     * 批量查询部署组的信息，此接口支持分页查询，默认每页20条
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeGroupsResponse describeGroups(DescribeGroupsRequest request) throws JdcloudSdkException {
        return new DescribeGroupsExecutor().client(this).execute(request);
    }

    /**
     * 查询一个部署组的信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeGroupResponse describeGroup(DescribeGroupRequest request) throws JdcloudSdkException {
        return new DescribeGroupExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public DeployClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private DeployClient deployClient;

        public DefaultBuilder() {
            deployClient = new DeployClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            deployClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            deployClient.httpRequestConfig = config;
            return this;
        }

        public DeployClient build() throws JdcloudSdkException {

            if (deployClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                deployClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (deployClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("DeployClient build error: jdcloud credentials provider not set");
                }
            }
            if (deployClient.httpRequestConfig == null) {
                deployClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (deployClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("DeployClient build error: http request config not set");
                }
            }
            return deployClient;
        }

        public Builder environment(Environment environment) {
            deployClient.environment = environment;
            return this;
        }
    }
}