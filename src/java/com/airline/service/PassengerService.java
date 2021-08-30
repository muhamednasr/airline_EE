package com.airline.service;

import com.airline.models.Flight;
import com.airline.models.Passengers;
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
public class PassengerService {

    @PersistenceContext(unitName = "airline")
    private EntityManager em;

    public Passengers addPassenger(Passengers p) {

        em.persist(p);

        return p;

    }

    public List<Passengers> getPassengers() {


        TypedQuery<Passengers> query = (TypedQuery<Passengers>) em.createQuery("SELECT p from Passengers p");

        List<Passengers> plist = query.getResultList();

        if (plist == null) {

            System.out.println("p list is null  //the passengerService// ");


        } else {
            System.out.println("plist not null  //the passengerService// ");
        }



        return plist;
    }

    public Passengers getPassenger(Integer passengerId) {

        TypedQuery<Passengers> pquery = (TypedQuery<Passengers>) em.createNamedQuery("Passenger.findById");

        pquery.setParameter("id", passengerId);

        Passengers p = pquery.getSingleResult();

        return p;

    }

    public void addFlightTicketToPassenger(String pid, String fid) {




        TypedQuery<Flight> fQuery = (TypedQuery<Flight>) em.createNamedQuery("Flight.findById");

        fQuery.setParameter("id", Integer.parseInt(fid));

        Flight f = fQuery.getSingleResult();


        TypedQuery<Passengers> pquery = (TypedQuery<Passengers>) em.createNamedQuery("Passenger.findById");

        pquery.setParameter("id", Integer.parseInt(pid));

        Passengers p = pquery.getSingleResult();




        List<Passengers> pList = f.getPassengers();
        pList.add(p);

        f.setPassengers(pList);

        p.getFlights().add(f);


    }

    public Passengers updatePassenger(Integer passengerId, Passengers pUpdated) {

        Passengers p = em.find(Passengers.class, passengerId);

        if (p == null) {

            return null;

        }

        if (pUpdated.getFirstName() != null) {

            p.setFirstName(pUpdated.getFirstName());

        }

        if (pUpdated.getLastName() != null) {

            p.setLastName(pUpdated.getLastName());

        }

        if (pUpdated.getDob() != null) {

            p.setDob(pUpdated.getDob());

        }

        if (pUpdated.getGender() != null) {

            p.setGender(pUpdated.getGender());

        }


        return null;

    }
}
