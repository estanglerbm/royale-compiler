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

import org.apache.royale.compiler.problems.annotations.DefaultSeverity;
import org.apache.royale.compiler.tree.as.IASNode;

/**
 * Problem generated by usage of <code>Date(...)</code>.
 */
@DefaultSeverity(CompilerProblemSeverity.WARNING)
public final class DateCastProblem extends SemanticWarningProblem
{
    public static final String DESCRIPTION =
        "'${DATE}(...)' is not a cast. " +
        "It ignores its arguments and returns a ${STRING} value equal to '${NEW} ${DATE}().${TOSTRING}()'. " +
        "To cast a value to type ${DATE} use 'x ${AS} ${DATE}' instead of '${DATE}(x)'.";

    public static final int warningCode = 5039;

    public DateCastProblem(IASNode site)
    {
        super(site);
    }
    
    // Prevent these from being localized.
    public final String AS = "as";
    public final String DATE = "Date";
    public final String NEW = "new";
    public final String STRING = "String";
    public final String TOSTRING = "toString";
}
