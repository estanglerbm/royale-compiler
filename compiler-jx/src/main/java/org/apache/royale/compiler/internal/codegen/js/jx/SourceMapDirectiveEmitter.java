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

package org.apache.flex.compiler.internal.codegen.js.jx;

import org.apache.flex.compiler.clients.JSConfiguration;
import org.apache.flex.compiler.codegen.ISubEmitter;
import org.apache.flex.compiler.codegen.js.IJSEmitter;
import org.apache.flex.compiler.internal.codegen.js.JSSubEmitter;
import org.apache.flex.compiler.internal.projects.RoyaleProject;
import org.apache.flex.compiler.tree.as.ITypeNode;
import org.apache.flex.compiler.tree.mxml.IMXMLDocumentNode;
import org.apache.flex.compiler.visitor.IBlockWalker;

public class SourceMapDirectiveEmitter extends JSSubEmitter implements
        ISubEmitter<ITypeNode>
{
    private static final String SOURCE_MAP_PREFIX = "//# sourceMappingURL=./";
    private static final String EXTENSION_JS = ".js";
    private static final String EXTENSION_MAP = ".map";
    
    public SourceMapDirectiveEmitter(IJSEmitter emitter)
    {
        super(emitter);
    }

    @Override
    public void emit(ITypeNode node)
    {
        boolean sourceMap = false;

        IBlockWalker walker = getWalker();
        RoyaleProject project = (RoyaleProject) walker.getProject();
        if (project != null)
        {
            JSConfiguration config = project.config;
            if (config != null)
            {
                sourceMap = config.getSourceMap();
            }
        }

        if (sourceMap)
        {
            String name = node.getName() + EXTENSION_JS;
            if (node instanceof IMXMLDocumentNode)
            {
                IMXMLDocumentNode mxmlNode = (IMXMLDocumentNode) node;
                name = mxmlNode.getFileNode().getName() + EXTENSION_JS;
            }
            writeNewline();
            write(SOURCE_MAP_PREFIX + name + EXTENSION_MAP);
        }
    }
}
