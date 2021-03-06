/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.guvnor.shared.api;

import java.io.Serializable;


/**
 * This is the marker interface for portable Ajaxy type objects.
 * This is replaced in the BRMS with a GWT specific one, and only used here so the RuleModel
 * can compile. It does nothing, and is strictly a marker interface only.
 */
public interface PortableObject
        extends Serializable {

}
