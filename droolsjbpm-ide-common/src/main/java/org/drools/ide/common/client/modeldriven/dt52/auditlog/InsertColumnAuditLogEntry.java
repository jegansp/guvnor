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

import org.drools.ide.common.client.modeldriven.auditlog.AuditLogEntry;
import org.drools.ide.common.client.modeldriven.dt52.ActionInsertFactCol52;
import org.drools.ide.common.client.modeldriven.dt52.ActionSetFieldCol52;
import org.drools.ide.common.client.modeldriven.dt52.AttributeCol52;
import org.drools.ide.common.client.modeldriven.dt52.BRLActionColumn;
import org.drools.ide.common.client.modeldriven.dt52.BRLConditionColumn;
import org.drools.ide.common.client.modeldriven.dt52.BaseColumn;
import org.drools.ide.common.client.modeldriven.dt52.ConditionCol52;
import org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionInsertFactCol52;
import org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionSetFieldCol52;
import org.drools.ide.common.client.modeldriven.dt52.LimitedEntryConditionCol52;
import org.drools.ide.common.client.modeldriven.dt52.MetadataCol52;

/**
 * An Audit Event for when a column is inserted
 */
public class InsertColumnAuditLogEntry extends AuditLogEntry {

    private static final long serialVersionUID = -7525789306354393393L;

    private ColumnDetails     details;

    public InsertColumnAuditLogEntry() {
    }

    public InsertColumnAuditLogEntry(final BaseColumn column,
                                     final String userName) {
        super( userName );
        if ( column instanceof MetadataCol52 ) {
            this.details = new MetadataColumnDetails( (MetadataCol52) column );
        } else if ( column instanceof AttributeCol52 ) {
            this.details = new AttributeColumnDetails( (AttributeCol52) column );
        } else if ( column instanceof BRLConditionColumn ) {
            this.details = new ColumnDetails( column );
        } else if ( column instanceof ConditionCol52 ) {
            this.details = new ConditionColumnDetails( (ConditionCol52) column );
        } else if ( column instanceof LimitedEntryConditionCol52 ) {
            this.details = new LimitedEntryConditionColumnDetails( (LimitedEntryConditionCol52) column );
        } else if ( column instanceof BRLActionColumn ) {
            this.details = new ColumnDetails( column );
        } else if ( column instanceof ActionInsertFactCol52 ) {
            this.details = new ActionInsertFactColumnDetails( (ActionInsertFactCol52) column );
        } else if ( column instanceof LimitedEntryActionInsertFactCol52 ) {
            this.details = new LimitedEntryActionInsertFactColumnDetails( (LimitedEntryActionInsertFactCol52) column );
        } else if ( column instanceof ActionSetFieldCol52 ) {
            this.details = new ActionSetFieldColumnDetails( (ActionSetFieldCol52) column );
        } else if ( column instanceof LimitedEntryActionSetFieldCol52 ) {
            this.details = new LimitedEntryActionSetFieldColumnDetails( (LimitedEntryActionSetFieldCol52) column );
        } else {
            this.details = new ColumnDetails( column );
        }
    }

    public ColumnDetails getDetails() {
        return details;
    }

}
