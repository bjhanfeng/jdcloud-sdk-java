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

package com.jdcloud.sdk.service.cdn.model;


/**
 * codeTypeDetailItem
 */
public class CodeTypeDetailItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * code
     */
    private String code;

    /**
     * count
     */
    private Long count;

    /**
     * rank
     */
    private Integer rank;

    /**
     * percent
     */
    private String percent;


    /**
     * get code
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set code
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * get count
     *
     * @return
     */
    public Long getCount() {
        return count;
    }

    /**
     * set count
     *
     * @param count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * get rank
     *
     * @return
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * set rank
     *
     * @param rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * get percent
     *
     * @return
     */
    public String getPercent() {
        return percent;
    }

    /**
     * set percent
     *
     * @param percent
     */
    public void setPercent(String percent) {
        this.percent = percent;
    }


    /**
     * set code
     *
     * @param code
     */
    public CodeTypeDetailItem code(String code) {
        this.code = code;
        return this;
    }

    /**
     * set count
     *
     * @param count
     */
    public CodeTypeDetailItem count(Long count) {
        this.count = count;
        return this;
    }

    /**
     * set rank
     *
     * @param rank
     */
    public CodeTypeDetailItem rank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * set percent
     *
     * @param percent
     */
    public CodeTypeDetailItem percent(String percent) {
        this.percent = percent;
        return this;
    }


}