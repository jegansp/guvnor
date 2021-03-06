/*
 * Copyright 2011 JBoss Inc
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
package org.drools.guvnor.client.asseteditor.drools.modeldriven.ui;

import org.drools.guvnor.client.common.AbstractRestrictedEntryTextBox;
import org.drools.guvnor.client.resources.OperatorsCss;
import org.drools.guvnor.client.resources.OperatorsResource;
import org.drools.ide.common.client.modeldriven.brl.HasParameterizedOperator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;

/**
 * A TextBox to handle restricted entry specific to CEP parameters
 */
public abstract class AbstractCEPRestrictedEntryTextBox extends AbstractRestrictedEntryTextBox {

    private static final OperatorsResource resources = GWT.create( OperatorsResource.class );
    private static final OperatorsCss      css       = resources.operatorsCss();

    protected HasParameterizedOperator     hop;

    public AbstractCEPRestrictedEntryTextBox(HasParameterizedOperator hop,
                                             int index) {
        this.hop = hop;
        setup( index );
    }

    private void setup(final int index) {
        this.setStyleName( css.parameter() );
        this.addChangeHandler( new ChangeHandler() {

            public void onChange(ChangeEvent event) {
                hop.setParameter( Integer.toString( index ),
                                  getText() );
            }

        } );
    }

}
