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

package com.jdcloud.sdk.service.pod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * 重置 container 相关参数
 */
public class RebuildContainerSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 容器名称
     * Required:true
     */
    @Required
    private String containerName;

    /**
     * 容器执行命令，如果不指定默认是docker镜像的ENTRYPOINT。总长度256个字符。
     */
    private List<String> command;

    /**
     * 容器执行命令的参数，如果不指定默认是docker镜像的CMD。总长度2048个字符。
     */
    private List<String> args;

    /**
     * 容器执行的环境变量；如果和镜像中的环境变量Key相同，会覆盖镜像中的值。长度范围：[0-100]
     */
    private List<EnvSpec> env;

    /**
     * 镜像名称 &lt;/br&gt;
容器镜像名字。 nginx:latest。长度范围：[1-500]
1. Docker Hub官方镜像通过类似nginx, mysql/mysql-server的名字指定 &lt;/br&gt; 
2. repository长度最大256个字符，tag最大128个字符，registry最大255个字符 &lt;/br&gt; 

     * Required:true
     */
    @Required
    private String image;

    /**
     * 镜像仓库secret名字。如果目前不传，默认选择dockerHub镜像
     */
    private String secret;

    /**
     * 容器是否分配tty。默认不分配
     */
    private Boolean tty;

    /**
     * 容器的工作目录。如果不指定，默认是根目录（/）；必须是绝对路径；长度范围：[0-1024]
     */
    private String workingDir;

    /**
     * 容器存活探针配置
     */
    private ProbeSpec livenessProbe;

    /**
     * 容器服务就绪探针配置
     */
    private ProbeSpec readinessProbe;

    /**
     * 容器计算资源配置
     */
    private List<VolumeMount> volumeMounts;


    /**
     * get 容器名称
     *
     * @return
     */
    public String getContainerName() {
        return containerName;
    }

    /**
     * set 容器名称
     *
     * @param containerName
     */
    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * get 容器执行命令，如果不指定默认是docker镜像的ENTRYPOINT。总长度256个字符。
     *
     * @return
     */
    public List<String> getCommand() {
        return command;
    }

    /**
     * set 容器执行命令，如果不指定默认是docker镜像的ENTRYPOINT。总长度256个字符。
     *
     * @param command
     */
    public void setCommand(List<String> command) {
        this.command = command;
    }

    /**
     * get 容器执行命令的参数，如果不指定默认是docker镜像的CMD。总长度2048个字符。
     *
     * @return
     */
    public List<String> getArgs() {
        return args;
    }

    /**
     * set 容器执行命令的参数，如果不指定默认是docker镜像的CMD。总长度2048个字符。
     *
     * @param args
     */
    public void setArgs(List<String> args) {
        this.args = args;
    }

    /**
     * get 容器执行的环境变量；如果和镜像中的环境变量Key相同，会覆盖镜像中的值。长度范围：[0-100]
     *
     * @return
     */
    public List<EnvSpec> getEnv() {
        return env;
    }

    /**
     * set 容器执行的环境变量；如果和镜像中的环境变量Key相同，会覆盖镜像中的值。长度范围：[0-100]
     *
     * @param env
     */
    public void setEnv(List<EnvSpec> env) {
        this.env = env;
    }

    /**
     * get 镜像名称 &lt;/br&gt;
容器镜像名字。 nginx:latest。长度范围：[1-500]
1. Docker Hub官方镜像通过类似nginx, mysql/mysql-server的名字指定 &lt;/br&gt; 
2. repository长度最大256个字符，tag最大128个字符，registry最大255个字符 &lt;/br&gt; 

     *
     * @return
     */
    public String getImage() {
        return image;
    }

    /**
     * set 镜像名称 &lt;/br&gt;
容器镜像名字。 nginx:latest。长度范围：[1-500]
1. Docker Hub官方镜像通过类似nginx, mysql/mysql-server的名字指定 &lt;/br&gt; 
2. repository长度最大256个字符，tag最大128个字符，registry最大255个字符 &lt;/br&gt; 

     *
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * get 镜像仓库secret名字。如果目前不传，默认选择dockerHub镜像
     *
     * @return
     */
    public String getSecret() {
        return secret;
    }

    /**
     * set 镜像仓库secret名字。如果目前不传，默认选择dockerHub镜像
     *
     * @param secret
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * get 容器是否分配tty。默认不分配
     *
     * @return
     */
    public Boolean getTty() {
        return tty;
    }

    /**
     * set 容器是否分配tty。默认不分配
     *
     * @param tty
     */
    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    /**
     * get 容器的工作目录。如果不指定，默认是根目录（/）；必须是绝对路径；长度范围：[0-1024]
     *
     * @return
     */
    public String getWorkingDir() {
        return workingDir;
    }

    /**
     * set 容器的工作目录。如果不指定，默认是根目录（/）；必须是绝对路径；长度范围：[0-1024]
     *
     * @param workingDir
     */
    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    /**
     * get 容器存活探针配置
     *
     * @return
     */
    public ProbeSpec getLivenessProbe() {
        return livenessProbe;
    }

    /**
     * set 容器存活探针配置
     *
     * @param livenessProbe
     */
    public void setLivenessProbe(ProbeSpec livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    /**
     * get 容器服务就绪探针配置
     *
     * @return
     */
    public ProbeSpec getReadinessProbe() {
        return readinessProbe;
    }

    /**
     * set 容器服务就绪探针配置
     *
     * @param readinessProbe
     */
    public void setReadinessProbe(ProbeSpec readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    /**
     * get 容器计算资源配置
     *
     * @return
     */
    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * set 容器计算资源配置
     *
     * @param volumeMounts
     */
    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }


    /**
     * set 容器名称
     *
     * @param containerName
     */
    public RebuildContainerSpec containerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * set 容器执行命令，如果不指定默认是docker镜像的ENTRYPOINT。总长度256个字符。
     *
     * @param command
     */
    public RebuildContainerSpec command(List<String> command) {
        this.command = command;
        return this;
    }

    /**
     * set 容器执行命令的参数，如果不指定默认是docker镜像的CMD。总长度2048个字符。
     *
     * @param args
     */
    public RebuildContainerSpec args(List<String> args) {
        this.args = args;
        return this;
    }

    /**
     * set 容器执行的环境变量；如果和镜像中的环境变量Key相同，会覆盖镜像中的值。长度范围：[0-100]
     *
     * @param env
     */
    public RebuildContainerSpec env(List<EnvSpec> env) {
        this.env = env;
        return this;
    }

    /**
     * set 镜像名称 &lt;/br&gt;
容器镜像名字。 nginx:latest。长度范围：[1-500]
1. Docker Hub官方镜像通过类似nginx, mysql/mysql-server的名字指定 &lt;/br&gt; 
2. repository长度最大256个字符，tag最大128个字符，registry最大255个字符 &lt;/br&gt; 

     *
     * @param image
     */
    public RebuildContainerSpec image(String image) {
        this.image = image;
        return this;
    }

    /**
     * set 镜像仓库secret名字。如果目前不传，默认选择dockerHub镜像
     *
     * @param secret
     */
    public RebuildContainerSpec secret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * set 容器是否分配tty。默认不分配
     *
     * @param tty
     */
    public RebuildContainerSpec tty(Boolean tty) {
        this.tty = tty;
        return this;
    }

    /**
     * set 容器的工作目录。如果不指定，默认是根目录（/）；必须是绝对路径；长度范围：[0-1024]
     *
     * @param workingDir
     */
    public RebuildContainerSpec workingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * set 容器存活探针配置
     *
     * @param livenessProbe
     */
    public RebuildContainerSpec livenessProbe(ProbeSpec livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    /**
     * set 容器服务就绪探针配置
     *
     * @param readinessProbe
     */
    public RebuildContainerSpec readinessProbe(ProbeSpec readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    /**
     * set 容器计算资源配置
     *
     * @param volumeMounts
     */
    public RebuildContainerSpec volumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }


    /**
     * add item to 容器执行命令，如果不指定默认是docker镜像的ENTRYPOINT。总长度256个字符。
     *
     * @param command
     */
    public void addCommand(String command) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(command);
    }

    /**
     * add item to 容器执行命令的参数，如果不指定默认是docker镜像的CMD。总长度2048个字符。
     *
     * @param arg
     */
    public void addArg(String arg) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(arg);
    }

    /**
     * add item to 容器执行的环境变量；如果和镜像中的环境变量Key相同，会覆盖镜像中的值。长度范围：[0-100]
     *
     * @param env
     */
    public void addEnv(EnvSpec env) {
        if (this.env == null) {
            this.env = new ArrayList<>();
        }
        this.env.add(env);
    }

    /**
     * add item to 容器计算资源配置
     *
     * @param volumeMount
     */
    public void addVolumeMount(VolumeMount volumeMount) {
        if (this.volumeMounts == null) {
            this.volumeMounts = new ArrayList<>();
        }
        this.volumeMounts.add(volumeMount);
    }

}