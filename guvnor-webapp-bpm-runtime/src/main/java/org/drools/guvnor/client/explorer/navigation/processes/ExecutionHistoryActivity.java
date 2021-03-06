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

package org.drools.guvnor.client.explorer.navigation.processes;

import com.google.gwt.event.shared.EventBus;
import com.mvc4g.client.Controller;
import org.drools.guvnor.client.explorer.AcceptItem;
import org.drools.guvnor.client.messages.ConstantsCore;
import org.drools.guvnor.client.util.Activity;
import org.jboss.bpm.console.client.ExecutionHistoryView;

public class ExecutionHistoryActivity extends Activity {

    private Controller controller;

    public ExecutionHistoryActivity(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void start(AcceptItem tabbedPanel, EventBus eventBus) {
        ExecutionHistoryView executionHistoryView = new ExecutionHistoryView();
        executionHistoryView.setController(controller);
        tabbedPanel.add(ConstantsCore.INSTANCE.ExecutionHistory(), executionHistoryView);
    }
}
