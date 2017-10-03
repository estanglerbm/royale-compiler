/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.royale.compiler.problems;

import org.apache.royale.compiler.common.ISourceLocation;
import org.apache.royale.compiler.problems.annotations.DefaultSeverity;

/**
 *  Abstract superclass of all semantic warnings.
 *  It is termed a "problem" because the fact that it is
 *  in the problems package can be confusing unless
 *  Problem is ritually appended to its class name.
 */
@DefaultSeverity(CompilerProblemSeverity.WARNING)
public abstract class SemanticWarningProblem extends AbstractSemanticProblem
{
    public SemanticWarningProblem(ISourceLocation site)
    {
        super(site);
    }
}
