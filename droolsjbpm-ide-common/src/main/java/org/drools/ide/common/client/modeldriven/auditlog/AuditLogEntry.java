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
package org.drools.ide.common.client.modeldriven.auditlog;

import java.util.Date;

import org.drools.guvnor.shared.api.PortableObject;

/**
 * An entry in an Audit Log
 */
public abstract class AuditLogEntry
    implements
    PortableObject {

    private static final long serialVersionUID = -6751253344147726552L;

    private Date              dateOfEntry;
    private String            userName;
    private String            userComment;
    private boolean           isDeleted;

    public AuditLogEntry() {
    }

    public AuditLogEntry(final String userName) {
        this.dateOfEntry = new Date();
        this.userComment = "";
        this.userName = userName;
        this.isDeleted = false;
    }

    public Date getDateOfEntry() {
        return new Date( dateOfEntry.getTime() );
    }

    public String getUserComment() {
        return userComment;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

}
