package com.company.sessionplanner.service;

import com.company.sessionplanner.entity.Session;

import java.util.List;

public interface SessionService {
    String NAME = "sessionplanner_SessionService";

     List<Session> getSesionList();
}