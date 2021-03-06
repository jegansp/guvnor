/*
 * Copyright 2012 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.drools.ide.common.client.modeldriven.dt52.auditlog;

import org.drools.ide.common.client.modeldriven.dt52.DTCellValue52;
import org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionInsertFactCol52;

/**
 * Details of a Limited Entry ActionInsertFact column
 */
public class LimitedEntryActionInsertFactColumnDetails extends ActionInsertFactColumnDetails {

    private static final long serialVersionUID = -177913089353678680L;

    private DTCellValue52     value;

    public LimitedEntryActionInsertFactColumnDetails(final LimitedEntryActionInsertFactCol52 column) {
        super( column );
        this.value = column.getValue();
    }

    public DTCellValue52 getValue() {
        return value;
    }

}
