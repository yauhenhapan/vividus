/*
 * Copyright 2019-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.vividus.visual.eyes.model;

import java.util.List;

import com.applitools.eyes.TestResults;

import org.vividus.visual.model.AbstractVisualCheck;
import org.vividus.visual.model.VisualCheckResult;

public class UfgApplitoolsVisualCheckResult extends VisualCheckResult
{
    private List<TestResults> testResults;

    public UfgApplitoolsVisualCheckResult(AbstractVisualCheck visualCheck)
    {
        super(visualCheck);
    }

    public List<TestResults> getTestResults()
    {
        return testResults;
    }

    public void setTestResults(List<TestResults> testResults)
    {
        this.testResults = testResults;
    }
}