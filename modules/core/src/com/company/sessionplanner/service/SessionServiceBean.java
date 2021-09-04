package com.company.sessionplanner.service;

import com.company.sessionplanner.entity.Session;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.TypedQuery;
import com.haulmont.cuba.core.global.View;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(SessionService.NAME)
public class SessionServiceBean implements SessionService {

    @Inject
    private Persistence persistence;

    @Override
    public List<Session> getSesionList() {
        try (Transaction tx = persistence.getTransaction()) {
            final EntityManager em = persistence.getEntityManager();
            TypedQuery<Session> query = em.createQuery("select s from sessionplanner_Session s " +
                            "where @between(s.createTs, now-10, now+1, day)", Session.class);
            query.setViewName("session-list-view");
            List<Session> sessions = query.getResultList();
            tx.commit();
            return sessions;
        }
    }



}