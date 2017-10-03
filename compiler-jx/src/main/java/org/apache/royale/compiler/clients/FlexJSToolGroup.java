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

package org.apache.flex.compiler.clients;

import org.apache.flex.compiler.internal.driver.mxml.flexjs.MXMLRoyaleASDocDITABackend;
import org.apache.flex.tools.AbstractFlexToolGroup;

/**
 * Created by christoferdutz on 10.11.14.
 */
public class RoyaleToolGroup extends AbstractFlexToolGroup {

    public RoyaleToolGroup() {
        super("Royale");
        addFlexTool(new COMPJSC());
        addFlexTool(new MXMLJSC());
        addFlexTool(new ASDOCJSC(new MXMLRoyaleASDocDITABackend()));
        addFlexTool(new EXTERNC());
    }

}
