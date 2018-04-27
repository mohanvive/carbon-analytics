/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.siddhi.editor.core.util.designview.beans.configs.siddhielements.query.input.OLD_REMOVE.sequence.event.countingsequence;

// TODO: 4/4/18 class comment
public class CountingPatternCountingSequence extends CountingSequenceConfig {
    private String value;

    public CountingPatternCountingSequence() {
        super("countingPattern"); // TODO: 4/15/18 constant
        value = "";
    }

    public CountingPatternCountingSequence(String value) {
        super("countingPattern"); // TODO: 4/15/18 constant
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
