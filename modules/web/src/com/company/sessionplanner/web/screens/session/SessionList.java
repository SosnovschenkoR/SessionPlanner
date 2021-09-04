package com.company.sessionplanner.web.screens.session;

import com.company.sessionplanner.entity.Session;
import com.company.sessionplanner.service.SessionService;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.List;

@UiController("sessionplanner_SessionList")
@UiDescriptor("session-list.xml")
public class SessionList extends Screen {
    @Inject
    private CollectionContainer<Session> sessionsListDc;

    @Inject
    private SessionService sessionService;

    @Subscribe
    public void onInit(InitEvent event) {
        refreshData();
    }

    private void refreshData() {
        List<Session> sesionList = sessionService.getSesionList();
        sessionsListDc.setItems(sesionList);
    }

    @Subscribe("refreshBtn")
    public void onRefreshBtnClick(Button.ClickEvent event) {
        refreshData();
    }


}