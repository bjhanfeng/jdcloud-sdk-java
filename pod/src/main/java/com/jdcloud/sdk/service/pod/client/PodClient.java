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
 * pod
 * pod 服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.pod.model.DescribeQuotaRequest;
import com.jdcloud.sdk.service.pod.model.DescribeQuotaResponse;
import com.jdcloud.sdk.service.pod.client.DescribeQuotaExecutor;
import com.jdcloud.sdk.service.pod.model.DescribeSecretsRequest;
import com.jdcloud.sdk.service.pod.model.DescribeSecretsResponse;
import com.jdcloud.sdk.service.pod.client.DescribeSecretsExecutor;
import com.jdcloud.sdk.service.pod.model.CreateSecretRequest;
import com.jdcloud.sdk.service.pod.model.CreateSecretResponse;
import com.jdcloud.sdk.service.pod.client.CreateSecretExecutor;
import com.jdcloud.sdk.service.pod.model.DescribeSecretRequest;
import com.jdcloud.sdk.service.pod.model.DescribeSecretResponse;
import com.jdcloud.sdk.service.pod.client.DescribeSecretExecutor;
import com.jdcloud.sdk.service.pod.model.DisassociateElasticIpRequest;
import com.jdcloud.sdk.service.pod.model.DisassociateElasticIpResponse;
import com.jdcloud.sdk.service.pod.client.DisassociateElasticIpExecutor;
import com.jdcloud.sdk.service.pod.model.GetContainerLogsRequest;
import com.jdcloud.sdk.service.pod.model.GetContainerLogsResponse;
import com.jdcloud.sdk.service.pod.client.GetContainerLogsExecutor;
import com.jdcloud.sdk.service.pod.model.ResizeTTYRequest;
import com.jdcloud.sdk.service.pod.model.ResizeTTYResponse;
import com.jdcloud.sdk.service.pod.client.ResizeTTYExecutor;
import com.jdcloud.sdk.service.pod.model.AttachRequest;
import com.jdcloud.sdk.service.pod.model.AttachResponse;
import com.jdcloud.sdk.service.pod.client.AttachExecutor;
import com.jdcloud.sdk.service.pod.model.ModifyPodAttributeRequest;
import com.jdcloud.sdk.service.pod.model.ModifyPodAttributeResponse;
import com.jdcloud.sdk.service.pod.client.ModifyPodAttributeExecutor;
import com.jdcloud.sdk.service.pod.model.DeletePodRequest;
import com.jdcloud.sdk.service.pod.model.DeletePodResponse;
import com.jdcloud.sdk.service.pod.client.DeletePodExecutor;
import com.jdcloud.sdk.service.pod.model.ExecStartRequest;
import com.jdcloud.sdk.service.pod.model.ExecStartResponse;
import com.jdcloud.sdk.service.pod.client.ExecStartExecutor;
import com.jdcloud.sdk.service.pod.model.AssociateElasticIpRequest;
import com.jdcloud.sdk.service.pod.model.AssociateElasticIpResponse;
import com.jdcloud.sdk.service.pod.client.AssociateElasticIpExecutor;
import com.jdcloud.sdk.service.pod.model.StartPodRequest;
import com.jdcloud.sdk.service.pod.model.StartPodResponse;
import com.jdcloud.sdk.service.pod.client.StartPodExecutor;
import com.jdcloud.sdk.service.pod.model.DescribePodsRequest;
import com.jdcloud.sdk.service.pod.model.DescribePodsResponse;
import com.jdcloud.sdk.service.pod.client.DescribePodsExecutor;
import com.jdcloud.sdk.service.pod.model.ExecGetExitCodeRequest;
import com.jdcloud.sdk.service.pod.model.ExecGetExitCodeResponse;
import com.jdcloud.sdk.service.pod.client.ExecGetExitCodeExecutor;
import com.jdcloud.sdk.service.pod.model.ExecCreateRequest;
import com.jdcloud.sdk.service.pod.model.ExecCreateResponse;
import com.jdcloud.sdk.service.pod.client.ExecCreateExecutor;
import com.jdcloud.sdk.service.pod.model.CreatePodsRequest;
import com.jdcloud.sdk.service.pod.model.CreatePodsResponse;
import com.jdcloud.sdk.service.pod.client.CreatePodsExecutor;
import com.jdcloud.sdk.service.pod.model.StopPodRequest;
import com.jdcloud.sdk.service.pod.model.StopPodResponse;
import com.jdcloud.sdk.service.pod.client.StopPodExecutor;
import com.jdcloud.sdk.service.pod.model.DescribePodRequest;
import com.jdcloud.sdk.service.pod.model.DescribePodResponse;
import com.jdcloud.sdk.service.pod.client.DescribePodExecutor;
import com.jdcloud.sdk.service.pod.model.DecribeContainerRequest;
import com.jdcloud.sdk.service.pod.model.DecribeContainerResponse;
import com.jdcloud.sdk.service.pod.client.DecribeContainerExecutor;
import com.jdcloud.sdk.service.pod.model.DeleteSecretRequest;
import com.jdcloud.sdk.service.pod.model.DeleteSecretResponse;
import com.jdcloud.sdk.service.pod.client.DeleteSecretExecutor;
import com.jdcloud.sdk.service.pod.model.CheckPodNameRequest;
import com.jdcloud.sdk.service.pod.model.CheckPodNameResponse;
import com.jdcloud.sdk.service.pod.client.CheckPodNameExecutor;

/**
 * podClient
 */
public class PodClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.10";
    public final static String DefaultEndpoint = "pod.jdcloud-api.com";
    public final static String ServiceName = "pod";
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

    private PodClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询资源的配额，支持：原生容器 pod 和 secret.

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeQuotaResponse describeQuota(DescribeQuotaRequest request) throws JdcloudSdkException {
        return new DescribeQuotaExecutor().client(this).execute(request);
    }

    /**
     * 查询 secret 列表。&lt;br&gt; 
此接口支持分页查询，默认每页20条。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSecretsResponse describeSecrets(DescribeSecretsRequest request) throws JdcloudSdkException {
        return new DescribeSecretsExecutor().client(this).execute(request);
    }

    /**
     * 创建一个 secret，用于存放镜像仓库机密相关信息。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) throws JdcloudSdkException {
        return new CreateSecretExecutor().client(this).execute(request);
    }

    /**
     * 查询单个 secret 详情

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSecretResponse describeSecret(DescribeSecretRequest request) throws JdcloudSdkException {
        return new DescribeSecretExecutor().client(this).execute(request);
    }

    /**
     * pod 解绑公网 IP，解绑的是主网卡、主内网 IP 对应的弹性 IP.

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisassociateElasticIpResponse disassociateElasticIp(DisassociateElasticIpRequest request) throws JdcloudSdkException {
        return new DisassociateElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 查询单个容器日志

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetContainerLogsResponse getContainerLogs(GetContainerLogsRequest request) throws JdcloudSdkException {
        return new GetContainerLogsExecutor().client(this).execute(request);
    }

    /**
     * 设置TTY大小
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ResizeTTYResponse resizeTTY(ResizeTTYRequest request) throws JdcloudSdkException {
        return new ResizeTTYExecutor().client(this).execute(request);
    }

    /**
     * 查询单个容器日志

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AttachResponse attach(AttachRequest request) throws JdcloudSdkException {
        return new AttachExecutor().client(this).execute(request);
    }

    /**
     * 修改 pod 的 名称 和 描述。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyPodAttributeResponse modifyPodAttribute(ModifyPodAttributeRequest request) throws JdcloudSdkException {
        return new ModifyPodAttributeExecutor().client(this).execute(request);
    }

    /**
     * pod 状态必须为 stopped、running 或 error状态。 &lt;br&gt;
按量付费的实例，如不主动删除将一直运行，不再使用的实例，可通过本接口主动停用。&lt;br&gt;
只能支持主动删除按量计费类型的实例。包年包月过期的 pod 也可以删除，其它的情况还请发工单系统。计费状态异常的容器无法删除。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeletePodResponse deletePod(DeletePodRequest request) throws JdcloudSdkException {
        return new DeletePodExecutor().client(this).execute(request);
    }

    /**
     * 执行exec，此接口需要升级Http协议到WebSocket
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ExecStartResponse execStart(ExecStartRequest request) throws JdcloudSdkException {
        return new ExecStartExecutor().client(this).execute(request);
    }

    /**
     * pod 绑定弹性公网 IP，绑定的是主网卡、主内网IP对应的弹性IP. &lt;br&gt;
一个 pod 只能绑定一个弹性公网 IP(主网卡)，若主网卡已存在弹性公网IP，会返回错误。&lt;br&gt;
如果是黑名单中的用户，会返回错误。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AssociateElasticIpResponse associateElasticIp(AssociateElasticIpRequest request) throws JdcloudSdkException {
        return new AssociateElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 启动处于关闭状态的单个 pod ，处在任务执行中的 pod 无法启动。&lt;br&gt;
pod 实例或其绑定的云盘已欠费时，容器将无法正常启动。&lt;br&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartPodResponse startPod(StartPodRequest request) throws JdcloudSdkException {
        return new StartPodExecutor().client(this).execute(request);
    }

    /**
     * 批量查询 pod 的详细信息&lt;br&gt;
此接口支持分页查询，默认每页20条。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribePodsResponse describePods(DescribePodsRequest request) throws JdcloudSdkException {
        return new DescribePodsExecutor().client(this).execute(request);
    }

    /**
     * 获取exec退出码
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ExecGetExitCodeResponse execGetExitCode(ExecGetExitCodeRequest request) throws JdcloudSdkException {
        return new ExecGetExitCodeExecutor().client(this).execute(request);
    }

    /**
     * 创建 exec

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ExecCreateResponse execCreate(ExecCreateRequest request) throws JdcloudSdkException {
        return new ExecCreateExecutor().client(this).execute(request);
    }

    /**
     * - 创建pod需要通过实名认证
- hostname规范
    - 支持两种方式：以标签方式书写或以完整主机名方式书写
    - 标签规范
        - 0-9，a-z(不分大小写)和-（减号），其他的都是无效的字符串
        - 不能以减号开始，也不能以减号结尾
        - 最小1个字符，最大63个字符
    - 完整的主机名由一系列标签与点连接组成
        - 标签与标签之间使用“.”(点)进行连接
        - 不能以“.”(点)开始，也不能以“.”(点)结尾
        - 整个主机名（包括标签以及分隔点“.”）最多有63个ASCII字符
    - 正则：&#x60;^([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9])(.([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]))*$&#x60;
- 网络配置
    - 指定主网卡配置信息
        - 必须指定subnetId
        - 可以指定elasticIp规格来约束创建的弹性IP，带宽取值范围[1-100]Mbps，步进1Mbps
        - 可以指定网卡的主IP(primaryIpAddress)和辅助IP(secondaryIpAddresses)，此时maxCount只能为1
        - 可以设置网卡的自动删除autoDelete属性，指明是否删除实例时自动删除网卡
        - 安全组securityGroup需与子网Subnet在同一个私有网络VPC内
        - 一个 pod 创建时必须指定一个安全组，至多指定5个安全组
        - 主网卡deviceIndex设置为1
- 存储
    - volume分为root volume和data volume，root volume的挂载目录是/，data volume的挂载目录可以随意指定
    - volume的底层存储介质当前只支持cloud类别，也就是云硬盘
    - root volume
        - root volume只能是cloud类别
        - 云硬盘类型可以选择ssd、premium-hdd
        - 磁盘大小
            - ssd：范围[10,100]GB，步长为10G
            - premium-hdd：范围[10,100]GB，步长为10G
        - 自动删除
            - 默认自动删除
        - 可以选择已存在的云硬盘
    - data volume
        - data volume当前只能选择cloud类别
        - 云硬盘类型可以选择ssd、premium-hdd
        - 磁盘大小
            - ssd：范围[20,1000]GB，步长为10G
            - premium-hdd：范围[20,3000]GB，步长为10G
        - 自动删除
            - 默认自动删除
        - 可以选择已存在的云硬盘
        - 可以从快照创建磁盘
- pod 容器日志
    - default：默认在本地分配10MB的存储空间，自动rotate
- 其他
    - 创建完成后，pod 状态为running
    - maxCount为最大努力，不保证一定能达到maxCount

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreatePodsResponse createPods(CreatePodsRequest request) throws JdcloudSdkException {
        return new CreatePodsExecutor().client(this).execute(request);
    }

    /**
     * 停止处于运行状态的单个实例，处于任务执行中的 pod 无法启动。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopPodResponse stopPod(StopPodRequest request) throws JdcloudSdkException {
        return new StopPodExecutor().client(this).execute(request);
    }

    /**
     * 查询一个 pod 的详细信息

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribePodResponse describePod(DescribePodRequest request) throws JdcloudSdkException {
        return new DescribePodExecutor().client(this).execute(request);
    }

    /**
     * 获取 pod 中某个容器的详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DecribeContainerResponse decribeContainer(DecribeContainerRequest request) throws JdcloudSdkException {
        return new DecribeContainerExecutor().client(this).execute(request);
    }

    /**
     * 删除单个 secret

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) throws JdcloudSdkException {
        return new DeleteSecretExecutor().client(this).execute(request);
    }

    /**
     * podName 是否符合命名规范，以及查询指定 podName 区域内是否已经存在。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CheckPodNameResponse checkPodName(CheckPodNameRequest request) throws JdcloudSdkException {
        return new CheckPodNameExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public PodClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private PodClient podClient;

        public DefaultBuilder() {
            podClient = new PodClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            podClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            podClient.httpRequestConfig = config;
            return this;
        }

        public PodClient build() throws JdcloudSdkException {

            if (podClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                podClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (podClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("PodClient build error: jdcloud credentials provider not set");
                }
            }
            if (podClient.httpRequestConfig == null) {
                podClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (podClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("PodClient build error: http request config not set");
                }
            }
            return podClient;
        }

        public Builder environment(Environment environment) {
            podClient.environment = environment;
            return this;
        }
    }
}
