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

public final class ClassesMappedToSameRemoteAliasProblem extends CompilerProblem
{
    public static final String DESCRIPTION =
        "A mapping for '${existingClassName}' to the remote class alias '${alias}' was found while processing class '${className}'. Flex now generates code to check if an alias has already been registered. When deserializing remote data an alias can only map to a single class.";

    public static final int errorCode = 1316;
    /**
     *  Warn users with [RemoteClass] metadata that ends up mapping more than one class to the same alias. 
     */
    public ClassesMappedToSameRemoteAliasProblem(String className, String existingClassName, String alias)
    {
        super();
        this.className = className;
        this.existingClassName = existingClassName;
        this.alias = alias;
    }

    public final String className;
    public final String existingClassName;
    public final String alias;

}
