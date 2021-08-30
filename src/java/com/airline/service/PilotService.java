/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airline.service;

import com.airline.models.Flight;
import com.airline.models.Pilot;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Muhamed S. NasR
 */
@Stateless
public class PilotService {

    @PersistenceContext(unitName = "airline")
    EntityManager em;

    public void addPilot(Pilot p) {

        em.persist(p);

    }

    public void addNewPilotToFlight(Pilot p, int flightId) {



        em.persist(p);

        TypedQuery<Flight> fQuery = (TypedQuery<Flight>) em.createNamedQuery("Flight.findById");

        fQuery.setParameter("id", flightId);

        Flight f = fQuery.getSingleResult();


        List<Pilot> pList = f.getPilots();
        pList.add(p);

        f.setPilots(pList);

        p.setFlightForPilot(f);


    }
}
