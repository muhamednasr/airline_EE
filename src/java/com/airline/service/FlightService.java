package com.airline.service;

import com.airline.models.Airplane;
import com.airline.models.Flight;
import com.airline.models.Passengers;
import com.airline.models.Pilot;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;

import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Muhamed S. NasR
 */
@Stateless
public class FlightService {

    @PersistenceContext(unitName = "airline")
    EntityManager em;

    public void addFlight(Flight f, Airplane a) {

        // em.persist(a);  -- propagated and persisted from flight and saved automatically.
        em.persist(f);

    }

    public void addPilotToFlight(String pilotId, String flightId) {



        TypedQuery<Flight> fQuery = (TypedQuery<Flight>) em.createNamedQuery("Flight.findById");

        fQuery.setParameter("id", Integer.parseInt(flightId));

        Flight f = fQuery.getSingleResult();

        TypedQuery<Pilot> pQuery = (TypedQuery<Pilot>) em.createNamedQuery("Pilot.findById");

        pQuery.setParameter("id", Integer.parseInt(pilotId));
        Pilot p = pQuery.getSingleResult();


        List<Pilot> pList = f.getPilots();
        pList.add(p);

        f.setPilots(pList);

        p.setFlightForPilot(f);


    }

    public List<Flight> getFlightP() {


        TypedQuery<Flight> query = (TypedQuery<Flight>) em.createQuery("Select f from Flight f");

        List<Flight> result = query.getResultList();

         if(result ==null){
        
            System.out.println("flist is null  //the flightService// ");
        
        
        }
        else
        { System.out.println("flist not null  //the flightService// ");}
        
        
        return result;


    }

    public Flight getFlight(Integer flightId) {


        TypedQuery<Flight> fQuery = (TypedQuery<Flight>) em.createNamedQuery("Flight.findById");

        fQuery.setParameter("id", flightId);
        

        Flight f = null;

        try {

            f = fQuery.getSingleResult();

        } catch (Exception e) {

            return null;
        }

        return f;

    }

    public void addPassengerToFlight(String passsengerid, String flightid) {


        TypedQuery<Flight> fQuery = (TypedQuery<Flight>) em.createNamedQuery("Flight.findById");

        fQuery.setParameter("id", Integer.parseInt(flightid));

        Flight f = fQuery.getSingleResult();


        TypedQuery<Passengers> pquery = (TypedQuery<Passengers>) em.createNamedQuery("Passenger.findById");

        pquery.setParameter("id", Integer.parseInt(passsengerid));

        Passengers p = pquery.getSingleResult();


        f.getPassengers().add(p);

        p.getFlights().add(f);

    }
}
